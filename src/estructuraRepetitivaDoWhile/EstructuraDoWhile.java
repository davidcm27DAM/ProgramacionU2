package estructuraRepetitivaDoWhile;

public class EstructuraDoWhile {
    public static void main(String[] args) {
        int numero = 0;
        final int LIMITE = 6;
        do {
            System.out.println(numero);
            numero++;
        } while (numero < LIMITE);
        System.out.println("Continuará... ");
    }
}

/*
 * Hacer un programa que visualice por pantalla
 * los seis primeros números
 */