/*
Ejercicio 6: Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la
primera y transponerla en la segunda.
*/

import java.util.Scanner;

public class Ejercicio8_Clase12 {

    public static void main(String[] args) {
        // Objeto Scanner para leer los datos ingresados por teclado
        Scanner sc = new Scanner(System.in);

        // Dimensiones de la matriz original (5 filas x 9 columnas)
        final int FILAS = 5;
        final int COLUMNAS = 9;

        // Matriz original A (5x9) y matriz transpuesta B (9x5).
        // B tiene las dimensiones invertidas respecto de A.
        int[][] a = new int[FILAS][COLUMNAS];
        int[][] b = new int[COLUMNAS][FILAS];

        // ---------------------------------------------------------
        // 1. CARGA de la matriz A: el ciclo externo recorre las filas
        //    y el interno las columnas de cada fila.
        // ---------------------------------------------------------
        System.out.println("Carga de la matriz A (" + FILAS + "x" + COLUMNAS + "):");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

        // ---------------------------------------------------------
        // 2. TRASPOSICIÓN: el elemento de la fila i, columna j de A
        //    pasa a la fila j, columna i de B. Es decir, las filas
        //    de A se convierten en las columnas de B.
        // ---------------------------------------------------------
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                b[j][i] = a[i][j];
            }
        }

        // ---------------------------------------------------------
        // 3. MOSTRAR la matriz original A
        // ---------------------------------------------------------
        System.out.println("\nMatriz A (" + FILAS + "x" + COLUMNAS + "):");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();   // salto de línea al terminar cada fila
        }

        // ---------------------------------------------------------
        // 4. MOSTRAR la matriz transpuesta B
        // ---------------------------------------------------------
        System.out.println("\nMatriz B, transpuesta de A (" + COLUMNAS + "x" + FILAS + "):");
        for (int i = 0; i < COLUMNAS; i++) {
            for (int j = 0; j < FILAS; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

        // Se cierra el Scanner para liberar el recurso
        sc.close();
    }
}