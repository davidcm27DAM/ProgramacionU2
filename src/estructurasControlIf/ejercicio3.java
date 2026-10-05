package estructurasControlIf;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float presionCaldera;
        final byte LIMITE = 2;
        String nombre;

        System.out.println("Introduce la presión de la caldera");
        presionCaldera = teclado.nextFloat();

        if (presionCaldera > LIMITE) {
            System.out.println("Abrir válvula de seguridad ");
            presionCaldera--;
            System.out.println("Ahora la presión es " + presionCaldera);
        } else {
            System.out.print("Introduce tu nombre: ");
            teclado.nextLine();
            nombre = teclado.nextLine();
            System.out.println("Todo está bien " + nombre);
        }
    }
}

/*
3. Introducir por el teclado la presión que tiene nuestra
caldera de la calefacción (debe ser de tipo float) y
almacenarla en una variable que llamaremos presión. Si
sobrepasa el valor de 2 hacer:
a) Visualizar por pantalla: Abrir válvula de seguridad.
b) Disminuir en uno el valor de presión.
En el caso de que no sobrepase el valor de dos hacer:
a) introducir tu nombre por teclado.
b) Imprimir: "Todo está bien [tu nombre].
 */
