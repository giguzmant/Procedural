import java.util.*;

/** Dado un conjunto de valores cada uno de los cuales representa el sueldo de un empleado excepto 
 el ultimo que es cero e indique el fin del conjunto. Desarrollar un programa que determine
 e imprime cuantos empleados ganan menos de $520, cuantos entre $520 y $780, cuantos entre $780 
 y $999 y cuantos mas de $999.
   */ 

public class Ejercicio003_3107 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        double sueldo;
        int emple_menos_520, emple_mas_520_menos_780, emple_mas_780_menos_999, emple_mas_999;

        int cant_empleados, i;

        emple_menos_520 = 0;
        emple_mas_520_menos_780 = 0;
        emple_mas_780_menos_999 = 0;
        emple_mas_999 = 0;

        System.out.print("Ingrese cantidad de empleados:");
        cant_empleados = Teclado.nextInt();

        for (i=1; i<=cant_empleados; i++){
            System.out.print("Ingrese sueldo de los empleados: ");
            sueldo = Teclado.nextDouble();

            if (sueldo<520)
                emple_menos_520++;
                else if(sueldo>520 && sueldo<780)
                emple_mas_520_menos_780++;
                    else if(sueldo>780 && sueldo<999)
                    emple_mas_780_menos_999++;
                        else {
                          emple_mas_999++;}



        }


        
        
         System.out.println("Empleados que ganan menos de $520: " + emple_menos_520);
         System.out.println("Empleados que ganan mas de $520 y menos de $780: " + emple_mas_520_menos_780);
         System.out.println("Empleados que ganan mas de $780 y menos de $999: " + emple_mas_780_menos_999);
         System.out.println("Empleados que ganan mas de $999: " + emple_mas_999);



    }
}
