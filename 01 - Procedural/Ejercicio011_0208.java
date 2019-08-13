/**
 * Dado 10 numeros que representan edades calcular el promedio, imprimir 
 * y luego, imprimir todas las edades que ingresan.
 */
import java.util.*;

public class Ejercicio011_0208 {

    

    
 public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[] edades = new int[10]; //es un array, el corchete es para declarar que es un array de 
        //valor int, la segunda para es la posiciones que toma el array

        for(int i = 0; i<10; i++){
            System.out.print("Ingrese nro: " + i + "\n" );
        
            int numero;
            numero = Teclado.nextInt();

            edades [i] = numero;
      //ESTE INGRESA  
        }

        int suma = 0;
        int prom = 0;
        
        for(int i = 0; i<10; i++){
            suma = suma + edades[i];}

        prom = suma/10;
        System.out.print("El promedio es: " + "\n" + prom+"\n");
        System.out.print("\n"+"Edades recibidas" + "\n");

        for(int i = 0; i<10;i++){
            System.out.print("\n" + "Edad " + edades [i]+ "\n" );
        //IMPRIME
       }






    }
}