
/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args){
        Ejercicio1 obj = new Ejercicio1();
        System.out.println(obj.imprimirNumeros());
    }

    public ArrayList<String> imprimirNumeros(){
        ArrayList<String> num = new ArrayList<>();

        for(int i = 1; i < 101; i++ ){
      
         if (i % 3 == 0 && i % 5 == 0){
          num.add(("Fizz - Buzz")); //"Parsing"
         } else if (i % 3 == 0){
            num.add("Fizz"); //"Parsing"
         }
        else if (i % 5 == 0){
            num.add("Buzz"); //"Parsing"
         }
         else{
               num.add(Integer.toString(i));
         }
        }
        return num;
    }

   
}

//1. Se instancio el metodo imprimirNumero de la clase Ejercicio, ya que el metodo imprimirNumeros era no estatico y el lugar (main) donde se llamaba al metodo imprimir era estatico. 
//Porque puse el metodo imprimirNumeros como no estatico porque no podia retornar con el 'void'. 