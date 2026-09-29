package scanner;

import java.util.Scanner;

public class TeoriaScanner {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        String nombre = null;
        int edad = 0;
        System.out.print("Introduce la edad de " + nombre + ": ");
        edad = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Introduce el nombre de una persona: ");
        nombre = teclado.nextLine();

        System.out.println(nombre + " tiene " + edad + " años. ");

    }
    public void numero(){

    }
}
