package alternativa;

import java.util.Scanner;

public class EjercicioIfSimple {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float numero1;
        float numero2;
        float resultado;

        System.out.println("Introduzca el primer sumando: ");
        numero1 = teclado.nextFloat();
        System.out.println("Introduzca el segundo sumando: ");
        numero2 = teclado.nextFloat();
        resultado = (float) numero1 + numero2;
        if ((numero1 + numero2) > 5) {
            System.out.println("Suma mayor a 5.");

        }
        System.out.printf("Valor de la suma : %.4f", resultado);
    }
}

/*
Dos numeros por teclado, efectuar su suma. Si suma > 5 visualizamos suma mayor a 5,
y el resultado se lo asignamos a otra variable, a la que denominaremos resultado.
Independientemente del valor de la suma debemos visualizarla por pantalla.
 */
