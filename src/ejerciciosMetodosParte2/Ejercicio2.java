package ejerciciosMetodosParte2;

import java.util.Scanner;

public class Ejercicio2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int numero = leerEntero();
        visualizarResultado(numero, determinarParImpar(numero));
    }

    public static int leerEntero() {
        int numero = 0;
        boolean esCorrecto = false;

        do {
            System.out.println("Introduce un número de cuatro dígitos: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                esCorrecto = comprobarNumero(numero);

            } else {
                System.out.println("Valor introducido incorrecto. ");
                sc.next();
            }
        } while (!esCorrecto);

        return numero;
    }

    public static boolean comprobarNumero(int numero) {
        if (numero<1000 || numero > 9999) {
            System.out.println("El número introducido es incorrecto. ");
            return false;
        } else {
            return true;
        }
    }

    public static boolean determinarParImpar(int numero) {
        boolean esPar = true;

        while (esPar && numero > 0){
            if (numero % 2 != 0){
                esPar = false;
            } else{
                numero /= 10;
            }
        }

        return esPar;
    }

    public static void visualizarResultado(int numero, boolean esPar) {
        if (esPar){
            System.out.println("El número "+ numero + " tiene todos los dígitos pares ");
        }else {
            System.out.println("El número "+ numero + " tiene dígitos impares ");
        }

    }
}


/*
2. Hacer un programa que nos permita introducir una serie de números positivos
de cuatro dígitos (validar por programa) hasta teclear el cero. Por cada número
introducido determinar si todos los dígitos del número son pares o hay dígitos
impares (el resto de dividir un número entre 10 nos saca las unidades o el dígito
situado más a la derecha de ese número).
Ejemplos:
El número 7286 tiene dígitos impares .
El número 8424 tiene todos los dígitos pares.
Usaremos los siguientes métodos:
a) leerEntero: se encarga de introducir un número por teclado.
b) comprobarNumero: Controlará que el número esté correctamente
introducido (validar por programa que es de cuatro dígitos).
c) determinarParImpar: Determinará si todos los dígitos del número son
pares o no.
d) visualizarResultado: Por cada número sacará por pantalla si los dígitos
son pares o hay dígitos impares.
d) run: controlará que el programa termine cuando introduzcamos el cero y
llamará a los métodos correspondientes.
 */