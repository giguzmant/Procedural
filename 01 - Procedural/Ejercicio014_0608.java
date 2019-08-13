import java.util.*;

//DEVOLVER LA SUMA DE ELEMENTOS DEUN ARRAY. EL NRO 13 ES DE MALA SUERTE ASI QUE NO DEBE SUMARSE.
//IGNORAR TAMBIEN EL NRO SIGUIENTE AL 13

public class Ejercicio014_0608 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

      int n;
      int suma = 0;

      System.out.println("Ingrese cantidad de numeros");
      n = Teclado.nextInt;

      boolean hay13=false;
      
      //declaro el array de n posiciones
      
        int [] nros= new int [n]; //la longitud va a ser de los numeros anotados

      //ciclo for que recorre el array para llenarlo

      for (int i = 0; i < n; i++){
      System.out.println("Ingrese el numero");

      nro[i] = Teclado.nextInt;
      }
      //recorro y pregunto por 13
      for(int i = 0; i < n; i++){
          if (nro[i]==13){//chequear banderas - flags
              hay13=true;
          }else if(!hay13){
              suma=suma+nro[i];
          }else{
              hay13=false;
          }
      }

      System.out.println("La suma es " + suma);





         
        
}
}