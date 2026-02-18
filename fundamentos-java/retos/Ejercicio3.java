 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
public class Ejercicio3 {
    public static void main (String[] args){
        System.out.println("Serie Fibonnaci: " + imprimirSerie());
        
        
    }


    public static ArrayList<Long> imprimirSerie(){
        ArrayList<Long> serie = new ArrayList<>();
        long a = 0 , b = 1, c = 0 ;
        for (int i = 0; i <=48; i++){
            a = b;
            b = c;
            serie.add(b);
            c= a + b;
  
        }
        return serie;
    }
}

/*
Aunque en la descripción decia que era dificil, la verdad que ya lo habia practicando antes y ya tenia la idea. 
En este ejercicio aprendí a utilizar mejor los ArrayList y me sentí más fluido al poder jugar con el for.
tambien aprendi más con el tipo de dato LONG que es más grande que el init 
*/