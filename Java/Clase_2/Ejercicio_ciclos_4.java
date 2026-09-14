/*
 * Ejercicio 4: Pedir números hasta que se teclee uno negativo,
 * y mostrar cuántos números se han introducido.
 * Lo hacemos primero con la clase Scanner.
 * Luego lo hacemos con la clase JOptionPane.
 */
package Ciclos04;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos04 {

    public static void main(String[] args) {
        // 1) Primero lo resolvemos con la clase Scanner
        conScanner();

        // 2) Luego lo resolvemos con la clase JOptionPane
        conJOptionPane();
    }

    // Versión con la clase Scanner (por consola)
    public static void conScanner() {
        Scanner sc = new Scanner(System.in);
        int numero;
        int contador = 0;   // cuenta cuántos números se han introducido

        System.out.println("=== Versión con Scanner ===");

        // Pedimos el primer número
        System.out.print("Introduce un número (negativo para terminar): ");
        numero = sc.nextInt();

        // Mientras el número NO sea negativo, seguimos pidiendo
        while (numero >= 0) {
            contador++;   // contamos el número que se acaba de introducir
            System.out.print("Introduce un número (negativo para terminar): ");
            numero = sc.nextInt();
        }

        System.out.println("Se han introducido " + contador + " números.\n");
    }

    // Versión con la clase JOptionPane (con ventanas)
    public static void conJOptionPane() {
        int numero;
        int contador = 0;

        // Pedimos el primer número
        String texto = JOptionPane.showInputDialog(
                "Introduce un número (negativo para terminar):");
        numero = Integer.parseInt(texto);

        // Mientras el número NO sea negativo, seguimos pidiendo
        while (numero >= 0) {
            contador++;
            texto = JOptionPane.showInputDialog(
                    "Introduce un número (negativo para terminar):");
            numero = Integer.parseInt(texto);
        }

        JOptionPane.showMessageDialog(null,
                "Se han introducido " + contador + " números.");
    }
}
