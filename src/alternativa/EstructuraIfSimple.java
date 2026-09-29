package alternativa;

import java.util.Scanner;

public class EstructuraIfSimple {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.print("Introduce un número: ");
        numero1 = teclado.nextInt();
        System.out.print("Introduce un segundo número: ");
        numero2 = teclado.nextInt();
        if (numero1 > 20 && numero2 < 10) {
            int producto = numero1 * numero2;
            System.out.println(producto);
        }




    }
}

