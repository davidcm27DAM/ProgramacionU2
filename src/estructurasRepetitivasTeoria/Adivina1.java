package estructurasRepetitivasTeoria;

import java.util.Scanner;

public class Adivina1 {
    public static void main(String[] args) {
        //modifica el programa original
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        int numero = 55;
        int producto = 1;

        while (numero != 0) {
            System.out.print("Introduce un número [0 para salir]: ");
            numero = teclado.nextInt();

            if (numero == 5) {
                contador++;
            }
            if (numero != 0) {
                producto *= numero;
            }
        }

        System.out.println("Se ha introducido el número cinco " + contador + " veces.");
        System.out.println("El producto de los números diferentes a 0 es: " + producto);
    }
}

/*
Análisis previo:
Pide introducir un número
Si el número!=0,
    comprueba si es cinco
        si es 5, suma 1 al contador verdad
sigue pidiendo añadir números
finalmente, imprime por pantalla cuántas veces se ha introducido el número 5

Formulación enunciado:
Haz un programa que pida introducir un número por teclado.
El programa ha de pedir números hasta que se introduzca el 0.
Al introducir el 0, el programa finalizará.
Una vez finalice el programa, muestra por pantalla las veces que se ha introducido el número 5.
 */

/*
Ampliación ejercicio: Añadir el producto de todos los números distintos de cero
 */