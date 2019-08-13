import java.util.*;

public class Ejercicio000_3007 {

    
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;
        
        System.out.println("Ingrese el primer valor:");
        a = Teclado.nextInt();

        System.out.println("Ingrese el segundo valor:");
        b = Teclado.nextInt();
        
        c = a + b;

        System.out.println("el resultado de la suma es: " + c);
    }
}