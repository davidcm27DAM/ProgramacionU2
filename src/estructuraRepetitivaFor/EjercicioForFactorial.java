package estructuraRepetitivaFor;

import java.util.Scanner;

public class EjercicioForFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int VALOR_MINIMO = 0;
        final int VALOR_MAXIMO = 7;
        int numero = 1;
        int factorial = 1;

        do {
            System.out.print("Introduzca un número positivo menor que siete: ");
            numero = sc.nextInt();


            if (!(numero > VALOR_MINIMO && numero < VALOR_MAXIMO)) {
                System.out.println("El número introducido es incorrecto. ");
            }

        } while (!(numero > VALOR_MINIMO && numero < VALOR_MAXIMO) );

        for (int contador = numero; contador > 1; contador--) {
            factorial *= contador;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}



/*
 * Calcular el factorial de un número positivo (introducir por teclado) menor que siete.
 * (Validar por programa)
 * El factorial de 0 siempre es 1.
 *
 * Si introduzco un número inválido, me debe permitir introducir nuevamente un número,
 * hasta que introduzca un número válido
 */