import java.util.*;

/*

### Contar vocales

**Condiciones:**

- Revisar cada carácter
- Comparar contra un conjunto de valores
- Contar coincidencias

👉 Evalúa: **clasificación**
*/
public class EjercicioContarVocales {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = sc.nextLine();
        sc.close();
        System.out.println("La palabra tiene las siguiente cantidad de vocales: ");
        contarVocales(palabra.toLowerCase());
    }

    public static void contarVocales(String palabra) {
        String[] vocales = { "a", "e", "i", "o", "u" };
        int[] contadores = new int [5];
        /*
        
           
        */
      
        for (int i = 0; i < palabra.length(); i++) {//El "length()" es una función exclusiva para String, que devuelve un numero de caracteres en el string
   
            for (int j = 0; j < vocales.length; j++){//El "length" es una propiedad de los arrays que devuelve la longitud del array.
          
                if(vocales[j].equals(String.valueOf(palabra.charAt(i)))){
                    contadores[j]++;
                
                    break;
                }
             

            }   
 
        }
        for (int k = 0; k < vocales.length; k++){
             System.out.println("La vocal " + vocales[k] + 
                          " aparece " + contadores[k] + " veces");
        }
      
    }
}
