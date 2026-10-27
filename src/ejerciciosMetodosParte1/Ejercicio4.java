package ejerciciosMetodosParte1;

import java.util.Scanner;

public class Ejercicio4 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int numero = solicitarNumeroPositivo();
        // imprimirPatron(numero);
        controlarPatron(numero);
    }

    public static int solicitarNumeroPositivo() {

        /*
        int numero = 0;
        System.out.print("Introduce un número natural positivo: ");
        while (true) {
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    return numero;
                }
            }
            sc.nextLine();
            System.out.print("Valor no válido. Introduzca un número natural positivo: ");
        }

         */

        int valor = 0;

        System.out.print("Introduce un número natural positivo: ");

        while (!(sc.hasNextInt())) {
            System.out.print("Valor no válido. Introduzca un número natural positivo: ");
            sc.nextLine();

        }
        valor = sc.nextInt();
        if (valor != Math.abs(valor)){
            System.out.println("El valor introducido no es positivo. \n" +
                    "Procedemos a transformarlo a su valor absoluto.");
            valor = Math.abs(valor);
        }
        return valor;

    }

    public static void imprimirPatron(int numero) {

        /*
        StringBuilder fila = new StringBuilder();
        for (int i = 1; i <= numero; i++) {
            if (i > 1) {
                fila.append(' ');
            }
            fila.append(i);
            System.out.println(fila);
        }
         */
    }

    public static void controlarPatron(int numero) {

        for (int i = 1; i <= numero; i++) {
            imprimirFila(i);
        }

    }

    public static void imprimirFila(int contador) {
        for (int j = 1; j <= contador; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}




/*
Escribir un programa que solicite del usuario un número “n” positivo, y
luego muestre por pantalla:
1
1 2
1 2 3
1 2 3......n
Dividir el ejercicio en métodos
 */

