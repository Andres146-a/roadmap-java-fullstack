import java.util.*;

public class EjercicioCajero {
    static class Operacion {
        String tipo;
        double monto;

        Operacion(String tipo, double monto) {
            this.tipo = tipo;
            this.monto = monto;
        }
    }

    static ArrayList<Operacion> historial = new ArrayList<>();

    public static void main(String[] args) {
        double saldo = 0;
        Scanner sc = new Scanner(System.in);
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
                    saldo = deposito(saldo, sc, historial);
                    break;
                case 2:
                    saldo = retirar(saldo, sc, historial);
                    break;
                case 3:
                    consultarSaldo(saldo);
                    break;
                case 4:
                    verHistorial(historial);
                    break;
                case 5:
                    break;
            }
        } while (opcion != 5);
    }

    public static double deposito(double saldo, Scanner sc, ArrayList<Operacion> historial) {
        System.out.println("\nIngrese el monto a depositar: ");
        double monto = sc.nextDouble();
        if (monto <= 0) {
            System.out.println("No se puede depositar esta cantidad");
        } else {
            saldo += monto;
            historial.add(new Operacion("Deposito", monto));
            System.out.println("Monto depositado: $" + monto);

        }
        return saldo;
    }

    public static double retirar(double saldo, Scanner sc, ArrayList<Operacion> historial) {
        System.out.println("\nIngrese el monto a depositar: ");
        double retiro = sc.nextDouble();
        if(retiro>0){
            if (retiro <= saldo){
                saldo-=retiro;
                historial.add(new Operacion("Retiro", retiro));
                System.out.println("Monto retirado: $" + retiro);
            }
        }else{
                    System.out.println("\nNo tiene los fondos necesarios para el retiro.");

        }
        return saldo;
    }

    public static void consultarSaldo(Double saldo){
        System.out.println("\nSu saldo actual es de: " + saldo);
    }

    public static void verHistorial( ArrayList<Operacion> historial){
        for (Operacion op : historial){
            System.out.println(op.tipo + " - $" + op.monto);
        }
    }
   
}
