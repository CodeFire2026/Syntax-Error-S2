/*
 * Proyecto caja:
 * Ejercicio 1: Crear un proyecto según las especificaciones
 * mostradas a continuación.
 * La formula es: volumen = ancho * alto * profundidad
 */
public class Caja {

    private double ancho;
    private double alto;
    private double profundidad;

    // Constructor vacío
    public Caja() {
        this.ancho = 0;
        this.alto = 0;
        this.profundidad = 0;
    }

    // Constructor con parámetros
    public Caja(double ancho, double alto, double profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }

    // Getters y Setters
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    // Método para calcular el volumen
    public double calcularVolumen() {
        return ancho * alto * profundidad;
    }

    @Override
    public String toString() {
        return "Caja [ancho=" + ancho + ", alto=" + alto
                + ", profundidad=" + profundidad
                + ", volumen=" + calcularVolumen() + "]";
    }
}
