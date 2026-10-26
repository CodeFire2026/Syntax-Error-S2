class Producto{

    static contadorProductos = 0;

    constructor(nombre, precio){
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }

    get idProducto(){
        return this._idProducto;
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get precio(){
        return this._precio;
    }

    set precio(precio){
        this._precio = precio;
    }

    toString(){
        return `${this._precio} ${this._nombre} ProductoId: ${this._idProducto}`;
    }
}

class Orden{

    static contadorOrdenes = 0;
    static MAX_PRODUCTOS = 5;

    constructor(){
    this._idOrden = ++Orden.contadorOrdenes;
    this._productos = [];
    }

    agregarProducto(producto){
        if(this._productos.length < Orden.MAX_PRODUCTOS){
            this._productos.push(producto);
        } else {
            console.log("Cantidad de productos "+ this._productos.length + ", no se pueden agregar más.")
        }

    }

    calcularTotal(){
        let total = 0;
        for(let producto of this._productos){
            total += producto.precio;
        }
        return total;
    }

    toString(){
        let productosStr = "";
        for(let producto of this._productos){
            productosStr += "\n   " + producto.toString(); 
        }
        return `Orden: ${this._idOrden}, Total: ${this.calcularTotal()} \nProductos: ${productosStr}`; 
    }

    mostrarOrden(){
        console.log(this.toString());
    }
    
}

//Prueba clase Producto
producto1 = new Producto("Jamon",1200);
producto2 = new Producto("Queso",1100)
producto3 = new Producto("Salame",1500)
producto4 = new Producto("Pan",4000);
producto5 = new Producto("Mayonesa", 2200);
producto6 = new Producto("Cigarrillo", 3200); //Este producto no se muestra, supero el limite de 5.

//Prueba clase Orden
orden1 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);
orden1.agregarProducto(producto4);
orden1.agregarProducto(producto5);
orden1.agregarProducto(producto6);
//Mostrar Orden
orden1.mostrarOrden();

orden2 = new Orden();
orden2.agregarProducto(producto6);
orden2.agregarProducto(producto4);

orden2.mostrarOrden();


