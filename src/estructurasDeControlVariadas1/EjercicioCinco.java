package estructurasDeControlVariadas1;

import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicion = 0;

        System.out.println("Introduce tu posición final: ");
        posicion = sc.nextInt();

        switch (posicion) {
            case 1:
                System.out.println("Medalla de oro! ");
                break;
            case 2:
                System.out.println("Medalla de plata! ");
                break;
            case 3:
                System.out.println("Medalla de bronce! ");
                break;
            default:
                System.out.println("Gracias por participar. ");

        }


    }
}


/*
    5. Supón que estuviste en las Olimpiadas de Río de Janeiro,
    y que participaste en la prueba de los 100 metros lisos.
    Introduce por el teclado un número que haga referencia al
    puesto en el que quedaste. Utilizando la instrucción
    switch, visualiza el medallero (medalla de oro (primer
    puesto), plata (segundo puesto), bronce (tercer puesto),
    gracias por participar (cualquier otro puesto)
 */