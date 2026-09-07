/*
Ejercicio 7: Pedir números hasta que se introduzca uno negativo
y calcular la media
*/
package Ciclos07;
import java.util.Scanner;

public class Ciclos07 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite un número para calcular la media: ");
        
        int num = Integer.parseInt(teclado.nextLine());
        double media = 0;
        double suma = 0;     
        double contador = 0;
              
        while (num >= 0){
            suma += num;
            contador++;
            System.out.println("Digite otro número para calcular la media(Número negativo para salir): ");
            num = Integer.parseInt(teclado.nextLine());
            media = (suma / contador);
        }
        System.out.println("La media de los números ingresados es de: "+ media);
    }
    
}
