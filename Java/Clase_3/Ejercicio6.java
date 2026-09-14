/*
Ejercicio 6: Pedir número hasta que se teclee un 0, mostrar la suma
de todos los números
*/
package clase4;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        var numero = Integer.parseInt(entrada.nextLine());

        var suma = 0;

        while (numero != 0){
            suma = suma + numero;

            System.out.println("Ingrese otro número: ");
            numero = Integer.parseInt(entrada.nextLine());

        }
        System.out.println("El número " + numero + " finaliza el programa");
        System.out.println("La suma de todos los números es: " + suma);
    }
}
