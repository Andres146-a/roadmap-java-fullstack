import java.util.*;
public class NumerKMasRep {
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
        System.out.println("El número que más se repite es: "+numRepetidoMayor(lista));
        sc.close();
    }

    public static int numRepetidoMayor(ArrayList<Integer> lista){
            ArrayList<Integer> procesados = new ArrayList<>();
            int numeroMasFrecuencia = 0; 
            int maxFrecuencia=0;
        for (int i = 0; i < lista.size(); i ++){
            int contador = 0; 
            boolean bandera = true;
            if (!procesados.contains(lista.get(i))){
                for (int j = 0; j < lista.size(); j++){
                                if (lista.get(i) == lista.get(j)){
                                    contador++;
                                    bandera = true;
                                    procesados.add(lista.get(i));
                                    if (contador > maxFrecuencia){
                                        maxFrecuencia = contador;
                                        numeroMasFrecuencia = lista.get(i);
                                    }
                                }
                            }
            }else{
                bandera = false;
            }
           
            if (bandera){
                System.out.println("El número: " + lista.get(i) + " se repite: " + contador);
            }
        }
        return numeroMasFrecuencia;
    }
}
