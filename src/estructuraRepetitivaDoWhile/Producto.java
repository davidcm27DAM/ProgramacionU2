package estructuraRepetitivaDoWhile;

public class Producto {
    public static void main(String[] args) {

        final int LIMITE = 4;
        int contador = 1;
        int producto = 1;

        // 1
        do {
            producto *= contador++;
        } while (contador <= LIMITE);

        System.out.println("1: El producto de los primeros " + LIMITE + " números naturales es: " + producto);

        // 2
        contador = 1;
        producto = 1;

        do {
            producto = producto * contador;
            contador = contador + 1;
        } while (contador <= LIMITE);

        System.out.println("2: El producto de los primeros " + LIMITE + " números naturales es: " + producto);

        // 3
        contador = 1;
        producto = 1;
        int[] numberList = {1, 2, 3, 4};

        do {
            producto *= numberList[contador];
            contador++;
        } while (contador < numberList.length);

        System.out.println("3: El producto de los primeros " + LIMITE + " números naturales es: " + producto);

    }

}

/*
 *Hacer un programa utilizando la estructura do-while
 * que nos permita visualizar por pantalla
 * el resultado de multiplicar los 4 primeros números naturales
 * excluyendo el 0
 *
 * Intentar hacer el ejercicio de tres formas diferentes
 */