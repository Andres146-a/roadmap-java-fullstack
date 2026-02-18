
import java.util.*;
public class EjercicioEliminarEspaciosDup{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = sc.nextLine();
        System.out.println("El texto sin espacio duplicado es: " + eliminarEspacioDup(palabra));
        sc.close();
    }  
    
    public static ArrayList<String> eliminarEspacioDup(String palabra){
        ArrayList<String> lista = new ArrayList<>();
        lista.add(String.valueOf(palabra.charAt(0)));

        for(int i = 1; i < palabra.length(); i++){
            String actual = String.valueOf(palabra.charAt(i));
            String pasada = String.valueOf(palabra.charAt(i-1));
            if (!actual.equals(" ")){
                lista.add(actual);
            }else {
                if(!pasada.equals(" ")){
                    lista.add(actual);
                }
            }

        }
        return lista;

    }


    /*
    
        "__HOLA MUNDO__"
        " Andres"



    */
}