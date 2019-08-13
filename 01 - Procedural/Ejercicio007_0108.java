import java.util.*;
public class Ejercicio007_0108 {

    public static Scanner Teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        int cobro, horas;
        System.out.print("Ingrese el valor de horas que estuve en el estacionamiento: ");
        horas = Teclado.nextInt();

        cobro=0;
        if(horas<=2)
            cobro=horas*5;
        if(horas>2&&horas<=5)
            cobro=2*5+(horas-2)*4;
        if(horas>5&&horas<=10)
            cobro=2*5+3*4+(horas-5)*3;
        if(horas>10)
            cobro=(2*5)+(3*4+3*5)+(horas-10)*2;
        System.out.println("Valor del estacionamiento: " + cobro);
        
    }

}