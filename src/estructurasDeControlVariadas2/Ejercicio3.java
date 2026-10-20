package estructurasDeControlVariadas2;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;

        System.out.println("Introduce tres números ");
        System.out.println("La variable a no puede ser 0.");
        System.out.print("a = ");
        numero1 = sc.nextInt();
        while (numero1 == 0) {
            System.out.println("Introduce un valor de a que no sea 0. ");
            System.out.print("a = ");
            numero1 = sc.nextInt();
        }
        System.out.print("b = ");
        numero2 = sc.nextInt();
        System.out.print("c = ");
        numero3 = sc.nextInt();

        double calculoRaiz = Math.sqrt(Math.pow(numero2, 2)) - 4 * numero1 * numero3;

        if (calculoRaiz < 0) {
            System.out.println("No existen raíces reales. ");
        } else if (calculoRaiz == 0) {
            System.out.println("Existe una raíz: " + (-numero2 / 2 * numero1));
        } else {
            System.out.println("Existen dos raíces reales. ");
            double raiz1 = (-numero2 + calculoRaiz) / (2 * numero1);
            double raiz2 = (-numero2 - calculoRaiz) / (2 * numero1);
            System.out.println("1. " + raiz1);
            System.out.println("2. " + raiz2);

        }
    }
}


/*
3. Calcula las raíces reales de una ecuación de segundo
grado: aX2+bX+c=0.Si no existen raíces reales indicarlo por
pantalla. El valor de a debe ser distinto de cero.
aX2+bX+c=0 =>
−��±√��2−4����
2��
Si b2-4ac<0 => No existen raíces reales.
Si b2-4ac=0 => Solo existe una raíz –b/2a.
Si b2-4ac>0 => Existen dos raíces reales.
Nota: Buscar que método de la clase Math nos permite
calcular una raíz cuadrada.
 */