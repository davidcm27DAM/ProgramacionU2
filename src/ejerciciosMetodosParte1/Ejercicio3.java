package ejerciciosMetodosParte1;

import java.util.Scanner;

public class Ejercicio3 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        empezar();
    }

    public static void empezar() {
        /*
        double cateto1 = introducirCateto();
        double cateto2 = introducirCateto();
        double hipotenusa = calcularHipotenusa(cateto1, cateto2);
        visualizarResultado(hipotenusa);
         */

        //Alternativa en una línea:
        visualizarResultado(calcularHipotenusa(introducirCateto(), introducirCateto()));
    }

    public static double introducirCateto() {
        double cateto = 0;
        System.out.println("Introduce el valor del cateto ");

        while (!sc.hasNextDouble()){
            System.out.println("Error en la introducción del valor. ");
            sc.nextLine();
        }

        cateto = sc.nextDouble();
        sc.nextLine();

        return cateto;
    }

    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    public static void visualizarResultado(double hipotenusa){
        System.out.println("Valor de la hipotenusa: "+hipotenusa);
    }
}



/*
3. Realizar un programa que calcule la hipotenusa de un triángulo rectángulo,
en función de sus catetos (h2 = c2 + c2
).
NOTA: La hipotenusa es la raíz cuadrada de la suma de los catetos al
cuadrado.
Para resolver el ejercicio utilizaremos los métodos siguientes:
a) introducirCateto: nos devolverá el valor de un cateto.
b) calcularHipotenusa: calculará la hipotenusa y nos devolverá el valor.
c) empezar: llamará a los métodos e imprimirá la hipotenusa.
d) visualizarResultado: visualizará el resultado
 */