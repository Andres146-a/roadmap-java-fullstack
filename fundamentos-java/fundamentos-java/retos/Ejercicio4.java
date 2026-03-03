
import java.util.ArrayList;
 
/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
public class Ejercicio4 {
    public static void main(String[] args){
        System.out.println(imprimirNumeros());
    

    };

    public static ArrayList<Integer> imprimirNumeros(){
            ArrayList<Integer> lista = new ArrayList<>();
            for (int i = 1; i <= 100; i++){
                if(primoOno(i)){
                    lista.add(i);
                    System.out.println("Enviando valor de " + i + " a primoOno");
                } 
                
            }
            return lista;
    };

     public static boolean primoOno (int i){
        if (i < 2){
            return false;
        } else if (i == 2){
            return true;
        }
        if  (i % 2 == 0 && i != 2){
            return false;
        }
        for (int d = 3; d * d <= i; d+=2 ){
            if (i % d == 0){
                return false;
            }
        }
        return true;
    }

}

/*
    Este ejercicio  me sacó el aire. 
    Primero entendí que no todo tiene que estar en un for, más vale sacar condiciones de los casos generales antes que especificos: 
        Por ejemplo...en esta linea :
             if  (i % 2 == 0 && i != 2){
            return false;
        se sacó a la mitad de numeros pares y nos quedamos con los impares que ahi estan los primos (sin contar el 2)
        tambien aprendi que puedo poner una condicón dentro de la sección de condiciones jajaja 
        Ej:for (int d = 3; d * d <= i; d+=2 )
        aprendí mucho tambien, gracias a los logs que añadia pero bueno. 
*/