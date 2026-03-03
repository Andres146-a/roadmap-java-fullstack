
/*
### Palíndromo

**Condiciones:**

- Comparar extremos
- Ignorar posición intermedia
- No invertir strings “porque sí”

👉 Evalúa: **simetría y control de índices**
 */
import java.util.*;
public class EjercicioPalindromo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = sc.nextLine().toLowerCase();
        boolean respuesta = palindromo(palabra);
        if (respuesta){
                    System.out.println("La palabra: " + palabra + " es palindromo");
        } else{
                   System.out.println("La palabra: " + palabra + " NO es palindromo") ;
        }
        sc.close();
    };

    public static boolean palindromo(String palabra ){
        boolean respuesta = true;
        ArrayList <String> palabraSinEspacioLista = new ArrayList<>();
        palabraSinEspacioLista = eliminarEspacio (palabra);
        int izq = 0;
        int derecha = palabraSinEspacioLista.size()-1;
        while(izq < derecha){
            if (!palabraSinEspacioLista.get(izq).equals(palabraSinEspacioLista.get(derecha))){
                respuesta = false; 
                break;
            }else{
                izq++;
                derecha--;
            }
        }

        return respuesta;

    };

    //Hice este metodo para hacer un recorrido pero luego me acordé que un Palindromo siempre va a empezar y terminar con el mismo caracter.
    public static ArrayList<String> eliminarEspacio(String palabra){
        ArrayList <String> palabraSinEspacioLista = new ArrayList<>();
        for(int i = 0; i < palabra.length(); i++){
            if(palabra.charAt(i) != ' '){//Cuando se trabaja con charAt se lo identifica con comillas simples
                palabraSinEspacioLista.add(String.valueOf(palabra.charAt(i))); // Se utilzia "valueOf" para convertir de un caracter (charAt) a String
            }
        }   
        System.out.println("Texto sin espacios: " + palabraSinEspacioLista);
        return palabraSinEspacioLista;
    }
   


    /*
    
            Anitalavalatina

    */

}
