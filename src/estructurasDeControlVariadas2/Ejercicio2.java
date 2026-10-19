package estructurasDeControlVariadas2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int LIMITE = 8;
        int numeroTeclado = 0;

        do {
            System.out.print("Introduce un número: ");
            numeroTeclado = sc.nextInt();

            System.out.print(numeroTeclado);
            if (numeroTeclado > LIMITE) {
                System.out.println(" / " + numeroTeclado * 2);
            } else {
                System.out.println(" / " + numeroTeclado * 3);
            }
        } while (numeroTeclado != 0);

        System.out.println("\"FIN\"");

    }
}




/*
2. Hacer un programa que nos permita introducir números por
el teclado hasta pulsar el cero. Debemos visualizar cada
número por pantalla y comprobar si es mayor de 8; si lo es,
debemos visualizar su doble, en caso contrario su triple.
Al finalizar el programa visualizar "Fin".
 */