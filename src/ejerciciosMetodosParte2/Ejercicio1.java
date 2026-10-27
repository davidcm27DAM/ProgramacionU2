package ejerciciosMetodosParte2;

import java.util.Scanner;

public class Ejercicio1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        run();

    }

    public static void run() {

        int posicion = introducirPosicion();
        int valor = calcularNumero(posicion);

    }

    public static int introducirPosicion() {

        System.out.print("Introduce el valor de la posición de la serie de Fibonacci: ");
        while (!sc.hasNextInt()) {
            System.out.println("Error en el tipo de valor");
            sc.next();
        }

        return sc.nextInt();
    }

    public static int calcularNumero(int posicion) {
        /*
        int numero = 0;
        int contador = 1;
        int valorA = 1;
        int valorB = 1;
        while (contador < posicion){
            contador++;
            valorA += valorB;
            numero = ;

        }

        */
        return 2;

    }

    public static void visualizarNumero(int posicion, int valor) {
        System.out.println("Para la posición " + posicion + " el valor es: " + valor);
    }

}


/*
1. Hacer un programa que calcule un número de la serie Fibonacci indicándole la
posición de ese número.
Un número de la serie Fibonacci se calcula sumando los dos números
anteriores a él, siendo los dos primeros cero y uno. Esta es la serie Fibonacci: 0,
1, 1, 2, 3, 5, 8, 13, 21 …
Ejm: El número que está en la posición 6 sería el 5.
Usaremos los siguientes métodos:
a) introducirPosicion: nos permitirá introducir una posición que debe ser un
número entero positivo (validar por programa). Se excluye el cero.
b) calcularNumero: debe calcular el número que ocupa la posición
introducida por el teclado.
c) visualizarNumero: visualizará la posición y el número que se encuentra
en ella.
El método run, debe invocar a los métodos descritos anteriormente
 */