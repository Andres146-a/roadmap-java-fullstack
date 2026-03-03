
import java.util.*;

public class EjercicioSegundoMayor {


     public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números que va añadir en el ArrayList: ");
        int longitud = sc.nextInt();
        for (int i = 0; i < longitud; i++) {
            System.out.println("Ingrese el valor del elemento: ");
            int valor = sc.nextInt();
            lista.add(valor);
        }
         if (lista.size() < 2){
            System.out.println("No hay segundo numero mayor, solo primer numero mayor: " + lista.get(0));
        } else {
        System.out.println("El segundo número mayor es: " + segundoMayor(lista));

        }
        sc.close();
    }
    public static int segundoMayor(ArrayList<Integer> lista){
        int numeroMayor ; 
        int segundoMayor;
        boolean encontreSegundo = false;
        if (lista.get(0) > lista.get(1)){
                numeroMayor = lista.get(0);
                   segundoMayor = lista.get(1);
        } else {
            numeroMayor = lista.get(1);
                     segundoMayor = lista.get(0);
        }

       

        for(int i = 2; i < lista.size(); i++){
            if (lista.get(i) > numeroMayor){ // 4  > 4
                segundoMayor = numeroMayor; // 4
                numeroMayor = lista.get(i); // 0
                encontreSegundo = true;
            } else if (lista.get(i) >  segundoMayor  && lista.get(i) < numeroMayor ){
                segundoMayor = lista.get(i);
            }
        }

        return segundoMayor;
    }
}

 