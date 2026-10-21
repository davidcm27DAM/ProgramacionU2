package metodosTeoria;

import java.util.*;

public class Suma {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        int resultado = 0,
                operando1 = 0,
                operando2 = 0;

        operando1 = introducirOperando();
        operando2 = introducirOperando();
        resultado = sumarOperandos(operando1, operando2);

        visualizarResultado(operando1, operando2, resultado);
        */

        visualizarResultadoB(introducirOperando(), introducirOperando());

    }

    public static int introducirOperando() {
        System.out.print("Introduce un operando: ");
        return sc.nextInt();
    }

    public static int sumarOperandos(int operando1, int operando2) {
        return operando1 + operando2;
    }

    /*
    public static void visualizarResultado(int operando1, int operando2, int resultado) {
        System.out.println(operando1 + " + " + operando2 + " = " + resultado);
    }
    */

    public static void visualizarResultadoB(int sumando1, int sumando2) {
        System.out.println(sumando1 + " + " + sumando2 + " = " + sumarOperandos(sumando1, sumando2));
    }


}