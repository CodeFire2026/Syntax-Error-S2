package arreglos_ejercicio_5;

import java.util.Scanner;

public class Arreglos_Ejercicio_5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero para A: ");
            A[i] = teclado.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero para B: ");
            B[i] = teclado.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            C[2 * i] = A[i];
            C[2 * i + 1] = B[i];
        }

        System.out.println("Arreglo mezclado:");

        for (int i = 0; i < 20; i++) {
            System.out.println(C[i]);
        }

        teclado.close();
    }
}
