import java.util.*;
public class FrecuenciaNum {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("Ingrese la longitud del ArrayList: ");
        int longitud = 0;
        longitud = sc.nextInt();
        for (int i = 0; i < longitud; i++){
            System.out.println("Ingrese la cantidad: ");
            int valor = sc.nextInt();
            lista.add(valor);
        }
        frecuencia(lista);
        sc.close();
    }

    public static void frecuencia (ArrayList<Integer> lista){
        ArrayList<Integer> procesados = new ArrayList<>();
        for (int i = 0; i < lista.size(); i ++){
            int contador = 0; 
            boolean bandera = true;
            if (!procesados.contains(lista.get(i))){
                for (int j = 0; j < lista.size(); j++){
                                if (lista.get(i) == lista.get(j)){
                                    contador++;
                                    bandera = true;
                                    procesados.add(lista.get(i));
                                }
                            }
            }else{
                bandera = false;
            }
           
            if (bandera){
                System.out.println("El número: " + lista.get(i) + " se repite: " + contador);
            }
        }
    }
}

/*
7
8
9       i = 0 - 7;
7       j = 3 - 7;
1       contador= 1; 
1
8
*/