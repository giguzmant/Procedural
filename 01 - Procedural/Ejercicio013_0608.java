import java.util.*;

//String de oracion seguida, llamaremos la funcion de arrayde char

public class Ejercicio013_0608 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
       
        int vocales=0;
        int espacio=0;
        int punto=0;
 

        System.out.println("Ingresa oracion: ");
        String oracion = Teclado.nextLine();
        char letras [] = oracion.toCharArray();

       

        for( int i=0; i < letras.length; i++){

            if (hayVocal(letras[i])){
                vocales++;
            }else if (letras[i] == ' '){
                espacio++;
            }else if(letras[i]== '.'){
             punto++; 
            }
        }

             
    System.out.println("Vocales: " + vocales);
    System.out.println("Espacios: " + espacio);
    System.out.println("Puntos: " + punto); }

    static boolean hayVocal(char caracter2){
        switch (caracter2) {
            case 'A':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            }
            return false;
        }


    }
        
    






    