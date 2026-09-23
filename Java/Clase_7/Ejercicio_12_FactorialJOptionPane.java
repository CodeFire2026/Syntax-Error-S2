
import javax.swing.JOptionPane;

public class Ejercicio_12_FactorialJOptionPane {

    public static void main(String[] args) {

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
    }
}
