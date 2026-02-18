/*
    9️⃣ Rotar un Array (Consigna Correcta)
🎯 Objetivo

Implementar una rotación del array una posición hacia la derecha.

📌 Instrucciones

Dado un array o ArrayList de enteros:

Debes rotar los elementos una posición a la derecha.

El último elemento debe pasar a la primera posición.

Todos los demás elementos deben desplazarse una posición hacia la derecha.

No se deben perder datos.

No se deben duplicar valores.

No se debe crear un array nuevo (hazlo modificando la misma estructura).

Solo se permite usar:

bucles

variables temporales

acceso por índice
*/

import java.util.*;
public class EjercicioRotarArray {
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números que va añadir en el ArrayList: ");
        int longitud = sc.nextInt();
        for (int i = 0; i < longitud; i++){
            System.out.println("Ingrese el valor del elemento: ");
            int valor = sc.nextInt();
            lista.add(valor);
        }
        System.out.println("La rotacíón de la lista es: " + rotarArray(lista));
        sc.close();
    }
    public static ArrayList<Integer> rotarArray(ArrayList<Integer> lista){
        // 10-20-30-40
        int ultimoValor = 0;

      
       
         int ultimoValorF = lista.get(lista.size()-1);
        for (int i = lista.size()-1; i >= 1 ; i--){

           ultimoValor = lista.get(i-1);
            lista.set(i, ultimoValor);

            
        }
        lista.set(0, ultimoValorF);
        
     
        return lista;
    }
}
