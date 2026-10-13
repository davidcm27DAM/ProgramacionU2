package estructuraRepetitivaFor;

import java.util.Scanner;

public class EstructuraFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tope;
        int valorInicial;

        System.out.print("Introduce el valor máximo que quieres mostrar: ");
        tope = teclado.nextInt();

        for (valorInicial = 1; valorInicial <= tope; ++valorInicial) {
            System.out.println(valorInicial);
        }

    }
}


/*
 * Hacer un programa que nos permita visualizar los números consecutivos,
 * empezando por el 1,
 * hasta un valor de n
 */