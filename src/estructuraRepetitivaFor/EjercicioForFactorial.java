package estructuraRepetitivaFor;

import java.util.Scanner;

public class EjercicioForFactorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        int factorial = 1;

        do {
            System.out.print("Introduzca un número positivo menor que siete: ");
            numero = sc.nextInt();
            if (numero < 1 || numero > 7) {
                System.out.println("El número introducido es incorrecto. ");
            }

        } while (numero < 1 || numero > 7);

        for (int contador = numero; contador > 0; contador--) {
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