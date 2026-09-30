package alternativa;

import java.util.Scanner;

public class AlternativaTeoria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Introducir primer número: ");
        numero1 = teclado.nextInt();
        System.out.println("Introducir segundo número");
        numero2 = teclado.nextInt();
        if (numero1 >= numero2) {
            System.out.println("Los números son " + numero1 + " " + numero2);
        } else {
            System.out.println("La suma de ambos números es: " + (numero1 + numero2));
        }
        System.out.println("Continuamos... ");

    }
}
