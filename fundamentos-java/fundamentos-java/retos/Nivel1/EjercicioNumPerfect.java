package Nivel1;
/*
### 4️⃣ Número perfecto

**Condiciones:**

- Probar divisores desde 1 hasta antes del número
- Solo sumar divisores exactos
- Comparar suma final con el número original

👉 Evalúa: **uso correcto de `if` dentro de bucles**### 4️⃣ Número perfecto

**Condiciones:**

- Probar divisores desde 1 hasta antes del número
- Solo sumar divisores exactos
- Comparar suma final con el número original

👉 Evalúa: **uso correcto de `if` dentro de bucles**
*/

public class EjercicioNumPerfect {
    public static void main (String[] args){
        int numeroPerfecto = 6;
        System.out.println("El número : " + CalcularNumeroPerfecto(numeroPerfecto));
    };

    public static int CalcularNumeroPerfecto(int numero){
        int resultado = 0;
        if (numero < 0){
            System.out.println("Los números negativos no pueden ser perfectos");
            return 0; 
        }
       for (int i = 1; i < numero; i++){
        if (numero % i == 0){  
            resultado += i;
        } 

       }
       if (resultado == numero){
            System.out.println("El numero es perfecto");
       } else {
        System.out.println("El numero NO es perfecto");
       }

        return numero;

    }

}

/*
La verdad este si lo pensé a la primera, no codifique de una, probe antes y luego a la primera ejecución, salio.
Asi que si sentí que mejoré un poco en la logica. 

*/