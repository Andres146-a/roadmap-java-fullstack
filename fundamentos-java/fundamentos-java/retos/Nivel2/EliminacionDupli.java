import java.util.*;
public class EliminacionDupli {
    
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
        System.out.println("La lista sin duplicado seria: " +sinDuplicados(lista));
        sc.close();
    }

    public static ArrayList<Integer> sinDuplicados(ArrayList<Integer> lista){
        ArrayList<Integer> listaSinDup = new ArrayList<Integer>();
    
         
      /*
      for (int i = 0; i < lista.size(); i++){
            if (!listaSinDup.contains(lista.get(i))){
                listaSinDup.add(lista.get(i));
            }
        }
      */  
        
        for (int i = 0; i < lista.size(); i++){
            boolean bandera= true;
            for (int j = 0; j < listaSinDup.size(); j++){
                if (lista.get(i) == listaSinDup.get(j)){
                    bandera = false; 
                    break;
                }
            }
            if (bandera){
                listaSinDup.add(lista.get(i));
            }
        }
        return  listaSinDup;
    }
}

/*

5       
12      
12
8       
3       
5


i=0 - 5
j=0 - 12
[5- 12 - 8 ]


*/
