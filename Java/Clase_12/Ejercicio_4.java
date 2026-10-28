
package arreglos_ejercicio_4;

import java.util.Scanner;

public class Arreglos_Ejercicio_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero entero: ");
            numeros[i] = teclado.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
            System.out.println(numeros[9 - i]);
        }

        teclado.close();
    }
}
