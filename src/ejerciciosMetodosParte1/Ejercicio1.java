package ejerciciosMetodosParte1;

import java.util.Scanner;

public class Ejercicio1 {
    public static Scanner sc = new Scanner(System.in);
    static final float CAMBIO_LIBRAS = 0.87f;
    static final float CAMBIO_DOLARES = 1.11f;
    static final float CAMBIO_YENES = 120.63f;

    // g) main: invocará únicamente al método run()
    public static void main(String[] args) {
        run();
    }

    // f) run: llamará a los diferentes métodos y controlará el final del programa.
    public static void run() {
        String respuesta = introducirRespuesta();

        while (respuesta.equalsIgnoreCase("si")) {
            double euros = introducirEuros();
            String moneda = introducirMoneda();
            double resultado = cambiarMoneda(euros, moneda);
            imprimir(euros, resultado, moneda);


            respuesta = introducirRespuesta();
        }

        System.out.println("Programa finalizado ");

    }

    // a) introducirRespuesta: nos indicará si queremos cambiar o no dinero.
    public static String introducirRespuesta() {
        String cambiarDinero = "";

        do {
            System.out.println("Quieres cambiar dinero? Introduzca \"si\" o \"no\": ");
            cambiarDinero = sc.nextLine();
            if (!(cambiarDinero.equalsIgnoreCase("si") || cambiarDinero.equalsIgnoreCase("no"))) {
                System.out.println("El valor introducido es incorrecto.");
            }

        } while (!(cambiarDinero.equalsIgnoreCase("si") || cambiarDinero.equalsIgnoreCase("no")));

        return cambiarDinero;
    }

    // b) introducirEuros: devolverá la cantidad de euros que queremos cambiar.
    public static double introducirEuros() {
        double cantidadEuros = 0;

        do {
            System.out.println("Introduce la cantidad de euros que quieres cambiar: ");
            cantidadEuros = sc.nextDouble();
            sc.nextLine();

            if (cantidadEuros <= 0) {
                System.out.println("La cantidad debe ser mayor que 0.");
            }
        } while (cantidadEuros <= 0);

        return cantidadEuros;

    }

    // c) introducirMoneda: devolverá la moneda a la que queremos realizar el
    //    cambio. Debemos validar.
    public static String introducirMoneda() {
        String moneda = "";

        do {
            System.out.println("A que moneda quieres cambiar? Introduzca \"libras\", \"dolares\" o \"yenes\": ");
            moneda = sc.nextLine();
            if (!(moneda.equalsIgnoreCase("libras") || moneda.equalsIgnoreCase("dolares")
                    || moneda.equalsIgnoreCase("yenes"))) {
                System.out.println("La moneda introducida es incorrecta.");
            }

        } while (!(moneda.equalsIgnoreCase("libras") || moneda.equalsIgnoreCase("dolares")
                || moneda.equalsIgnoreCase("yenes")));

        return moneda.toLowerCase();
    }

    // d) cambiarMoneda: convertirá los euros a la moneda indicada devolviendo
    //    la cantidad obtenida.
    public static double cambiarMoneda(double euros, String moneda) {
        double resultado = 0;

        switch (moneda) {
            case "libras":
                resultado = euros * CAMBIO_LIBRAS;
                break;
            case "dolares":
                resultado = euros * CAMBIO_DOLARES;
                break;
            case "yenes":
                resultado = euros * CAMBIO_YENES;
                break;
        }

        return resultado;
    }

    // e) imprimir: visualizará por pantalla el resultado.
    public static void imprimir(double euros, double resultado, String moneda) {
        System.out.printf("%.2f euros son %.2f %s%n", euros, resultado, moneda);
    }


}


/*

1. Hacer un programa que convierta una cantidad de euros introducida por
teclado a dólares, yenes o libras, sabiendo que:
    1 euro son 0,87 libras.
    1 euro son 1,11 dólares.
    1 euro son 120,63 yenes.
El programa parará cuando introduzcamos “No". Significa que no queremos
realizar cambios.

Para resolver el ejercicio utilizaremos los métodos siguientes:
    a) introducirRespuesta: nos indicará si queremos cambiar o no dinero.
    b) introducirEuros: devolverá la cantidad de euros que queremos
    cambiar.
    c) introducirMoneda: devolverá la moneda a la que queremos realizar el
    cambio. Debemos validar.
    d) cambiarMoneda: convertirá los euros a la moneda indicada devolviendo
    la cantidad obtenida.
    e) imprimir: visualizará por pantalla el resultado.
    f) run: llamará a los diferentes métodos y controlará el final del programa.
    g) main: invocará únicamente al método run()

 */