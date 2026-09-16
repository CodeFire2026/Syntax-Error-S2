package ciclos10;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int sumaTotal = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = entrada.nextInt();
            sumaTotal += numero; // Suma acumulativa
        }

        System.out.println("\nLa suma total de los 10 números es: " + sumaTotal);

        // Mostrar el resultado también con JOptionPane
        JOptionPane.showMessageDialog(null, "La suma total de los 10 números es: " + sumaTotal);

        entrada.close();
    }
}