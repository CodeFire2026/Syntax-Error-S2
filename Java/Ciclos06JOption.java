/*
Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar
la suma de todos los números introducidos.
*/
package Ciclos06;

import javax.swing.JOptionPane;

public class Ciclos06JOption {
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para sumarlo: "));
        int suma = 0;
        
        while (num != 0){
            suma+= num;
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número para sumarlo (0 para terminar): "));
        } 
        
        JOptionPane.showMessageDialog(null,"Suma total: "+ suma);
    }
}
