
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio_12_Factorial {

    public static void main(String[] args) {

        String opcion = JOptionPane.showInputDialog(
                "MENU\n"
                + "1 - Usar Scanner\n"
                + "2 - Usar JOptionPane\n"
                + "3 - Salir\n\n"
                + "Elija una opción:"
        );

        if (opcion.equals("1")) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();

            int factorial = 1;

            for (int i = 1; i <= numero; i++) {
                factorial = factorial * i;
            }

            System.out.println("El factorial es: " + factorial);

        } else if (opcion.equals("2")) {

            int numero = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese un número:")
            );

            int factorial = 1;

            for (int i = 1; i <= numero; i++) {
                factorial = factorial * i;
            }

            JOptionPane.showMessageDialog(
                    null,
                    "El factorial es: " + factorial
            );

        } else if (opcion.equals("3")) {

            JOptionPane.showMessageDialog(null, "Programa terminado.");

        } else {

            JOptionPane.showMessageDialog(null, "Opción incorrecta.");
        }
    }
}
