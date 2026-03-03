import java.util.*;
public class EjercicioMayorMenor {
    public static void main (String[] args){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int longitud=0;
        System.out.println("Ingrese la cantidad de datos que van a ir en el ArrayList: ");
        longitud = sc.nextInt();
        for (int i = 0; i < longitud; i++){
            System.out.println("Ingrese el elemento: ");
            lista.add(sc.nextInt()) ;
        }
        mayorMenor(lista);
        sc.close();
    }
    public static void mayorMenor(ArrayList<Integer> lista){
        int actual = lista.get(0);
        int ultimo = lista.get(0);
        for (int i = 1; i < lista.size(); i++){
            if (lista.get(i) > actual){
                actual = lista.get(i);
            }
            if (lista.get(i) < ultimo) {
                ultimo = lista.get(i);
            } 
        }
        System.out.println("El valor mayor es: "+ actual);
        System.out.println("El valor menor es: "+ ultimo);
    }
}
/*¨
20
3
41
5           ultimo = 0
0           presente = 41
5           i = 3
9
20
1
2
*/
