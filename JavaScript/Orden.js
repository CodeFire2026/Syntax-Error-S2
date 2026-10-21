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