/*
Ejercicio 5: Leer por teclado dos tablas de 10 números enteros y
mezclarlas en una tercera de la forma: el 1º de A, el 1º de B,
el 2º de A, el 2º de B, etc.
*/

import java.util.Scanner;

public class Ejercicio2_Clase12 {

    public static void main(String[] args) {
        // Objeto Scanner para leer los datos ingresados por teclado
        Scanner sc = new Scanner(System.in);

        // Cantidad de elementos de cada tabla (constante para modificarla en un solo lugar)
        final int N = 10;

        // Tablas originales A y B, y tabla resultante C.
        // C tiene el doble de tamaño porque contiene los elementos de ambas.
        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[2 * N];

        // ---------------------------------------------------------
        // 1. LECTURA de la tabla A
        // ---------------------------------------------------------
        System.out.println("Tabla A:");
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + " de A: ");
            a[i] = sc.nextInt();
        }

        // ---------------------------------------------------------
        // 2. LECTURA de la tabla B
        // ---------------------------------------------------------
        System.out.println("\nTabla B:");
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + " de B: ");
            b[i] = sc.nextInt();
        }

        // ---------------------------------------------------------
        // 3. MEZCLA: se intercalan los elementos de A y B en C.
        //    Para cada posición i de A y B se ocupan dos posiciones de C:
        //      - posición 2*i      -> elemento i de A
        //      - posición 2*i + 1  -> elemento i de B
        //    Ejemplo: i = 0 llena c[0] y c[1]; i = 1 llena c[2] y c[3]; etc.
        // ---------------------------------------------------------
        for (int i = 0; i < N; i++) {
            c[2 * i] = a[i];
            c[2 * i + 1] = b[i];
        }

        // ---------------------------------------------------------
        // 4. MOSTRAR la tabla resultante C
        // ---------------------------------------------------------
        System.out.println("\nTabla C (mezcla de A y B):");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

        // Se cierra el Scanner para liberar el recurso
        sc.close();
    }
}