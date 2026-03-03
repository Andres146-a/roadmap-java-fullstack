
import java.util.*;

/*

### 16) Validar contraseña (versión backend)

Añade estas reglas (mínimas):

- longitud mínima (8+)
- 1 mayúscula, 1 minúscula, 1 número
- sin espacios
- **debe decir cuál regla falló** (no solo true/false)

*/
public class EjercicioValidarContrasenia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su contraseña: ");
        String palabra = sc.nextLine();
       
         if(palabra == null || palabra.isEmpty()){
            System.out.println("La cadena esta vacia. Ingrese su contraseña: ");
           
        }else{
            comprobadorContraseña(palabra);
        }
       
    }

    public static void comprobadorContraseña(String palabra){
        int mayuscula = 0;
        int num = 0;
        int minuscula = 0;
        boolean espacios = false;
        if (palabra.length() < 8){
            System.out.println("La cadena tiene que ser mayor que 8 digitos. Ingrese su contraseña: ");
        }
        for (int i = 0; i < palabra.length(); i++){
           if(Character.isUpperCase(palabra.charAt(i))){
                mayuscula+=1;
           }else if(Character.isLowerCase(palabra.charAt(i))){
             minuscula+=1;
           }else if (Character.isDigit(palabra.charAt(i))){
            num+=1;
           }else if(String.valueOf(palabra.charAt(i)).equals(" ")){
            espacios = true;
           }else {
            System.out.println("Clave correcta");
           }
        }
        if(mayuscula < 1){
            System.out.println("Debe al menos tener 1 letra Mayuscula");
        } else if ( minuscula < 1 ){
             System.out.println("Debe al menos tener 1 letra Minuscula");
        } else if (num < 1){
             System.out.println("Debe al menos tener 1 número");
        } else if  (espacios){
             System.out.println("No debe tener espacios");
        }
    }
}


/*

Contraseña123
*/