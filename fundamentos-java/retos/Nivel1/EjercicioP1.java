package Nivel1;
/*
    🟦 Ejercicio P1 – Máximo dígito de un número

Dado un número entero positivo, encontrar su dígito mayor.

Evalúa:

extracción de dígitos

comparación continua

estado máximo

👉 Patrón que usarás TODO el tiempo en arrays luego
*/

public class EjercicioP1 {
    public static void main(String[] args){
        int numero = 12345;
      
        if(numero<0){
            System.out.println("No se puede entrar negarivos");
        } else{
              System.out.println("El máximo degito de: " + numero + " es: " + MaximoDigito(numero) );
        }
    }
    public static int MaximoDigito(int numero){
 
        int ultimoDigito = 0;
        int numeroSinDigito = numero;
        int numeroMayor = 0;
   
        do{
            ultimoDigito = numeroSinDigito%10;// 0 = 5197 % 10 = 7
            numeroSinDigito = numeroSinDigito/10; // 519
       
            System.out.println("El ultimo digito fuerda de la primera condición"+ ultimoDigito);
    
                System.out.println("El ultimo digito es fuera de la condición: "+ ultimoDigito);
               if (ultimoDigito > numeroMayor){
                numeroMayor = ultimoDigito;
               }
            

        }while(numeroSinDigito!=0);

        return numeroMayor;
    }

}
