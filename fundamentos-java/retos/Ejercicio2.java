

import java.util.Scanner;

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
public class Ejercicio2 {
    public static void main (String[] args){

        //System.out.println("Hola mundo");
        Scanner sc  = new Scanner(System.in);  
        System.out.print("Ingrese una palabra: ");
        String palabraUno = sc.nextLine();
        System.out.print("Ingrese una palabra: ");
        String palabraDos = sc.nextLine();

        if (anagrama(palabraUno, palabraDos)){
              System.out.println("Las palabras: ");
                System.out.println(palabraUno + " y " + palabraDos);
                  System.out.print("Si son Anagramas");
        } else {
               System.out.println("Las palabras: ");
                System.out.println(palabraUno + " y " + palabraDos);
                  System.out.print("No son Anagramas");
        }


            sc.close();
    }
 public static boolean anagrama(String palabraUno, String palabraDos){

    // Regla: si son exactamente iguales, NO es anagrama
    if (palabraUno.equals(palabraDos)) return false; //equals es para comparar el contenido de dos objetos.

    if (palabraUno.length() != palabraDos.length()) return false;

    for (int i = 0; i < palabraUno.length(); i++){
        boolean ok = false;

        for (int j = 0; j < palabraDos.length(); j++){
            if (palabraUno.charAt(i) == palabraDos.charAt(j)){
                // consumir la letra encontrada
                palabraDos = palabraDos.substring(0, j) + palabraDos.substring(j + 1);
                ok = true;
                break;
            }
        }

        // si no encontré esa letra, no es anagrama
        if (!ok) return false;
    }

    // si encontré y consumí todas las letras, es anagrama
    return true;
}
}
