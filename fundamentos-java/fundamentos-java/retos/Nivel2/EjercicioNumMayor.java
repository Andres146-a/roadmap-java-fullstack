 

/*
### 6️⃣ Mayor y menor de un array

**Condiciones:**

- Debes recorrer todo el array
- Comparar elemento actual con un valor guardado
- No asumir orden

👉 Evalúa: **estado inicial + comparación continua**
 */
import java.util.*;
public class EjercicioNumMayor {
    public static void main(String[] args){

        ArrayList<Integer> lista = new ArrayList<>(); 
        System.out.print("Ingrese la cantidad de números que va a ingresar: ");
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        int numeroIngresado = 0;
        for (int i = 0; i < cantidad ; i++){
            System.out.print("Ingrese un número: ");
            numeroIngresado = sc.nextInt();
            lista.add(numeroIngresado);
        }
        System.out.println("El array tiene: " + lista);
        sacarNumeroMayor(lista);
        

        sc.close();

    }

    public static void sacarNumeroMayor (ArrayList<Integer> lista){
        int numeroMayor = lista.get(0);
        int numeroMenor = lista.get(0);
        for (int i = 0; i < lista.size(); i ++){
            if (lista.get(i) > numeroMayor){
                numeroMayor = lista.get(i);
           } 
            if (lista.get(i) < numeroMenor){
            numeroMenor = lista.get(i);
           }
        }
        System.out.println("El número mayor es: " + numeroMayor);
        System.out.println("El número menor es: " + numeroMenor);
        
    }
}
