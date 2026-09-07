package Ciclos05;

import java.util.Scanner;

public class AdivinarNumero {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numeroSecreto = (int) (Math.random() * 101);
        int numero;
        int intentos = 0;

        System.out.println("Adivina el número entre 0 y 100");

        do {
            System.out.print("Ingresa un número: ");
            numero = teclado.nextInt();
            intentos++;

            if (numero > numeroSecreto) {
                System.out.println("Es menor");
            } else if (numero < numeroSecreto) {
                System.out.println("Es mayor");
            } else {
                System.out.println("¡Correcto!");
                System.out.println("Número de intentos: " + intentos);
            }

        } while (numero != numeroSecreto);

        teclado.close();
    }
}