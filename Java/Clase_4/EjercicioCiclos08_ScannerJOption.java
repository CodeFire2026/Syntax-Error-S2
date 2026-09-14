package Ciclos08;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjercicioCiclos08_ScannerJOption {

    public static void main(String[] args) {

        scanner();
        jOptionPane();

    }

    public static void scanner() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número N: ");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void jOptionPane() {

        int n = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese un número N:")
        );

        String resultado = "";

        for (int i = 1; i <= n; i++) {
            resultado += i + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
