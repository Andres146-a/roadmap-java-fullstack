import java.util.*;

public class EjercicioCrudSimple {
    static class Item {
        int id;
        String nombre;

        Item(int id, String nombre) {
            this.id = id;
            this.nombre = nombre;
        }
    }

    public static void main(String[] args) {
        ArrayList<Item> lista = new ArrayList<>(); // Se pone item porque son objetos
        String opcion = " ";
        Scanner sc = new Scanner(System.in);
        int siguienteId = 1;

        do {
            System.out.println("\nBienvenido a este CRUD Simple");
            System.out.println("1. Crear");
            System.out.println("2. Listar");
            System.out.println("3. Actualziar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");
            opcion = sc.nextLine().toLowerCase();

            switch (opcion) {
                case "crear":
                    siguienteId = crearElemento(lista, sc, siguienteId);
                    break;
                case "listar":
                    listarElementos(lista);
                    break;
                case "actualizar":
                    actualizarElemento(lista, sc, siguienteId);
                    break;
                case "eliminar":
                    eliminarElemento(lista, sc);
                    break;
                case "salir":
                    break;
            }
        } while (!opcion.equals("salir"));
        sc.close();

    };

    public static int crearElemento(ArrayList<Item> lista, Scanner sc, Integer siguienteId) {

        System.out.println("Ingrese el nuevo elemento: ");
        String nombre = sc.nextLine();

        Item nuevo = new Item(siguienteId, nombre);
        lista.add(nuevo);

        System.out.println("Elemento agregado a : " + nuevo.nombre);
        System.out.println("Elemengot agregado con ID: " + nuevo.id);
        return siguienteId + 1;
    }

    public static void listarElementos(ArrayList<Item> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista esta vacia");
            return;
        } else {
            System.out.println("\n=== LISTA DE ELEMENTOS ===");
            for (Item item : lista) {
                System.out.println("ID: " + item.id + " | Nombre: " + item.nombre);
            }
        }

    }

    public static void actualizarElemento(ArrayList<Item> lista, Scanner sc, Integer siguienteId) {
        System.out.println("\n=== Actualizar elemento ===");
        int busqueda = Integer.parseInt(sc.nextLine());
        boolean encontrado = false;
        String nombreNuevo = "";

        for (Item item : lista) {
            if (item.id == busqueda) {
                System.out.println("Ingrese el cambio del producto: ");
                nombreNuevo = sc.nextLine();
                item.nombre = nombreNuevo;
                encontrado = true;
                System.out.println("Cambio de producto realizado: " + item.nombre);
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No existe un elemento con ese ID");
        }
    }

    public static void eliminarElemento(ArrayList<Item> lista, Scanner sc) {
        System.out.println("\n=== Actualizar elemento ===");
        int busqueda = Integer.parseInt(sc.nextLine());
        boolean encontrado = false;
        String confirmacion = "";
        for (Item item : lista) {
            if (item.id == busqueda) {
                System.out.println(
                        "\nEsta seguro de querer eliminar el producto: " + item.id + " - " + item.nombre + "?");
                confirmacion = sc.nextLine().toLowerCase();
                encontrado = true;
                if (confirmacion.equals("si")) {
                    lista.remove(item);
                    break;
                }
            }
        }
        if (!encontrado) {
            System.out.println("No existe el elemento que desea eliminar");

        }
    }
}
