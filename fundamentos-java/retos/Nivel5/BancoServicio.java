package Nivel5;

import java.util.*;

public class BancoServicio {
    private static int intentos = 0;

    public static void main(String[] args) {
        Usuario usuarioRegistrado = new Usuario("Admin", "admin", "admin1234");
        Cuenta cuentaRegistrada = new Cuenta(1, 0, "Corriente", usuarioRegistrado);
        String loginIngresado = "admin";
        String passwordIngresado = "admin1234.";

        while (intentos < 3) {
            if (validarFormatoLogin("admin", "admin1234.")) {
                if (validarLogin(usuarioRegistrado, loginIngresado, passwordIngresado)) {
                    System.out.println("Inicio Exitoso");
                    break;
                }
            }
        }

    }

    public static boolean validarLogin(Usuario usuario, String loginIngresado, String passwordIngresado) {
        boolean valido = false;
        String passwordU = usuario.getPassword();
        String loginU = usuario.getLogin();
        if (passwordIngresado.equals(passwordU) && loginIngresado.equals(loginU)) {
            valido = true;
        } else {
            intentos += 1;
        }
        return valido;
    }

    public static boolean validarFormatoLogin(String usuario, String contrasenia) {
        boolean valido = true;
        boolean simbolos = false;

        if (usuario == null || usuario.isEmpty()) {
            System.out.println("El usuario esta vacia. Ingrese su usuario: ");
            valido = false;
            intentos += 1;
        } else if (usuario.length() < 5) {
            System.out.println("El usuario tiene poco caracteres: ");
            valido = false;
            intentos += 1;
        } else if (usuario.length() > 15) {
            System.out.println("El usuario sobrepasa los caracteres requeridos: ");
            valido = false;
            intentos += 1;
        } else if (String.valueOf(usuario.charAt(0)).equals(" ")
                || String.valueOf(usuario.charAt(usuario.length() - 1)).equals(" ")) {
            valido = false;
            System.out.println("El usuario no debe tener espacio al inicio o al final: ");
            intentos += 1;
        }

        for (int i = 0; i < usuario.length(); i++) {
            if (!(Character.isLetter(usuario.charAt(i)) || Character.isDigit(usuario.charAt(i)))) {
                simbolos = true;
                valido = false;
                intentos += 1;
            }
        }
        if (simbolos) {
            System.out.println("El usuario no debe tener Simbolos o espacios");
        }
        return valido;
    };

    public static void depositar(Cuenta cuentaRegistrada, double monto) {
        if (monto > 0) {
            double nuevoSaldo = cuentaRegistrada.getSaldo() + monto;
            cuentaRegistrada.setSaldo(nuevoSaldo);

            Operacion nuevaOperacion = new Operacion("Deposito", monto);

            ArrayList<Operacion> historial = cuentaRegistrada.getHistorial();
            historial.add(nuevaOperacion);
            System.out.println("Depósito exitoso");
        } else {
            System.out.println("No se puede depositar esta cantidad...");
            return;
        }

    };

    public static void retirar(Cuenta cuentaRegistrada, double monto) {

        if (monto > 0) {
            double saldoActual = cuentaRegistrada.getSaldo();
            if (monto <= saldoActual) {
                double retiro = saldoActual -= monto;
                cuentaRegistrada.setSaldo(retiro);
                Operacion nuevaOperacion = new Operacion("Retiro", monto);
                ArrayList<Operacion> historial = cuentaRegistrada.getHistorial();
                historial.add(nuevaOperacion);
                System.out.println("Retiro exitoso");
            } else {
                System.out.println("Fondos insuficientes. Saldo actual: $" + saldoActual); // 👈
            }

        } else {
            System.out.println("No se puede retirar este monto...");
        }
    }

}
