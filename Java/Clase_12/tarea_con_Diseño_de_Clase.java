public class Main {

    public static void main(String[] args) {
        // Productos originales 
        Producto producto1 = new Producto("Libro", 15.00);
        Producto producto2 = new Producto("Cuaderno", 5.50);

        Orden orden1 = new Orden();
        // Agregamos productos al arreglo
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

        // Tarea: crear más objetos de tipo Producto = 10
        Producto producto3 = new Producto("Teclado", 45.50);
        Producto producto4 = new Producto("Mouse", 20.00);
        Producto producto5 = new Producto("Monitor", 250.00);
        Producto producto6 = new Producto("Auriculares", 35.90);
        Producto producto7 = new Producto("Webcam", 40.00);
        Producto producto8 = new Producto("Impresora", 180.00);
        Producto producto9 = new Producto("Pendrive", 12.50);
        Producto producto10 = new Producto("Disco externo", 80.00);
        Producto producto11 = new Producto("Parlantes", 55.00);
        Producto producto12 = new Producto("Notebook", 900.00);

        // Tarea: crear más objetos de tipo Orden = 2
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto7);
        orden2.mostrarOrden();

        Orden orden3 = new Orden();
        orden3.agregarProducto(producto8);
        orden3.agregarProducto(producto9);
        orden3.agregarProducto(producto10);
        orden3.agregarProducto(producto11);
        orden3.agregarProducto(producto12);
        orden3.mostrarOrden();
    }
}

class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}

class Orden {
    private Producto[] productos = new Producto[10];
    private int contador = 0;

    public void agregarProducto(Producto producto) {
        if (contador < productos.length) {
            productos[contador] = producto;
            contador++;
        } else {
            System.out.println("La orden está llena, no se puede agregar: " + producto.getNombre());
        }
    }

    public void mostrarOrden() {
        System.out.println("----- Orden -----");
        double total = 0;
        for (int i = 0; i < contador; i++) {
            System.out.println(productos[i]);
            total += productos[i].getPrecio();
        }
        System.out.println("Total: $" + total);
        System.out.println();
    }
}