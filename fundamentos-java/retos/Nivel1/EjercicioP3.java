package Nivel1;
/*
    🟦 Ejercicio P3 – Potencia iterativa

Calcular a^b sin usar Math.pow

Condiciones:

multiplicación acumulada

bucle controlado

manejar b = 0

👉 Es el primo hermano del factorial, pero más general.
*/
public class EjercicioP3 {
    public static void main (String[] args){
        int base = 2;
        int expo = 4;

        if (expo == 0){
            System.out.println("No se puede");

        } else {
            CalcularPotencia(base, expo);
        }

    };

    public static int CalcularPotencia(int base, int expo){
        int resultado = base; 

        for (int i= 1; i < expo; i++  ){
            resultado = resultado * base; 
            System.out.println("i: " + i);
            System.out.println("resultado = " + resultado);
        }

        return resultado; 
    }
}
