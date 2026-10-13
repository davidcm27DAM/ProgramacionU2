package estructuraRepetitivaFor;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int MULTIPLICANDO = 7;
        final int MULTIPLICADOR_MAXIMO = 10;
        int multiplicador;

        // Opción multiplicador máximo por teclado
        /*
         * System.out.print("Introduce el multiplicador máximo: ");
         * MULTIPLICADOR_MAXIMO = teclado.nextInt();
         */

        System.out.println("Tabla de multiplicar del 7 ");

        for (multiplicador = 1; multiplicador <= MULTIPLICADOR_MAXIMO; multiplicador++)
            System.out.println(MULTIPLICANDO+" * " + multiplicador + " = " + (MULTIPLICANDO * multiplicador));


    }
}

/*
1 0
1 1
2 0
2 1
fin
 */





/*
 * Hacer un programa que nos permita imprimir por pantalla
 * la tabla de multiplicar del 7
 * con la siguiente estructura:
 * Tabla de multiplicar del 7
 * 7 * 1 = 7
 * 7 * 2 = 14
 * 7 * 3 = 21
 *
 *etc
 * Si queremos multiplicar hasta n, no se ha de modificar ni una sola línea de código
 */