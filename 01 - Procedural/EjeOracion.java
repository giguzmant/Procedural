import java.util.*;

/**
 * EjeOracion
 */
public class EjeOracion {

    public static void main(String[] args) {

        int cantVocales = 0;
        int cantEspacios = 0;
        int cantPuntos = 0;

        char caracter;

        System.out.println("Igrese caracter por caracter hasta el punto(.)");
        Scanner teclado = new Scanner(System.in);

        caracter = teclado.nextLine().charAt(0);

        while (caracter != '.') {

            if (esVocal(caracter)) {
                cantVocales++;
            } else if (caracter == ' ') {
                cantEspacios++;

            }

            caracter = teclado.nextLine().charAt(0);

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