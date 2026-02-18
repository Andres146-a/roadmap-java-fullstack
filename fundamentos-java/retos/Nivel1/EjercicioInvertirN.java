package Nivel1;
/*
**Invertir un número** 

- Entrada: `1234`
- Salida: `4321`
- Sin usar strings (solo matemáticas)
*/
import java.util.Scanner;

public class EjercicioInvertirN {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int numero ;
        System.out.println("Ingrese un número: ");
        numero = Integer.parseInt(sc.nextLine());
        System.out.println(InvertirNumero(numero));

        sc.close();
    }
    public static int InvertirNumero(int numero){
        int numeroInvertido = 0;
        int ultimodigito =0;
      
        int numeroSinDigito;
      
        int digito = (int)Math.log10(numero)+ 1; //Esto lo encontré en un foro 
        //se le asi: Para 1234: log10(1234) ≈ 3.09 → 3 + 1 = 4 dígitos
        numeroSinDigito = numero;
        for (int i= 0; i < digito; i++){

                ultimodigito = numeroSinDigito % 10 ; // 1234 % 10 = 4
                numeroSinDigito=numeroSinDigito/10; // 1234 / 10 = 123
                numeroInvertido = (numeroInvertido * 10) + ultimodigito; // 4
               

                System.out.println("Dentro del for: " + ultimodigito);
                 System.out.println("Dentro del for: " + numeroInvertido);
        };

        return numeroInvertido;
    }
}


/*
En este código sufri para entender que no solamente tengo que pensar en guardar, en este caso era mejor desplazar los numeros. 
En la mejora, no sentí haber mejorado mi logica, pero si se que aprendi a identificar mas rapido los posibles errores e igual tuve que pedir ayuda a la IA pero solo para que me dijera mis problemas de lógica.



          //Ahora hacerlo patras

            primerdigito = numeroInvertido%10;
            numeroConDigito = numeroConDigito/10;
            numeroCorrecto = (numeroCorrecto * 10) + primerdigito;
 */