package estructurasControlIf;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un número ");
        numero = teclado.nextInt();

        switch (numero) {
            case 1:
                System.out.println("SWITCH: El número es uno ");
                break;
            case 2:
                System.out.println("SWITCH: El número es dos ");
                break;
            default:
                System.out.println("SWITCH: Es otro número distinto de uno y dos ");
        }

        if (numero == 1) {
            System.out.println("IF: El número es uno ");
        } else if (numero == 2) {
            System.out.println("IF: El número es dos ");
        } else {
            System.out.println("IF: Es otro número distinto de uno y dos ");
        }
    }
}


/*
*
* 1. Meter un número desde el teclado, si es uno, sacar por
pantalla: "El número es uno"; si es dos, sacar por pantalla
"el número es dos", y si es cualquier otro número sacar por
pantalla: "es otro número distinto de uno y dos".
*
 */