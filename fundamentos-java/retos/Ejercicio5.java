/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main (String[] args){
        String poligono = "";
        Scanner sc = new Scanner(System.in);
    
        do {
      
        System.out.println("Seleccioné 1 de los 3 modelos de polígonos: ");
                System.out.println("1.- Triángulo");
                System.out.println("2.- Cuadrado");
                System.out.println("3.- Rectángulo");
                System.out.println("Ingrese Fin para salir ");
                poligono = sc.nextLine().toLowerCase().trim();
        
            if (poligono.isEmpty()){
                System.out.println("Debe escoger una opción");
                continue;
            }
            if (poligono.equals("triangulo") || poligono.equals("cuadrado") || poligono.equals("rectangulo")){
                    System.out.println(CalcularArea(poligono, sc));
            } else {
                if (!poligono.equals("fin")){
                         System.out.println("Mensaje de error generico");
                }
            }
                
        }while(!poligono.toLowerCase().equals("fin"));

        sc.close();
       
    };


    public static Double CalcularArea(String poligono, Scanner sc){

       
        double base ;
        double altura ;
        double lado;
        double area = 0;
        switch(poligono){
            case "triangulo":
                System.out.println("Ingrese la altura del triángulo: ");
                altura = Double.parseDouble(sc.nextLine());
                System.out.println("Ingrese la base del triángulo: ");
                base = Double.parseDouble(sc.nextLine());
                area = (base * altura)/2;
         
                return area;
            case "cuadrado":
                System.out.println("Ingrese el lado del cuadrado: ");
                lado = Double.parseDouble(sc.nextLine());

                area = (lado * lado);
           
                return area;
            case "rectangulo":
                System.out.println("Ingrese la altura del rectangulo: ");
                altura = Double.parseDouble(sc.nextLine());
                System.out.println("Ingrese la base del rectangulo: ");
                base = Double.parseDouble(sc.nextLine());
                area = (base * altura);
      
                return area;
            
        }

        return 0.0;
    }
}

/*
    En este ejercicio se usó el bucle "do-while" y se utilizo más funciones ya dadas por java como toLowerCase(), trim() y parseDouble()
    Aun estoy aprendiendo cuando es necesario usar return, break y continue pero se aprendio. 

*/
