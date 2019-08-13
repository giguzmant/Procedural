import java.util.*;

public class Ejercicio002_3007 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        System.out.println("Ingrese el primer numero");
        a = Teclado.nextInt();

        System.out.println("Ingrese el segundo numero");
        b = Teclado.nextInt();

        if (a==b){
            System.out.println("Son iguales");
        }
        else{
            if(a>b){
                System.out.println("El primer numero es mayor");
            }else{
                System.out.println("El segundo es mayor");

            }

            }
        }



    }
