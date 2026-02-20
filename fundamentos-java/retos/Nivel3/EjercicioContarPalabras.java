/*
    ### 15️⃣ Contar palabras

**Condiciones:**

- Detectar separadores
- Evitar contar espacios múltiples
- Contar solo transiciones válidas

👉 Evalúa: **detección de límites**

*/
import java.util.*;
public class EjercicioContarPalabras {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una seria de palabras: ");
        String palabra = sc.nextLine().toLowerCase();
        if(palabra.isEmpty()){
            System.out.println("Debe de ingresar una serie de palabras: ");
        }else{
            System.out.println("La cantidad de palabras son: " + contarPalabras(palabra));
        }
        sc.close();
    }

    public static int contarPalabras(String palabra){
        int contadorPalabra=0;
         if (!String.valueOf(palabra.charAt(0)).equals(" ")){
                contadorPalabra+=1;
                System.out.println("Estamos en la primera posición");
            }
        for (int i = 1; i < palabra.length(); i++){
            System.out.println("Estamos dentro del for y estamos viendo la letra: " + String.valueOf(palabra.charAt(i)));
            if (!String.valueOf(palabra.charAt(i)).equals(" ") && String.valueOf(palabra.charAt(i-1)).equals(" ") ){
                 contadorPalabra+=1;
                 System.out.println("Estamos DENTRO DE LA OTRA CONDICIÓN");
            }
            
        }

        return contadorPalabra;
    }
}

/*

"HOLA MUNDO"


"   HOLA   MUNDO  "

"  HOLA MUNDO"

*/