import java.util.*;
public class EjercicioRecuperacion {
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
//Derecha
/*
 public static ArrayList<Integer> rotarArray(ArrayList<Integer> lista){
        int ultimoValor = lista.get(lista.size()-1);
        for (int i = lista.size()-1; i >= 1 ; i--){
            lista.set(i, lista.get(i-1));
        
        }
     
        lista.set(0, ultimoValor);
        return lista;
    }
*/
//10-20-30-40
//40-10-20-30

//Izquierda
    public static ArrayList<Integer> rotarArray(ArrayList<Integer> lista){
        int primerValor = lista.get(0);
        int ultimaPosicion = lista.size()-1;
        for (int i = 0 ; i < lista.size()-1 ; i++){
            lista.set(i, lista.get(i+1));
            
        }
        System.out.println(lista.get(lista.size()-1));
        lista.set(ultimaPosicion, primerValor);
        return lista;
    }
}


//10-20-30-40
//20-30-40-10
