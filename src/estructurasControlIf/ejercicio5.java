package estructurasControlIf;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;

        System.out.println("Introduce un número: ");
        numero1 = teclado.nextInt();
        System.out.println("Introduce un segundo número: ");
        numero2 = teclado.nextInt();
        System.out.println("Introduce un tercer número: ");
        numero3 = teclado.nextInt();

        if (numero1 > numero2) {
            if (numero1 > numero3) {
                System.out.println("El primer número es el más grande: " + numero1);
            } else if (numero1 == numero3) {
                System.out.println("El primer y el tercer número son los más grandes: " + numero1);
            } else {
                System.out.println("El número más grande es el tercero: " + numero3);
            }
        } else if (numero2 > numero1) {
            if (numero2 > numero3) {
                System.out.println("El segundo número es el más grande: " + numero2);
            } else if (numero2 == numero3) {
                System.out.println("El segundo y el tercer número son los más grandes: " + numero2);
            } else {
                System.out.println("El número más grande es el tercero: " + numero3);
            }

        } else { // si entra aquí numero1==numero2
            if (numero3 > numero1) {
                System.out.println("El número más grande es el tercero: " + numero3);
            } else if (numero3 < numero1) {
                System.out.println("Los numeros primero y segundo son los más grandes: " + numero1);
            } else {
                System.out.println("Todos los números son iguales: " + numero1);
            }

        }

    }
}


/*
Introducir 3 números desde teclado
determinar cuál es el mayor de los tres
 */