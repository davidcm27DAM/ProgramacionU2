package estructurasRepetitivasTeoria;

public class Adivina2 {
    public static void main(String[] args) {

        int contador = 0;
        int suma = 0;

        while (suma < 1000) {
            suma += ++contador;
        }

        System.out.println(contador);
    }
}



/*
*
* public static void main(String[] args) {
		int suma=0,c=0;
		do {
			c=c+1;
			suma=suma+c;
		}while(suma<1000);
		System.out.println(c);
	}
 */
/*
Descripción enunciado:
Haz un programa que cuente cuántos números naturales (empezando por el 1) sucesivos han de sumarse
hasta que la suma de estos sea mayor o igual que mil.
Muestra el resultado por pantalla.
 */