package estructurasDeControlVariadas1;

import java.util.Scanner;

public class CalcularFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int VALOR_MINIMO = 0;
        final int VALOR_MAXIMO = 7;
        int numero = 1;
        int factorial = 1;

        do {
            System.out.print("Introduzca un número positivo menor que siete \npara calcular su factorial: ");
            numero = sc.nextInt();

            if (!(numero > VALOR_MINIMO && numero < VALOR_MAXIMO)) {
                System.out.println("El número introducido es incorrecto. ");
            }

        } while (!(numero > VALOR_MINIMO && numero < VALOR_MAXIMO));

        for (int contador = numero; contador > 1; contador--) {
            factorial *= contador;
        }

        System.out.println(numero + "! = " + factorial);

    }

}



/*
 * Calcular el factorial de un número positivo (introducir por teclado) menor que siete.
 * (Validar por programa)
 * El factorial de 0 siempre es 1.
 *
 * Si introduzco un número inválido, me debe permitir introducir nuevamente un número,
 * hasta que introduzca un número válido
 *
 * 2. Calcular el factorial de un número positivo menor que 7
(validar por programa).
NOTA: eL factorial de un número cualquiera se calcula
multiplicando desde 1 hasta el mismo número. Por ejemplo:
5! = 1*2*3*4*5 = 120.
El factorial de cero es siempre 1.
 */