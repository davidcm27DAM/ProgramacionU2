package ejerciciosMetodosParte1;

import java.util.Scanner;

public class Ejercicio4 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int numero = solicitarNumeroPositivo();
        imprimirArbol(numero);
    }

    public static int solicitarNumeroPositivo() {
        int numero = 0;
        while (true) {
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    return numero;
                }
            }
            sc.nextLine();
            System.out.print("Valor no válido. Introduzca un número natural positivo: ");
        }

    }

    public static void imprimirArbol(int numero) {
        StringBuilder fila = new StringBuilder();
        for (int i = 1; i <= numero; i++) {
            if (i > 1){
                fila.append(' ');
            }
            fila.append(i);
            System.out.println(fila);
        }
    }
}



/*
Escribir un programa que solicite del usuario un número “n” positivo, y
luego muestre por pantalla:
1
1 2
1 2 3
1 2 3......n
Dividir el ejercicio en métodos
 */