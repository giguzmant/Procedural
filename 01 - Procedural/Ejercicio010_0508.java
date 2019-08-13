import java.util.*;

/**
 * EjeOracion
 */
public class Ejercicio010_0508 {

    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) {

        int cantVocales = 0;
        int cantEspacios = 0;
        int cantPuntos = 0;

        char caracter;

        System.out.println("Ingrese caracter por caracter hasta el punto(.)");
        caracter = Teclado.nextLine().charAt(0);

        while (caracter != '.') {

            if (esVocal(caracter)) {
                cantVocales++;
            } else if (caracter == ' ') {
                cantEspacios++;

            }

            caracter = Teclado.nextLine().charAt(0);

        }

        cantPuntos++;

        System.out.println("Vocales " + cantVocales);
        System.out.println("Espacios " + cantEspacios);
        System.out.println("Puntos " + cantPuntos);
    }

    static boolean esVocal(char caracter2) {

        switch (caracter2) {
        case 'A':
        case 'a':
        case 'E':
        case 'e':
        case 'é':
        case 'i':
        case 'o':
        case 'u':
            return true;
        }
        return false;
    }

}