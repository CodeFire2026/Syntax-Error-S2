/*
Ejercicio 7: Pedir números hasta que se introduzca uno negativo
y calcular la media
*/
package Ciclos07;

import javax.swing.JOptionPane;

public class Ciclos07JOption {
    public static void main(String[] args) {
              
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para calcular la media: "));
              
        double media = 0;        
        double suma = 0;
        double contador = 0;

        while (num >= 0){
            suma += num;
            contador++;
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número para calcular la media(Número negativo para salir): "));
            media = (suma / contador);
        }
        
        JOptionPane.showMessageDialog(null,"La media de los números ingresados es de: "+ media);
    }
}
