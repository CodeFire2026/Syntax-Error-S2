
package Herencia;

public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    
    public Empleado(String nombre, char genero, int edad,
            String direccion, int idEmpleado, double sueldo){
        super(nombre, genero, edad, direccion);
        
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo; 
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
