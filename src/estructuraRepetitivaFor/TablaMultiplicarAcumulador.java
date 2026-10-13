package estructuraRepetitivaFor;

import java.util.Scanner;

public class TablaMultiplicarAcumulador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int MULTIPLICANDO = 7;
        final int MULTIPLICADOR_MAXIMO = 10;
        int multiplicador = 0;
        int resultado = 0;

        // Opción multiplicador máximo por teclado
        /*
         * System.out.print("Introduce el multiplicador máximo: ");
         * MULTIPLICADOR_MAXIMO = teclado.nextInt();
         */

        System.out.println("Tabla de multiplicar del 7 ");

        for (resultado = 0; resultado <= MULTIPLICADOR_MAXIMO; resultado+=MULTIPLICANDO) {
            multiplicador++;
            System.out.println(MULTIPLICANDO+" * " + multiplicador + " = " + resultado);
        }

    }
}
