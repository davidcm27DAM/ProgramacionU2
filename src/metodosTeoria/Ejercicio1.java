package metodosTeoria;

import java.util.Scanner;

public class Ejercicio1 {
    public static Scanner sc = new Scanner(System.in);
    static final int LIMITE = 8;

    public static void main(String[] args) {

        int numeroTeclado = 0;

        do {
            numeroTeclado = leerNumero();

            System.out.println(numeroTeclado);
            comprobarNumero(numeroTeclado);

        } while (numeroTeclado != 0);

        System.out.println("\"FIN\"");

    }

    public static int leerNumero() {
        System.out.print("Introduce un número: ");
        return sc.nextInt();
    }

    public static void comprobarNumero(int numero) {
        if (numero > LIMITE) {
            visualizarDoble(numero);
        } else {
            visualizarTriple(numero);
        }
    }

    public static void visualizarDoble(int numero) {
        System.out.println(2 * numero);
    }

    public static void visualizarTriple(int numero) {
        System.out.println(3 * numero);
    }
}


/*

Dividir estructurasDeControlVariadas2.Ejercicio2

1. leerNumero: nos permitirá leer un número por el teclado
2. comprobarNumero: nos permite comprobar si un número es mayor que 8, si lo es, debe invocar a visualizarDoble(),
    si no lo es, invocará al método visualizarTriple().
3. visualizarDoble: visualiza el doble de un número
4. visualizarTriple: visualiza el triple de un número
5. el main servirá de interfaz, es decir, controlará el final del programa,
    y llamará a los métodos que consideremos necesarios

 */