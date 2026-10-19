package estructurasDeControlVariadas1;

import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int VALOR_MINIMO = 1;
        final int VALOR_MAXIMO = 20;
        int numero = 0;
        int sumaNaturales = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        int sumaCuadrados = 0;
        int contadorWhile = 1;

        do {
            System.out.println("Introduce un número por teclado entre 1 y 20, inluidos: ");
            numero = sc.nextInt();

            if (numero < VALOR_MINIMO || numero > VALOR_MAXIMO) {
                System.out.println("Número incorrecto. Vuelve a intentarlo. ");
            }
        } while (numero < VALOR_MINIMO || numero > VALOR_MAXIMO);

        for (int contador = 1; contador <= numero; contador++) {
            sumaNaturales += contador;
            if (contador % 2 == 0) {
                sumaPares += contador;
            } else {
                sumaImpares += contador;
            }
            sumaCuadrados += (int) Math.pow(contador, 2);
        }

        System.out.println("Resultados con for: " +
                "\nSuma de los " + numero + " primeros números naturales es: " + sumaNaturales +
                "\nSuma de los números pares es: " + sumaPares +
                "\nSuma de los números impares: " + sumaImpares +
                "\nSuma de los cuadrados es: " + sumaCuadrados);

        sumaNaturales = 0;
        sumaPares = 0;
        sumaImpares = 0;
        sumaCuadrados = 0;

        while (contadorWhile <= numero) {
            sumaNaturales += contadorWhile;
            if (contadorWhile % 2 == 0) {
                sumaPares += contadorWhile;
            } else {
                sumaImpares += contadorWhile;
            }
            sumaCuadrados += (int) Math.pow(contadorWhile, 2);
            contadorWhile++;
        }

        System.out.println("Resultados con while: " +
                "\nSuma de los " + numero + " primeros números naturales es: " + sumaNaturales +
                "\nSuma de los números pares es: " + sumaPares +
                "\nSuma de los números impares: " + sumaImpares +
                "\nSuma de los cuadrados es: " + sumaCuadrados);

    }
}


/*
*
* 1. Hacer un programa que nos permita introducir por el
    teclado un valor “n” positivo entre 1 y 20 (validarlo
    mediante programa). Calcular la suma de los “n” primeros
    números naturales, la suma de los números pares, los
    impares y los cuadrados. Finalmente mostrar resultados en
    pantalla.
 */