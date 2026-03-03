import java.util.*;

/*
###8️⃣ Buscar un número

**Condiciones:**

- Revisar cada elemento
- Detener búsqueda cuando se encuentre (optimización básica)
- Devolver existencia, no posición (a menos que se pida)

👉 Evalúa: **búsqueda secuencial**
*/

public class EjercicioBuscarNum {
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
        System.out.print("Ingrese el número a buscar: ");
        int numeroAbuscar = sc.nextInt();
        if (buscarNumero(numero, numeroAbuscar)) {
            System.out.println("Se encontró: ");
        } else {
            System.out.println("NO se encontró: ");
        }

        sc.close();

    }

    public static boolean buscarNumero(ArrayList<Integer> lista, int numeroAbuscar) {
        boolean eureca = false;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == numeroAbuscar) {
                eureca = true;
                return eureca;
            }
        }

        return eureca;
    }
}
