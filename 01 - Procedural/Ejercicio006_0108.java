import java.util.*;
/**
Una compañia de paqueteria internacional tiene servicio en algunos paises de America del Norte, 
America Central, America del sur, Europa y Asia. El  costo por el servicio de paqueteria 
se basa en el peso del paquete y la zona a la que va dirigido. Se demuestra en la tabla:

Zona 1 America del Norte $11.00
Zona 2 America central $10.00
Zona 3 America del Sur $12.00
Zona 4 Europa $24.00
Zona 5 Asia $27.00


Parte de su politica implica que los paquetes con un peso superior a 5kg no son transportados, 
esto por cuestiones logisticas y de seguridad. Realice un algoritmo el COBRO POR LA ENTREGA, 
O RECHAZO DE LA ENTREGA. 

 */
public class Ejercicio006_0108 {

    

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
     int peso=0;
     int zona=0;
     double costo=0;

     System.out.print("Cuantos gramos pesa el paquete?");
     peso = Teclado.nextInt();

     System.out.print("A que zona va?");
     zona = Teclado.nextInt();


     if(peso>5000){
        System.out.print("No se puede dar el servicio");}
            switch (zona){
            case 1:
                costo=peso*11;
             break;
             case 2:
               costo=peso*10;
             break;
             case 3:
                 costo=peso*12;
             break;
             case 4:
                 costo=peso*24;
             break;
              case 5:
                 costo=peso*27;
             break;
     
                default:
             break;  }
    if(peso<5000){
        System.out.print("El costo de envio sera: " + costo );
    }  
        

    }
    }