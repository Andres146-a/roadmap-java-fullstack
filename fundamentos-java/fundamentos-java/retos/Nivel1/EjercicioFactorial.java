package Nivel1;
/*
    ### 5️⃣ Factorial

**Condiciones:**

- El resultado depende del producto acumulado
- El orden importa
- No usar fórmulas predefinidas

👉 Evalúa: **pensamiento iterativo multiplicativo**
*/


public class EjercicioFactorial{
    public static void main(String[] args){
        int numero = 7;
        System.out.println(Factorial(numero));
   

    }

    public static int Factorial (int numero){
        int resultado = 1;
        for (int i = numero; i > 0; i-- ){
            resultado = resultado * i;
            System.out.println("El resultado es: " + resultado);
        }
        return resultado;
    }
}
/*
    numero 7
    i = 7 
        7 > 0 
    resultado = 7
    i = 6 
        6 > 0 
    resultado

    Listo, este ejercicio si tuve que pensar bien en como hacer la condición del bucle.
*/