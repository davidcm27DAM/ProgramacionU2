package scanner;

import java.util.Scanner;

public class EjercicioScanner {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sumando1;
        int sumando2;
        System.out.print("Introduce el primer sumando: ");
        sumando1 = teclado.nextInt();
        System.out.print("Introduce el segundo sumando: ");
        sumando2 = teclado.nextInt();
        System.out.println("La suma es: "+ (sumando1 + sumando2) );
    }

}
