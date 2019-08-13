import java.util.*;

/**Un empleado de la tienda “Tiki Taka” realiza N ventas durante el día, se requiere
saber cuántas de ellas fueron mayores a $1000, cuántas fueron mayores
a $500 pero menores o iguales a $1000, y cuántas fueron menores o
iguales a $500. Además, se requiere saber el monto de lo vendido en cada
categoría y de forma global. */

public class Ejercicio005_3107 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        int mayor_1000, mayor_500_menor_mil, menor_500;
        int num_ventas, i ;
        double mont_venta = 0;
        
        mayor_1000 = 0;
        mayor_500_menor_mil = 0;
        menor_500 = 0;

        num_ventas = 1;
        double tot_vent_a = 0;
        double tot_vent_b = 0;
        double tot_vent_c = 0;
        double tot_vent_abc = 0;

        System.out.print("Ingrese cantidad de ventas: ");
        num_ventas = Teclado.nextInt();

        for(i=1; i<=num_ventas; i++){
             System.out.print("Ingrese el valor de la venta: ");
             mont_venta = Teclado.nextDouble();

             if(mont_venta>1000){
                mayor_1000=mayor_1000+1;
                tot_vent_a = tot_vent_a + mont_venta;

             }else if(mont_venta>500 && mont_venta<1000){
                mayor_500_menor_mil=mayor_1000+1;
                tot_vent_b = tot_vent_b + mont_venta;

             }else if(mont_venta<500){
                    menor_500=menor_500+1;
                    tot_vent_c = tot_vent_c + mont_venta;

                }
                }
        
         tot_vent_abc=tot_vent_abc+mont_venta;
    

        System.out.println("Ventas mayores a $1000: " + mayor_1000);
        System.out.println("Ventas mayores a $500 y menores a $1000: " + mayor_500_menor_mil);
        System.out.println("Ventas menores a $500: " + menor_500);

        System.out.println("Ventas tipo A: " + tot_vent_a);
        System.out.println("Ventas tipo B: " + tot_vent_b);
        System.out.println("Ventas tipo C: " + tot_vent_c);

        System.out.println("Total de ventas: " + tot_vent_abc);









        


         
        
    }

    
}