import java.util.*;
/*
    - loop hasta salir
    - opción inválida no rompe el programa
    - el menú controla todos los módulos anteriores
*/
public class EjercicioMenu {
    public static void main (String[] args){
         boolean bandera = true;
         Scanner sc = new Scanner(System.in);
         Integer opcion;
         do{
            System.out.println("1. Cajero");
            System.out.println("2. Crud");
            System.out.println("3. Login");
            System.out.println("4. Validar Contraseña");
            System.out.println("0. Salir");
            System.out.println("Ingrese su opción: ");

            try  {
                opcion = sc.nextInt();
            }catch(Exception e){
                System.out.println("Opción inválida.");
                sc.nextLine(); 
                continue;
            }
   

            switch(opcion){
                case 1: 
                    EjercicioCajero.main(args);
                    break;
                case 2: 
                    EjercicioCrudSimple.main(args);
                    break;
                case 3: 
                    EjercicioSimularLogin.main(args);
                    break;
                case 4: 
                    EjercicioValidarContrasenia.main(args);
                    break;
                case 0: 
                    System.out.println("¡Hasta luego!");
                    bandera = false;
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
                     
     
         }while(bandera);
        sc.close();
    }
}
