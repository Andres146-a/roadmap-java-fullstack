package Nivel5;

import java.util.ArrayList;
import java.util.Scanner;
import Nivel5.Usuario;
import Nivel5.Cuenta;
import Nivel5.BancoServicio;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Usuario usuario = registrarUsuario(sc);
        Cuenta cuenta = registrarCuenta(sc, usuario);

        int intentos = 0;
        do {
            System.out.println("Bienvendo a tu Cajero de confianza...");
            System.out.println("Porfavor ingrese sus credenciales");
            System.out.println("Ingrese su usuario | login");
            String login = sc.nextLine();
            System.out.println("Ingrese su contraseña | password");
            String password = sc.nextLine();
            if (BancoServicio.validarFormatoLogin(login, password)) {
                if (BancoServicio.validarLogin(usuario, login, password)) {
                    mostrarMenu(sc, cuenta);
                } else {
                    System.out.println("Credenciales incorrectas - bloqueo");
                    intentos++;
                }
            } else {
                System.out.println("Ingresar correctamente las credenciales");
                intentos++;
            }

        }while (intentos < 3 && intentos > 0);

    }

    public static void mostrarMenu(Scanner sc, Cuenta cuenta) {

        int opcion = 0;
        do {
            System.out.println("\nBienvenido a tu Cajero Automatico");
            System.out.println("1. Depósito");
            System.out.println("2. Retiro");
            System.out.println("3. Consulta de Saldo");
            System.out.println("4. Ver historial");
            System.out.println("5. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese su monto a depositar: ");
                    try {
                        double monto = sc.nextDouble();
                        BancoServicio.depositar(cuenta, monto);
                    } catch (Exception e) {
                        System.out.println("Ingrese un número válido.");
                        sc.nextLine(); // limpiar buffer
                    }
                    break;
                case 2:
                    System.out.println("Ingrese su monto a retirar: ");
                    int retiro = sc.nextInt();
                    BancoServicio.retirar(cuenta, retiro);
                    break;
                case 3:
                    System.out.println("Su saldo es de: " + cuenta.getSaldo());
                    ;
                    break;
                case 4:
                    System.out.println("Su historial es: " + cuenta.getHistorial().toString());
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 5);
    }

    public static Usuario registrarUsuario(Scanner sc) {
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el usuario: ");
        String login = sc.nextLine();
        System.out.println("Ingrese la constraña: ");
        String password = sc.nextLine();
        Usuario usuarioNuevo = new Usuario(nombre, login, password);

        return usuarioNuevo;

    }

    public static Cuenta registrarCuenta(Scanner sc, Usuario usuario) {
        System.out.println("Ingrese su numero de cuenta: ");
        int numCuenta = sc.nextInt();
        System.out.println("Ingrese su saldo: ");
        double saldoActual = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese su tipo de cuenta: ");
        String tipoCuenta = sc.nextLine();
        ArrayList<Operacion> historial;
        Cuenta cuentaNueva = new Cuenta(numCuenta, saldoActual, tipoCuenta, usuario);

        return cuentaNueva;
    }
}
