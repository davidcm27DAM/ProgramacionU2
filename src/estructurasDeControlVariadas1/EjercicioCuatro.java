package estructurasDeControlVariadas1;

import java.util.Scanner;

public class EjercicioCuatro {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double numeroTeclado = 0;
        int numeroNatural = 0;
        boolean primo = true;

        System.out.println("Introduce un número para mostrar sus divisores: ");
        numeroTeclado=sc.nextDouble();
        if (numeroTeclado >=1 && numeroTeclado == Math.floor(numeroTeclado)) {
            numeroNatural = (int) numeroTeclado;
            System.out.println(1 +" es divisor de "+numeroNatural);
            for (int i = 2; i < numeroNatural; i++){
                if (numeroNatural%i == 0){
                    System.out.println(i+" es divisor de "+numeroNatural);
                    primo = false;

                }
            }
            System.out.println(numeroNatural+" es divisor de "+numeroNatural);
            if (!primo){
                System.out.println(numeroNatural+" no es un número primo");
            } else {
                System.out.println(numeroNatural+ " es un número primo!");
            }
        } else {
            System.out.println("El número introducido no es un número natural. ");
        }
    }

}


/*
    4. Crear un programa que calcule los divisores de un número
    natural introducido por teclado. Además mostrar si el
    número ingresado es primo. Un número primo es aquel que
    solo sea divisible por 1 y por el mismo número. Si el
    número no es natural indicarlo y terminar el programa.
 */