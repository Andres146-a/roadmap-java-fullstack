import java.util.*;

/*¨
    ### 🔟 Frecuencia de elementos

**Condiciones:**

- Contar cuántas veces aparece cada valor
- Evitar repetir conteos
- Asociar valor → cantidad

👉 Evalúa: **pensamiento tipo mapa (aunque no uses Map aún)**
*/

public class EjercicioFrecuencia {

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
     contadorFrecuencia(lista);
        sc.close();
    }

    public static void contadorFrecuencia(ArrayList<Integer> lista) {
 
        ArrayList<Integer> auxiliar = new ArrayList<>();
    
        int contador = 0;
        for (int i = 0; i < lista.size(); i++){
              int valorActual = lista.get(i);
            if (auxiliar.contains(valorActual)){
                continue;
            }

            contador = 0;

            for (int j = 0; i < lista.size(); i++){
                if (lista.get(j) == valorActual){
                    contador++;
                }
            }

            auxiliar.add(valorActual);
            
            System.out.println(valorActual + " -> " + contador);
        }
       
       
 

    }

}