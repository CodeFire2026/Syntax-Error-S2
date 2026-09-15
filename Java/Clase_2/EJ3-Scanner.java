import java.util.Scanner;

public class Ejercicio03Scanner {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero (0 para terminar): ");
        numero = teclado.nextInt();

        while (numero != 0) {

            if (numero % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
            }

            System.out.print("Ingrese otro numero (0 para terminar): ");
            numero = teclado.nextInt();
        }

        System.out.println("Programa terminado.");

    }
}