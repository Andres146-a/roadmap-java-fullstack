import java.util.*;

class EjercicioLetraNoRepetida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabara: ");
        String palabra = sc.nextLine();
        System.out.println("La letra que menos veces se repite es: " + contarFrecuencia(palabra));
        sc.close();
    }

    public static String contarFrecuencia(String palabra) {
        String primeraPalabra = "";
        int contador = 0;

        // Contar cuantas veces aparece una palabra x
        for (int i = 0; i < palabra.length(); i++) {
            contador = 0;
            for (int j = palabra.length()-1; j >= 0; j--) {
                if (String.valueOf(palabra.charAt(j)).equals(String.valueOf(palabra.charAt(i)))) {
                    contador += 1;
                    System.out.println("La letra " + String.valueOf(palabra.charAt(i))+ " aparece: " + contador);

                }

             
            }
   if (contador == 1) {
                    System.out.println("La letra con menos apariciones es: " +String.valueOf(palabra.charAt(i) ));
                    primeraPalabra = String.valueOf(palabra.charAt(i));
                break;
                }
        }

        return primeraPalabra;

    }
}

/*
 * 
 * P - R - O - G - R - A - M - A - R - P - G
 * 
 * 
 * 
 */