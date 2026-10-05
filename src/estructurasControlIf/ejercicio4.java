package estructurasControlIf;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float tempHoy;
        float tempAyer;
        boolean lluviaHoy;
        boolean lluviaAyer;
        final int VALOR = 20;

        System.out.println("Introduce la temperatura de hoy: ");
        tempHoy = teclado.nextFloat();
        System.out.println("Llueve hoy? Introduce \"true\" o \"false\" : ");
        lluviaHoy = teclado.nextBoolean();
        System.out.println("Introduce la temperatura de ayer: ");
        tempAyer = teclado.nextFloat();
        System.out.println("Llovió ayer? Introduce \"true\" o \"false\" : ");
        lluviaAyer = teclado.nextBoolean();

        if (tempHoy > VALOR && lluviaHoy) {
            System.out.printf("Hace calor pero está lloviendo. " +
                    "\n Entre ayer y hoy la temperatura fue de: %.1f", (tempHoy + tempAyer));
            System.out.printf("\n Mañana habrá %.1f ºC. ", (tempHoy + 5));
        } else if (tempHoy <= VALOR) {
            System.out.println("Parece que llega el otoño ");
            if (!lluviaHoy) {
                System.out.println("pero luce el sol. ");
            } else {
                System.out.println("y llueve. ");
            }
        }

    }
}


/*
4. Meter por el teclado la temperatura de ayer y hoy y si
hoy llueve o luce el sol. Hacer un programa que haga:
a) Si la temperatura hoy es mayor de 20 grados y llueve:
 Sacar por pantalla: "Hace calor pero está
lloviendo".
 Entre ayer y hoy la temperatura fue de: (sacar la
suma de la temperatura de ayer y hoy).
 Mañana habrá (suma 5 grados a la temperatura de
hoy y saca el resultado por pantalla).
b) Si la temperatura de hoy es menor o igual a 20 grados:
 Sacar por pantalla: "Parece que llega el otoño".
 Si además luce el sol visualizar: "Pero luce el
sol", en caso contrario visualizar: "y llueve".
 */