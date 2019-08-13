import java.util.*;

/** Dado un conjunto de 15 valores positivos, crear un programa que imprima un valor maximo
  dentro del conjunto y posicion selectiva
 
 */

public class Ejercicio004_3107 {

    
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Ingrese 15 numeros: ");
        
        int maximo = 0, i, numero;
        
        for (i=1; i<=15; i++){
            numero = Teclado. nextInt();
                if(i==1)
                    maximo = numero;
                else if (numero>maximo)
                    maximo = numero;

        }
        System.out.print("El maximo es: " + maximo);
        
    }
}
