/*
Ejercicio 15: Leer 10 enteros ordenados crecientemente. Leer N y
buscarlo en la tabla. Se debe mostrar la posición en que se encuentra.
Si no está, indicarlo con un mensaje.
*/

import java.util.Scanner;

public class Ejercicio7_Clase12 {

    public static void main(String[] args) {
        // Objeto Scanner para leer los datos ingresados por teclado
        Scanner sc = new Scanner(System.in);

        // Cantidad de elementos de la tabla
        final int TAMANIO = 10;

        // Tabla de enteros (se ingresan ordenados de menor a mayor)
        int[] tabla = new int[TAMANIO];

        // ---------------------------------------------------------
        // 1. LECTURA de los 10 números ordenados crecientemente
        // ---------------------------------------------------------
        System.out.println("Ingrese " + TAMANIO + " números en orden creciente:");
        for (int i = 0; i < TAMANIO; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            tabla[i] = sc.nextInt();
        }

        // ---------------------------------------------------------
        // 2. LECTURA del número N a buscar
        // ---------------------------------------------------------
        System.out.print("\nIngrese el número N a buscar: ");
        int n = sc.nextInt();

        // ---------------------------------------------------------
        // 3. BÚSQUEDA BINARIA: como la tabla está ordenada, en cada paso
        //    se compara N con el elemento del medio:
        //      - si es igual, se encontró y se guarda la posición;
        //      - si N es menor, se sigue buscando en la mitad izquierda;
        //      - si N es mayor, se sigue buscando en la mitad derecha.
        //    "posicion" vale -1 mientras no se haya encontrado.
        // ---------------------------------------------------------
        int inicio = 0;
        int fin = TAMANIO - 1;
        int posicion = -1;

        while (inicio <= fin && posicion == -1) {
            int medio = (inicio + fin) / 2;

            if (tabla[medio] == n) {
                posicion = medio;        // encontrado
            } else if (n < tabla[medio]) {
                fin = medio - 1;         // descartar la mitad derecha
            } else {
                inicio = medio + 1;      // descartar la mitad izquierda
            }
        }

        // ---------------------------------------------------------
        // 4. MOSTRAR el resultado. Se suma 1 a la posición para
        //    mostrarla como la cuenta una persona (1 a 10), ya que
        //    los índices del arreglo empiezan en 0.
        // ---------------------------------------------------------
        if (posicion != -1) {
            System.out.println("El número " + n + " se encuentra en la posición " + (posicion + 1));
        } else {
            System.out.println("El número " + n + " no está en la tabla.");
        }

        // Se cierra el Scanner para liberar el recurso
        sc.close();
    }
}