package Nivel1;
/*
    🟦 Ejercicio P4 – Clasificación numérica

Determinar si un número es:

perfecto

abundante

deficiente

👉 Refuerza comparación final y toma de decisiones.

🎯 Regla clara para avanzar

Si puedes resolver 2 o 3 de estos sin atascarte, entonces:

🚀 Pasamos oficialmente al NIVEL 2 – Arrays y listas

Sin volver atrás.
*/
public class EjercicioP4 { 
    public static void main(String[] args){
        int numero =  6; 

        System.out.println(CalcularNumPerfect(numero));

    }

   

    public static boolean CalcularNumPerfect(int numero){
        boolean resultado = true;
        int cajita = 0;
                for (int i = 1; i<  numero; i++){
                    if (numero % i == 0 ){
                        cajita += i;
                    }
                }
                System.out.println("Cajita: "+cajita);
                if (cajita == numero){

                    System.out.println("Es perfecto");
                    resultado = true;

                } else if(cajita > numero){
                    System.out.println("Abundante");
                    resultado = true;
                } else {
                    System.out.println("Es Deficiente");
                    resultado = false;
                }
                  
        return resultado; 
    
    }

 
}
