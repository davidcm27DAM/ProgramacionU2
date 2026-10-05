package alternativa;

import java.util.Scanner;

public class SwitchAlternativa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numTeclado;

        System.out.println("Introduce un número: ");
        numTeclado = teclado.nextInt();

        switch (numTeclado) {
            case 1:
                System.out.println("Enero ");
                break;
            case 2:
                System.out.println("Introduce 'b' si es bisiesto ");
                char bisiesto = teclado.next().toLowerCase().charAt(0);
                System.out.println("Febrero ");
                switch (bisiesto) {
                    case 'b':
                        System.out.println("Es bisiesto");
                        break;
                    default:
                        System.out.println("No es bisiesto ");
                }
                break;
            case 3:
                System.out.println("Marzo ");
                break;
            case 4:
                System.out.println("Abril ");
                break;
            case 5:
                System.out.println("Mayo ");
                break;
            default:
                System.out.println("No es ningún mes desde enero a mayo ");
                break;

        }
        System.out.println("Continuará... ");

    }
}

/*
 * En el caso del mes de febrero se debe introducir desde teclado un carácter
 * si es una 'b' debemos visualizar "año bisiesto"
 * en caso contrario, se visualizará "el año no es bisiesto
 */