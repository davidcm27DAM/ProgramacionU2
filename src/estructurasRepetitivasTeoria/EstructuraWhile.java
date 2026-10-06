package estructurasRepetitivasTeoria;

public class EstructuraWhile {

    /*
     * Vamos a realizar la suma de los tres primeros números naturales
     */
    public static void main(String[] args) {

        final int TOPE = 3;
        int contador = 1;
        int suma = 0;

        while (contador <= TOPE) {
            suma += contador++;
        }

        System.out.println("La suma de los " + TOPE + " primeros números naturales es: " + suma);

    }
}
