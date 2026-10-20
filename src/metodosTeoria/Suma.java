package metodosTeoria;
import java.util.*;

public class Suma {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int resultado = 0,
                operando1 = 0,
                operando2 = 0;

        operando1 = introducirOperando();
        operando2 = introducirOperando();
        resultado = sumarOperandos(operando1, operando2);

        visualizarResultado(operando1, operando2, resultado);

    }

    public static int introducirOperando(){
        System.out.println("Introduce un operando: ");
        return sc.nextInt();
    }

    public static int sumarOperandos(int operando1, int operando2){
        return operando1+operando2;
    }

    public static void visualizarResultado(int operando1, int operando2, int resultado){
        System.out.println(operando1 +" + "+ operando2 + " = "+ resultado);
    }




}
