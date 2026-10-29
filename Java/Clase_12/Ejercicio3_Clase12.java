/*
Ejercicio 11: Leer 5 elementos numéricos que se introducirán ordenados
de forma creciente. Éstos los guardaremos en una tabla de tamaño 10.
Leer un número N, e insertarlo en el lugar adecuado para que la tabla
continúe ordenada.
*/

import java.util.Scanner;

public class Ejercicio3_Clase12 {

    public static void main(String[] args) {
        // Objeto Scanner para leer los datos ingresados por teclado
        Scanner sc = new Scanner(System.in);

        // Tamaño total de la tabla y cantidad de elementos que se leen al inicio
        final int TAMANIO = 10;
        final int INICIALES = 5;

        // Tabla de tamaño 10. Solo las primeras "cantidad" posiciones están ocupadas.
        int[] tabla = new int[TAMANIO];
        int cantidad = 0;

        // ---------------------------------------------------------
        // 1. LECTURA de los 5 números iniciales (se ingresan ordenados
        //    de menor a mayor, tal como indica el enunciado).
        // ---------------------------------------------------------
        System.out.println("Ingrese " + INICIALES + " números en orden creciente:");
        for (int i = 0; i < INICIALES; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            tabla[i] = sc.nextInt();
            cantidad++;
        }

        // ---------------------------------------------------------
        // 2. LECTURA del número N que se va a insertar
        // ---------------------------------------------------------
        System.out.print("\nIngrese el número N a insertar: ");
        int n = sc.nextInt();

        // ---------------------------------------------------------
        // 3. BÚSQUEDA DE LA POSICIÓN: se recorre la tabla hasta encontrar
        //    el primer elemento mayor que N. Ahí debe ir N.
        //    Si no hay ninguno mayor, N va al final (posición "cantidad").
        // ---------------------------------------------------------
        int posicion = 0;
        while (posicion < cantidad && tabla[posicion] <= n) {
            posicion++;
        }

        // ---------------------------------------------------------
        // 4. DESPLAZAMIENTO: se corren una posición a la derecha todos los
        //    elementos desde "posicion" hasta el último, para hacer lugar.
        //    Se recorre de atrás hacia adelante para no pisar ningún dato.
        // ---------------------------------------------------------
        for (int i = cantidad; i > posicion; i--) {
            tabla[i] = tabla[i - 1];
        }

        // ---------------------------------------------------------
        // 5. INSERCIÓN: se coloca N en el lugar que quedó libre
        // ---------------------------------------------------------
        tabla[posicion] = n;
        cantidad++;

        // ---------------------------------------------------------
        // 6. MOSTRAR la tabla resultante (solo las posiciones ocupadas)
        // ---------------------------------------------------------
        System.out.println("\nTabla resultante:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(tabla[i] + " ");
        }
        System.out.println();

        // Se cierra el Scanner para liberar el recurso
        sc.close();
    }
}