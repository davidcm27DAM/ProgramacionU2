package ejerciciosMetodosParte1;

import java.util.Scanner;

public class Ejercicio2 {

    private static Scanner sc = new Scanner(System.in);
    static final double IVA = 0.21;
    public static void main(String[] args) {

        run();
    }

    public static void run(){
        double precio = introducirPrecioProducto();
        imprimirResultados(precio, calcularPrecioIva(precio));
    }

    public static double introducirPrecioProducto(){
        double cantidad = 0.0;

        System.out.println("Introduce el precio del producto");
        cantidad = sc.nextDouble();

        while (!sc.hasNextDouble()){
            System.out.println("Error en la introducción del valor. Vuelva a introducir el precio.");
            cantidad = sc.nextDouble();
        }


        //cuerpo del método
        return cantidad;
    }

    public static double calcularPrecioIva(double precio){
        double precioConIva = precio+(precio*IVA);
        return precioConIva;
    }

    public static void imprimirResultados(double precio, double precioConIva){
        // cuerpo del método
    }
}


/*

2. Hacer un programa que nos permita leer un número por el teclado que
represente el precio de un producto, y calcule el precio final del mismo con el
IVA incluido. El IVA será el 21%.
Para resolver el ejercicio utilizaremos los métodos siguientes:
a) introducirPrecioProducto: nos devolverá un número que representará
el precio del producto.
b) calcularPrecioIva: nos devolverá el precio del producto con el IVA
incluido.
c) imprimirResultados: nos imprimirá el precio y el precio con IVA.
d) run: Realizará la llamada de los métodos.
e) main: invocará únicamente al método run(

 */