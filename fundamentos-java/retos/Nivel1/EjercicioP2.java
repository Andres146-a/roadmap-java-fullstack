package Nivel1;
/*
    🟦 Ejercicio P2 – Contar un dígito específico

Contar cuántas veces aparece el dígito d en un número.

Condiciones:

sin strings

reducción progresiva

contador condicionado

👉 Esto luego se convierte en frecuencia de elementos (Nivel 2).
*/

public class EjercicioP2 {

    public static void main(String[] args){

        int numero = 1222435534;
        int numeroAbuscar = 2;
        System.out.println("Número ingresado: " + numero );
        System.out.println("Veces que se repite el número: " + numero + " - " + FrecuenciaNum(numero, numeroAbuscar) );
    };

    public static int FrecuenciaNum(int numero, int numeroAbuscar){

        int contador = 0; 
        int longitud = SacarLongitud(numero);
        int ultimoDigito = 0; 
        int numeroSinDigito = numero; 
        for(int i = 0 ; i < longitud; i++){
            ultimoDigito = numeroSinDigito % 10;
            numeroSinDigito = numeroSinDigito / 10;

            if (ultimoDigito == numeroAbuscar){
                contador+=1;
                System.out.println("Debug");
            }

        };
        return contador;

    }

    public static int SacarLongitud(int numero){

        int ultimoDigito = 0 ;
        int numeroSinDigito = numero; 
        int longitud = 0;
        do {
            ultimoDigito = numeroSinDigito % 10; 
            numeroSinDigito = numeroSinDigito / 10;
            longitud += 1;

        }while(numeroSinDigito != 0);

        return longitud;

    }


}
