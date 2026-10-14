package estructurasDeControlVariadas1;

import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroMes = 0;
        int numeroAño = 0;

        System.out.println("Introduce el número del año: ");
        numeroAño = sc.nextInt();

        do {
            System.out.println("Introduce el número del mes (1 al 12): ");
            numeroMes = sc.nextInt();

            if (numeroMes < 1 || numeroMes > 12) {
                System.out.println("El número introducido es incorrecto. Vuelve a intentarlo. ");
            }
        } while (numeroMes < 1 || numeroMes > 12);

        System.out.println("// Utilizando un switch");
        switch (numeroMes) {
            case 2:
                if ((numeroAño % 4 == 0 && !(numeroAño % 100 == 0)) || numeroAño % 400 == 0) {
                    System.out.println("En febrero de " + numeroAño + " constan 29 días, ya que *es bisiesto*");
                } else {
                    System.out.println("En febrero de " + numeroAño + " constan 28 días, ya que *no es bisiesto*");
                }
                break;
            case 4, 6, 9, 11:
                System.out.println("El mes " + numeroMes + " del año " + numeroAño + " consta de 30 días. ");
                break;
            default:
                System.out.println("El mes " + numeroMes + " del año " + numeroAño + " consta de 31 días. ");
        }

        System.out.println("// Utilizando un if");
        if (numeroMes == 2) {
            if ((numeroAño % 4 == 0 && !(numeroAño % 100 == 0)) || numeroAño % 400 == 0) {
                System.out.println("En febrero de " + numeroAño + " constan 29 días, ya que *es bisiesto*");
            } else {
                System.out.println("En febrero de " + numeroAño + " constan 28 días, ya que *no es bisiesto*");
            }
        } else if (numeroMes == 4 || numeroMes == 6 || numeroMes == 9 || numeroMes == 11) {
            System.out.println("El mes " + numeroMes + " del año " + numeroAño + " consta de 30 días. ");
        } else {
            System.out.println("El mes " + numeroMes + " del año " + numeroAño + " consta de 31 días. ");
        }
    }
}

/*
    3. Hacer un programa que nos permita introducir un año y un
    mes por el teclado (introducirlo en formato numérico:
    enero=1, febrero=2….), validarlo para que esté comprendido
    entre 1 y 12, y visualizar por pantalla los días que tiene
    el mes.
    NOTA: Recordar que febrero puede ser bisiesto (buscar por
    internet cuándo un mes es bisiesto).

 */