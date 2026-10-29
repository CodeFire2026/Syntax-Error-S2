/*
Ejercicio 14: Leer dos series de 10 enteros, que estarán ordenados
crecientemente. Copiar (fusionar) las dos tablas en una tercera,
de forma que sigan ordenados.
*/

import java.util.Scanner;

public class Ejercicio6_Clase12 {

    public static void main(String[] args) {
        // Objeto Scanner para leer los datos ingresados por teclado
        Scanner sc = new Scanner(System.in);

        // Cantidad de elementos de cada serie
        final int N = 10;

        // Series A y B (ordenadas) y tabla resultante C, del doble de tamaño
        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[2 * N];

        // ---------------------------------------------------------
        // 1. LECTURA de la serie A (se ingresa de menor a mayor)
        // ---------------------------------------------------------
        System.out.println("Serie A (ingrese los números en orden creciente):");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + " de A: ");
            a[i] = sc.nextInt();
        }

        // ---------------------------------------------------------
        // 2. LECTURA de la serie B (se ingresa de menor a mayor)
        // ---------------------------------------------------------
        System.out.println("\nSerie B (ingrese los números en orden creciente):");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + " de B: ");
            b[i] = sc.nextInt();
        }

        // ---------------------------------------------------------
        // 3. FUSIÓN: se usan tres índices
        //      - i: posición actual en A
        //      - j: posición actual en B
        //      - k: posición donde se escribe en C
        //    En cada paso se compara A[i] con B[j] y el menor pasa a C.
        // ---------------------------------------------------------
        int i = 0;
        int j = 0;
        int k = 0;

        // Mientras ambas series tengan elementos sin copiar
        while (i < N && j < N) {
            if (a[i] <= b[j]) {
                c[k] = a[i];   // el menor es el de A
                i++;
            } else {
                c[k] = b[j];   // el menor es el de B
                j++;
            }
            k++;
        }

        // ---------------------------------------------------------
        // 4. RESTO: cuando una serie se agota, los elementos que quedan
        //    en la otra ya están ordenados y se copian directamente.
        //    (Solo uno de estos dos ciclos llega a ejecutarse.)
        // ---------------------------------------------------------
        while (i < N) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < N) {
            c[k] = b[j];
            j++;
            k++;
        }

        // ---------------------------------------------------------
        // 5. MOSTRAR la tabla resultante C
        // ---------------------------------------------------------
        System.out.println("\nTabla C (fusión ordenada):");
        for (int m = 0; m < c.length; m++) {
            System.out.print(c[m] + " ");
        }
        System.out.println();

        // Se cierra el Scanner para liberar el recurso
        sc.close();
    }
}