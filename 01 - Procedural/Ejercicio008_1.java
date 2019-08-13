import java.util.*;
public class Ejercicio008_1 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        double nota;
        System.out.print("Ingrese el valor de calificacion: ");
        nota = Teclado.nextInt();
        Teclado.nextLine();
        
        
        if(nota==10)
            System.out.println("Te sacaste una A, sos alto genio, amigue");
        if(nota==9)
            System.out.println("Te sacaste una B, tus viejos te van a cagar a pedo");
        if(nota==8)
            System.out.println("Te sacaste una C, aguante vos");
        if(nota==7)
            System.out.println("Te sacaste una D, tecnicamente estas aprobado");
        if(nota==6)
            System.out.println("Te sacaste una E, mis viejos se estarian arrancandose los lopes");
        if(nota<=5)
            System.out.println("Te sacaste una F, mal ahi");
    }

{
    }
}