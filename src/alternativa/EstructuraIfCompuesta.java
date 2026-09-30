package alternativa;

import java.util.Scanner;

public class EstructuraIfCompuesta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int VALOR = 5;
        float numero1;
        float numero2;
        float resultado;

        System.out.println("Introduzca el primer sumando: ");
        numero1 = teclado.nextFloat();
        System.out.println("Introduzca el segundo sumando: ");
        numero2 = teclado.nextFloat();
        resultado = numero1 + numero2;
        if (resultado > VALOR) {
            System.out.println("Suma mayor a "+VALOR);

        } else if (resultado < VALOR) {
            System.out.println("Suma menor a "+VALOR);
        } else{
            System.out.println("La suma es "+VALOR);
        }
        System.out.printf("Valor de la suma : %.4f", resultado);
    }
}

    /*
    * La función debe permitirnos introducir dos números decimales por el teclado
    * realizar la suma de ambos
    * si la suma es >5 visualizar "La suma es mayor a 5"
    * si la suma es <5 visualizar "Suma menor a 5"
    * y en cualquier caso visualizar el resultado de la suma
    */