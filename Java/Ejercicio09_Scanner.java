/* Ejercicio 09: Scanner y JOptionPane Pedir dia, mes y año de una fecha
e indicar si la fecha es correcta . Suponinedo que todos los meses tienen 30 días.
 */
import java.util.Scanner;


public class Ejercicio09_Scanner {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
    
        
        System.out.print("Digite el dia: ");
        int dia = entrada.nextInt();

        System.out.print("Digite el mes: ");
        int mes = entrada.nextInt();

        System.out.print("Digite el año: ");
        int año = entrada.nextInt();

        //Validaremos el dia, mes, año

        if ((dia >=1 && dia <=30) && (mes >= 1 && mes <= 12) && (año >0)){
            System.out.println("La fehca es correcta: " + dia + "/" + mes + "/" + año );
        }
        else{
            System.out.println("La fecha ingresada es incorrecta, uno o mas datos ingresados no son correctos");
        }
        entrada.close();
    }
}
