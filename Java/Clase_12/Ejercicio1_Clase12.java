/*
Ejercicio 4: Leer 10 números enteros, guardarlos en un arreglo.
Debemos mostrarlos en el siguiente orden: el primero, el último,
el segundo, el penúltimo, el tercero, etc.
*/

import java.util.Scanner;

public class Ejercicio1_Clase12 {

    public static void main(String[] args) {
        // Objeto Scanner para leer los datos ingresados por teclado
        Scanner sc = new Scanner(System.in);

        // Cantidad de números a leer. Se define como constante para poder
        // modificarla en un solo lugar si cambia el enunciado.
        final int N = 10;

        // Arreglo de enteros donde se guardarán los números ingresados
        int[] numeros = new int[N];

        // ---------------------------------------------------------
        // 1. LECTURA: se recorre el arreglo de la posición 0 a N-1
        //    pidiendo un número por cada posición.
        // ---------------------------------------------------------
        for (int i = 0; i < N; i++) {
            // Se muestra (i + 1) para que el usuario vea "número 1"
            // en lugar de "número 0", aunque el índice empiece en 0.
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // ---------------------------------------------------------
        // 2. MOSTRAR EN ORDEN ALTERNADO: primero, último, segundo,
        //    penúltimo, tercero, etc.
        //    Se usan dos índices que avanzan uno hacia el otro:
        //      - inicio: parte de la primera posición (0) y va aumentando.
        //      - fin: parte de la última posición (N - 1) y va disminuyendo.
        // ---------------------------------------------------------
        System.out.println("\nNúmeros en el orden pedido:");

        int inicio = 0;      // índice que recorre desde el principio
        int fin = N - 1;     // índice que recorre desde el final

        // El ciclo continúa mientras los índices no se hayan cruzado.
        while (inicio <= fin) {

            // Se muestra el elemento de la posición "inicio"
            System.out.print(numeros[inicio] + " ");

            // Se muestra el elemento de la posición "fin", salvo que ambos
            // índices apunten al mismo elemento (caso de cantidad impar,
            // donde el elemento central se mostraría dos veces).
            if (inicio != fin) {
                System.out.print(numeros[fin] + " ");
            }

            // Los índices se acercan uno al otro
            inicio++;
            fin--;
        }

        // Salto de línea final para que la salida quede prolija
        System.out.println();

        // Se cierra el Scanner para liberar el recurso
        sc.close();
    }
}