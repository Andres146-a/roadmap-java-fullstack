import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioPalindromo {
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
        if (verificarPalindromo(lista)){
        System.out.println("El ArrayList: "+ lista + " es palindromo");

        }else{
        System.out.println("El ArrayList: "+ lista + " NO es palindromo");

        }
        sc.close();

    };

    public static boolean verificarPalindromo(ArrayList<Integer> lista ){
        boolean bandera = true;
        int izq = 0;
        int dere = lista.size()-1;
     
        while (izq < dere){
            if (lista.get(izq) != lista.get(dere)){
                bandera= false;
                break;
            } else{
                izq++;
                dere--;
            }
           
        }
  
        return  bandera;
   }
 

}
