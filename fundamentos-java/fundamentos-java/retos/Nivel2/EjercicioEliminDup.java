import java.util.*;

/*
### 7️⃣ Eliminar duplicados

**Condiciones:**

- Detectar repetidos manualmente
- Evitar agregar valores ya existentes
- Mantener solo valores únicos

👉 Evalúa: **doble recorrido y validación**
*/
public class EjercicioEliminDup {
    public static void main(String[] args) {
        ArrayList<Integer> numero = new ArrayList<>();

        System.out.print("Ingrese la cantidad de números que va a ingresar: ");
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        int numeroIngresado = 0;
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese un número: ");
            numeroIngresado = sc.nextInt();
            numero.add(numeroIngresado);
        }
        System.out.println("El array tiene: " + numero);
        System.out.println("El array list queda asi: " + eliminarDuplicados(numero));
        sc.close();
    }

    public static ArrayList<Integer> eliminarDuplicados(ArrayList<Integer> numero) {
 
        ArrayList<Integer> nuevaLista = new ArrayList<>();
     
        for (int i = 0; i < numero.size(); i++) {
               boolean bandera= false;
            if (nuevaLista.size() == 0) {
                nuevaLista.add(numero.get(i));
            }
            for (int j : nuevaLista) {
                if (numero.get(i) == j ){
                    bandera = true;
                } 
             
            }
               if (bandera == false) {
                    nuevaLista.add(numero.get(i));
                }
        }
        return nuevaLista;
    }
}
