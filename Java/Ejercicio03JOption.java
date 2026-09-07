/*
Ejercicio3: Leer números hasta que se introduzca un cero
Para cada uno indicar si es par o impar.
Primero lo haremos con la clase Scanner
Luego con la clase JOptionPane
*/
package Ciclos03;
import javax.swing.JOptionPane;


public class Ejercicio03JOption {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while (numero != 0){
            if (numero % 2 == 0){
               JOptionPane.showMessageDialog(null,"Tu número es par");
            }
            else{
               JOptionPane.showMessageDialog(null,"Tu número es impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número (0 para salir): "));
        }
        JOptionPane.showMessageDialog(null,"El programa finalizo");
    }
}
