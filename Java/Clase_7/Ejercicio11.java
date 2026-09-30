package Ejercicio11;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio11 {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Scanner");
            System.out.println("2. JOptionPane");
            
            int opcion = teclado.nextInt();
            
            long producto = 1;
            
            for (int i = 1; i <= 19; i += 2) {
                producto = producto * i;
            }
            
            if (opcion == 1) {
                
                System.out.println("El producto de los 10 primeros números impares es: " + producto);
                
            } else if (opcion == 2) {
                
                JOptionPane.showMessageDialog(null,
                        "El producto de los 10 primeros números impares es: " + producto);
                
            } else {
                
                System.out.println("Opción incorrecta.");
            }
        }
    }
}