package estructurasRepetitivasTeoria;

import java.util.Scanner;

public class EstructuraWhileEjercicio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        int numero = -1;

        while (numero != 0) {
            System.out.print("Introduce un número: ");
            if (teclado.hasNextInt()) {
                numero = teclado.nextInt();
            } else {
                System.out.println("Error: no has introducido un número. ");
                teclado.nextInt();
            }
            if (numero != 0) {
                System.out.println("El número introducido es: " + numero);
                contador++;
            }

        }
        System.out.println("Se han introducido " + contador + " números. ");
    }
}


/*
Hacer un programa que nos permita introducir una serie de números por el teclado
hasta introducir el 0
por cada número distinto de 0, se debe visualizar por pantalla
y al final se debe visualizar cuántos números se han introducido

 */