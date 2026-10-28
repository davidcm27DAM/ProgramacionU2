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
        visualizarNumero(posicion, valor);
    }

    public static int introducirPosicion() {
        int numero = 0;

        do{
            System.out.print("Introduce el valor de la posición de la serie de Fibonacci: ");
            if (sc.hasNextInt()){
                numero = sc.nextInt();
                if (numero <= 0){
                    System.out.println("La posición ha de ser mayor a 0! ");
                }

            } else {
                System.out.println("Error en el tipo de valor");
                sc.next();
            }
        } while (numero <= 0);

        return numero;

    }

    public static int calcularNumero(int posicion) {
        int numero = 0;
        int valorA = 1;
        int valorB = 0;

        if (posicion == 1) {
            return 0;
        } else if (posicion == 2) {
            return 1;
        } else {
            for (int i = 3; i <= posicion; i++){
                numero = valorA + valorB;
                valorB = valorA;
                valorA = numero;
            }
        }
        return numero;
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