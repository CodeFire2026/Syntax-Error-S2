// Tarea: crear 10 objetos más de tipo Producto
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

// Tarea: crear 2 objetos más de tipo Orden
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