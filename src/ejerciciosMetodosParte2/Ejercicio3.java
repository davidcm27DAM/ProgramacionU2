package ejerciciosMetodosParte2;

import java.util.Scanner;

public class Ejercicio3 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int numero = meterNumero();
        String stringNumero = convertirDecimal(numero);
        imprimir(numero, stringNumero);
    }

    public static int meterNumero() {
        int numero = -1;
        System.out.println("Introduce un número positivo (incluido el cero) por teclado: ");

        do {
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero < 0) {
                    System.out.println("Has introducido un número menor que cero \n" +
                            "Has de introducir un número igual o mayor a 0. ");
                    sc.next();
                }

            } else {
                System.out.println("Error en la introducción de dato. \n" +
                        "Has de entroducir un número igual o mayor a 0. ");
                sc.next();
            }

        } while (numero < 0);

        return numero;
    }


    public static String convertirDecimal(int numero) {
        StringBuilder builderBinario = new StringBuilder();

        if (numero == 0) {
            builderBinario.append("0");
        } else {
            if (numero % 2 != 0) {
                builderBinario.append("1");
                numero = numero / 2 + numero % 2;
                while (numero > 1) {
                    if (numero % 2 == 0) {
                        builderBinario.append("1");
                    } else {
                        builderBinario.append("0");
                    }
                    numero = numero / 2 + numero % 2;
                }
            } else {
                builderBinario.append("0");
                numero = numero / 2;
                while (numero > 1) {
                    if (numero % 2 == 0) {
                        builderBinario.append("0");
                    } else {
                        builderBinario.append("1");
                    }
                    numero = numero / 2;
                }
                builderBinario.append("1");
            }
        }

        // Solución simplificada:
        /*
        do {
            builderBinario.append(numero % 2);
            numero /= 2;
        } while (numero > 0);
        */
        // Solución método Integer:
        //String texto = Integer.toBinaryString(numero);

        return builderBinario.reverse().toString();
    }


    public static void imprimir(int numero, String numeroBinario) {
        System.out.println("El número " + numero + " de base decimal se traduce a base binaria como: \n" + numeroBinario);
    }
}



/*
3. Crear un programa que nos convierta un número positivo (incluido el cero) en
base decimal a binario.
Para convertir un número decimal a binario debemos dividir entre 2 el número, el
resultado de esa división se divide entre 2 de nuevo y así sucesivamente, hasta
que no se pueda dividir más. El resto que obtengamos de cada división tomado
en orden inverso a como lo fuimos obteniendo (de abajo- arriba) formará el
número binario.
Usaremos los siguientes métodos:
a) meterNumero: Nos permite meter el número decimal. Se lo debe
devolver al main.
b) convertirDecimal: Devolverá al main un String con el número convertido
a binario.
c) imprimir: imprime el resultado.
El método main debe invocar a los métodos especificados anteriormente

Ejm:
Si introducimos un 8 nos deberá devolver 1000
 */