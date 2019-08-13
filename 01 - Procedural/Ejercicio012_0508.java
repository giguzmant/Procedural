import java.util.*;

/** Dados dos arrays de numeros enteros de 7 posiciones, generar un tercer array de 7 posiciones
 donde cada elemento sea la suma de los 2 arrays anteriores
 */

public class Ejercicio012_0508 {


    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int [] conjuntoA = new int [7];
        int [] conjuntoB = new int [7];
        int [] conjuntoC = new int [7];

        for (int i = 0; i < 7; i ++){
        
            
			System.out.println("Ingrese el numero " + (i+1)  + " del conjunto 'A' ");
           
            conjuntoA [i]=Teclado.nextInt();

            //puedo hacer conjuntoA[i]=Teclado.nextInt();

            System.out.println("Ingrese el numero " + (i+1)  + " del conjunto 'B' ");
           
            conjuntoB[i]=Teclado.nextInt();
           
            //puedo hacer conjuntoB[i]=Teclado.nextInt();

            conjuntoC[i]=conjuntoA[i]+conjuntoB[i];

            //suma y hace lo del conjunto adentro

        }

        for (int i=0; i < 7; i ++){

            System.out.println("La suma del conjunto A y del conjunto B es: " + conjuntoC[i]);
        }
            //imprime afuera
        }

       

        








    }