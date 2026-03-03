
import java.util.*;

public class EjercicioSimularLogin {
    public static String usuarioOriginal = "Administrador";
    public static String contraseniaOriginal = "Admin1234";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        for (int i = 3; i > 0;) {
            System.out.println("Ingrese su usuario: ");
            String usuario = sc.nextLine();
            System.out.println("Ingrese su contraseña: ");
            String contrasenia = sc.nextLine();
            if (comprobacionLogin(usuario, contrasenia)) {
                System.out.println("Bienvenido!!!");
                break;
            } else {
                bandera = false;
                i--;
                System.out.println("Le quedan: " + i + " intentos");
            }
           
        }
         if (!bandera){
                System.out.println("Cuenta Bloqueda por exceso de intentos.");
            }
        sc.close();
    };

    public static boolean comprobacionLogin(String usuario, String contrasenia) {
        boolean comprobacion = false;
        int intentos = 0;
        int mayuscula = 0;
        int num = 0;
        int minuscula = 0;
        boolean usuarioCorrecto = false;
        boolean contraseniaCorrecta = false;
        boolean espacios = false;
        boolean simbolos = false;
        // sección de validación de usuario
        if (usuario == null || usuario.isEmpty()) {
            System.out.println("El usuario esta vacia. Ingrese su usuario: ");
            intentos += 1;
        }else if (usuario.length() < 5) {
            System.out.println("El usuario tiene poco caracteres: ");
                intentos += 1;
        }else if (usuario.length() > 15) {
            System.out.println("El usuario sobrepasa los caracteres requeridos: ");
                intentos += 1;
        }else   if(String.valueOf(usuario.charAt(0)).equals(" ") || String.valueOf(usuario.charAt(usuario.length()-1)).equals(" ")){
            System.out.println("El usuario no debe tener espacio al inicio o al final: ");
            intentos+=1;               
        }
      
        for (int i = 0; i < usuario.length(); i++) {
          if (!(Character.isLetter(usuario.charAt(i)) || Character.isDigit(usuario.charAt(i)))) {
                simbolos = true;
                intentos += 1;
            }
        }
        if(simbolos){
            System.out.println("El usuario no debe tener Simbolos o espacios");
        }

        if(contrasenia.equals(contraseniaOriginal)){
            usuarioCorrecto = true;
            System.out.println("UsuarioCorrecto");
        }
       

        // sección de valdiación de contraseña
         if (contrasenia.length() < 8){
            System.out.println("La cadena tiene que ser mayor que 8 digitos.");
        }
        for (int i = 0; i < contrasenia.length(); i++){
           if(Character.isUpperCase(contrasenia.charAt(i))){
                mayuscula+=1;
                
           }else if(Character.isLowerCase(contrasenia.charAt(i))){
             minuscula+=1;
             
           }else if (Character.isDigit(contrasenia.charAt(i))){
            num+=1;
     
           }else if(String.valueOf(contrasenia.charAt(i)).equals(" ")){
            espacios = true;
         
           }else {
            System.out.println("Clave correcta");
           }
        }
        if(mayuscula < 1){
            System.out.println("Debe al menos tener 1 letra Mayuscula");
            intentos+=1;
        } else if ( minuscula < 1 ){
             System.out.println("Debe al menos tener 1 letra Minuscula");
        } else if (num < 1){
             System.out.println("Debe al menos tener 1 número");
             intentos+=1;
        } else if  (espacios){
             System.out.println("No debe tener espacios");
             intentos+=1;
        }
      
                if(contrasenia.equals(contraseniaOriginal)){
                    System.out.println("Contraseña Correcta");
                    contraseniaCorrecta = true;
                }
          
// sección de validación de cuenta (verificar si usuario y contraseñas con
        // validas)

        if(usuarioCorrecto){
            if (contraseniaCorrecta){
                comprobacion = true;
            }
        }

    if (intentos > 1){
                comprobacion = false;
    } 

        return comprobacion;
    }
}
