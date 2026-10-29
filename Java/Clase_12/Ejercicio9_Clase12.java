/*
Ejercicio 7: Crear una matriz "marco" de tamaño 5x5: todos sus
elementos deben ser 0 salvo los de los bordes que deben ser 1.
Mostrarla.
*/

public class Ejercicio9_Clase12 {

    public static void main(String[] args) {
        // Tamaño de la matriz cuadrada (TAMANIO x TAMANIO)
        final int TAMANIO = 5;

        // Matriz marco. Java inicializa todos sus elementos en 0 por defecto.
        int[][] marco = new int[TAMANIO][TAMANIO];

        // ---------------------------------------------------------
        // 1. CARGA: se recorre la matriz completa. Un elemento está en
        //    el borde si cumple al menos una de estas condiciones:
        //      - está en la primera fila (i == 0)
        //      - está en la última fila (i == TAMANIO - 1)
        //      - está en la primera columna (j == 0)
        //      - está en la última columna (j == TAMANIO - 1)
        //    A esos elementos se les asigna 1; el resto queda en 0.
        // ---------------------------------------------------------
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                if (i == 0 || i == TAMANIO - 1 || j == 0 || j == TAMANIO - 1) {
                    marco[i][j] = 1;
                } else {
                    marco[i][j] = 0;   // explícito para mayor claridad
                }
            }
        }

        // ---------------------------------------------------------
        // 2. MOSTRAR la matriz, una fila por línea
        // ---------------------------------------------------------
        System.out.println("Matriz marco de " + TAMANIO + "x" + TAMANIO + ":");
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                System.out.print(marco[i][j] + " ");
            }
            System.out.println();   // salto de línea al terminar cada fila
        }
    }
}