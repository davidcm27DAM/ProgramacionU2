package estructurasDeControlVariadas2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final float LONGITUD_MIN = 1.2f;
        final float LONGITUD_MAX = 1.3f;
        int cantidadPerfiles = 0;
        float longitud = 0f;
        int cantidadPiezasAptas = 0;

        do {
            System.out.print("Introduce la cantidad de perfiles: ");
            cantidadPerfiles = sc.nextInt();
        } while (cantidadPerfiles < 1);

        for(int i = 1; i<=cantidadPerfiles; i++){
            System.out.print("Introduce la longitud del perfil: ");
            longitud = sc.nextFloat();
            if (longitud >= LONGITUD_MIN && longitud <= LONGITUD_MAX){
                cantidadPiezasAptas++;
            }
        }

        System.out.println("Hay "+cantidadPiezasAptas+" piezas aptas. ");

    }
}



/*
 1. Una planta que fabrica perfiles de hierro posee un lote
de n piezas. Confeccionar un programa que pida ingresar por
teclado la cantidad de perfiles a procesar, posteriormente
introducir la longitud de cada uno de ellos teniendo en
cuenta que el perfil cuya longitud esté comprendida en el
rango de 1,20 y 1,30 son aptas. Imprimir por pantalla la
cantidad de piezas aptas que hay en el lote.
 */
