import javax.swing.JOptionPane;
/*Ejercicio 5: realizr un Juego para adivinar un número aleatorio entre 0 y 100, 
y luego ir pidiendo numeros indicando "Es mayor" o "Es menor" segun sea mayot o menor con respecto a N
El proceso termina cuando el usuario acierta el nuemro, y mostramos el numero de intentos echos.
 */

public class AdivinaNuemeroJoption {
    public static void main(String[] args) {
        // Generar un número aleatorio entre 0 y 100
        int numeroAleatorio = (int) (Math.random() * 101);
        int numeroIngresado;
        int contadorIntentos = 0;

        do {
            // Pedir el número al usuario usando JOptionPane
            String input = JOptionPane.showInputDialog(null, 
                    "Digita un número entre 0 y 100:", 
                    "Juego Adivina el Número", 
                    JOptionPane.QUESTION_MESSAGE);
            
            // Si el usuario presiona cancelar, salimos para evitar errores
            if (input == null) {
                return;
            }

            numeroIngresado = Integer.parseInt(input);
            contadorIntentos++;

            // Comprobar si es mayor, menor o si acierta
            if (numeroIngresado > numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "¡Es menor! Intenta con un número más pequeño.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else if (numeroIngresado < numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "¡Es mayor! Intenta con un número más grande.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, 
                        "¡Felicidades! Adivinaste el número.\nNúmero de intentos: " + contadorIntentos, 
                        "¡Ganaste!", 
                        JOptionPane.INFORMATION_MESSAGE);
            }

        } while (numeroIngresado != numeroAleatorio);
    }
}