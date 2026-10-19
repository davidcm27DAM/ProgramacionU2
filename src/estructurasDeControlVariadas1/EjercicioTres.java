package estructurasDeControlVariadas1;

import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroMes = 0;
        int numeroAnyo = 0;
        int numDias = 0;

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
                System.out.println("Introduce el número del año: ");
                numeroAnyo = sc.nextInt();
                if ((numeroAnyo % 4 == 0 && !(numeroAnyo % 100 == 0)) || numeroAnyo % 400 == 0) {
                    numDias = 29;
                } else {
                    numDias = 28;
                }
                break;
            case 4, 6, 9, 11:
                numDias = 30;
                break;
            default:
                numDias = 31;

        }
        System.out.println("El mes tiene " + numDias + " días. ");

        System.out.println("// Utilizando un if");
        if (numeroMes == 2) {
            System.out.println("Introduce el número del año: ");
            numeroAnyo = sc.nextInt();
            if ((numeroAnyo % 4 == 0 && !(numeroAnyo % 100 == 0)) || numeroAnyo % 400 == 0) {
                numDias = 29;
            } else {
                numDias = 28;
            }
        } else if (numeroMes == 4 || numeroMes == 6 || numeroMes == 9 || numeroMes == 11) {
            numDias = 30;
        } else {
            numDias = 31;
        }
        System.out.println("El mes tiene " + numDias + " días. ");

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