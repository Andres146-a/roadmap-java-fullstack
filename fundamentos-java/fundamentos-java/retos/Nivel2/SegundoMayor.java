import java.util.ArrayList;
import java.util.Scanner;

public class SegundoMayor {
    
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
        int primerMayor ;
        int segundoMayor;
        if (lista.get(0) > lista.get(1)){
            primerMayor = lista.get(0);
            segundoMayor = lista.get(1);
        } else{
            primerMayor = lista.get(1);
            segundoMayor = lista.get(0);
        }

        for (int i  = 2; i < lista.size(); i++){
            if (lista.get(i) > primerMayor){
                segundoMayor = primerMayor;
                primerMayor = lista.get(i);
                 
            }
            else if (lista.get(i) > segundoMayor && lista.get(i) < primerMayor) {
                segundoMayor = lista.get(i);
            } 

        
          
        }
    System.out.println("El primero Mayor es: "+primerMayor);

        return segundoMayor;    

    }


}

/*
    8
    3      primero =15;
    15      segundo = 10;
    6      i = 3
    2
    10
*/
