package estructurasControlIf;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int miEdad;
        int edadCompa;

        System.out.println("Introduce tu edad: ");
        miEdad = teclado.nextInt();
        System.out.println("Introduce la edad de tu compañero ");
        edadCompa = teclado.nextInt();

        if (miEdad < edadCompa) {
            System.out.println("Soy más joven que mi compañero. ");
        } else if (miEdad > edadCompa) {
            System.out.println("Mi compañero es más joven que yo ");
        } else {
            System.out.println("Somos de la misma edad ");
        }

    }
}

/*
2. Meter por teclado tu edad y la de tu compañero. Si eres
más joven que tu compañero visualiza: "soy más joven que mi
compañero", en caso de que sea tu compañero más joven
visualiza: "mi compañero es más joven que yo", y si sois de
la misma edad: "somos de la misma edad".
 */