import java.util.*;
//ERA SWITCH CASE//CORREGIR


public class Ejercicio008_0108 {

    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) {

        int nota;

        System.out.print("Ingrese la calificacion: ");
        nota = Teclado.nextInt();

        switch (nota) {
            case 10:
                System.out.println("La calificacion correspondiente es 'A'");
                break;

            case 9:
                System.out.println("La calificacion correspondiente es 'B'");
                break;
            
            case 8:
                System.out.println("La calificacion correspondiente es 'C'");
                break;
                
            case 7:
                System.out.println("La calificacion correspondiente es 'C");
                break;

            case 6:
                System.out.println("La calificacion correspondiente es 'D'");
                break;

            case 5:
                System.out.println("La calificacion correspondiente es 'F'");
                break;
                
            case 4:
                System.out.println("La calificacion correspondiente es 'F'");
                break;
            
            case 3:
                System.out.println("La calificacion correspondiente es 'F'");
                break;

            case 2:
                System.out.println("La calificacion correspondiente es 'F'");
                break;

            case 1:
                System.out.println("La calificacion correspondiente es 'F'");
                break;

            case 0:
                System.out.println("La calificacion correspondiente es 'F'");
                break;

            default:
                break;
        }

        
    
}
}