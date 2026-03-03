package Nivel1;
/*
### 2️⃣ Contar dígitos

**Condiciones:**

- No convertir el número a texto
- El conteo debe depender de cuántas veces “reduces” el número
- El resultado debe ser independiente del valor específico

👉 Evalúa: **control de bucle + condición de parada**
 */
public class EjercicioContarDig {
    
    public static void main (String[] args){
        int numero = 12345;
        System.out.println("La longitud es: "+  ContadorDigito(numero));
       
    };

    public static int ContadorDigito( int n){
        int numeroInvertido = 0;
        int contador = 0 ;
        int ultimodigito;
        int numeroSinDigito = n;
 

        do{
            ultimodigito = numeroSinDigito%10;
            numeroSinDigito = numeroSinDigito/10;
            contador+=1;
            numeroInvertido = (numeroInvertido * 10) + ultimodigito;  
    
  


 
             
        } while(numeroSinDigito != 0);

        return contador;
    }
}

/*

    1
    2
    3
    4

*/