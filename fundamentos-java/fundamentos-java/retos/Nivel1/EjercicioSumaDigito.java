package Nivel1;
/*
### 3️⃣ Suma de dígitos

**Condiciones:**

- Separar cada dígito
- Acumular la suma
- El número original debe reducirse en cada paso

👉 Evalúa: **extracción + acumulación**
 */
public class EjercicioSumaDigito {
    
    public static void main(String[] args){
        int numero = 12345;
        System.out.println("La suma del número: " + numero + " es "+ SumarDigitos(numero));
    }
    
    public static int SumarDigitos(int numero){ 
        int acumulador=0;
        int separadordigito = 0;
        int restante = numero;
        do { 
            separadordigito = restante % 10;
            restante = restante/10;
            acumulador += separadordigito;
            System.out.println("Acumulador: " + acumulador);
            System.out.println("Restante: " + restante);
            System.out.println("Digito separado: "+ separadordigito);
        }while(restante!=0);

        return acumulador;
    }

    
}
/*

A la final si use la logica de que cada vez que se iteraba y se "desplazaba" un digito lo verificaba con el while para que parara
y recicle la logica de ejercicios pasados para este nuevo ejercicio, de hecho en un ejercicio tenia que hacer de numeros primos y accidentalmente (error) resolvi este ejercicio pero ahora si lo use como es.
*/
