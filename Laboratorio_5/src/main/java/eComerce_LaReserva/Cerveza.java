
package eComerce_LaReserva;

public class Cerveza extends Producto {
   private String tipoCerveza;

    public Cerveza() {
    }

    public Cerveza(String tipoCerveza) {
        this.tipoCerveza = tipoCerveza;
    }

    public Cerveza(String tipoCerveza, int idProducto, String nombre, double precio, double valorCosto, int stock, double graduacionAlcoholica) {
        super(idProducto, nombre, precio, valorCosto, stock, graduacionAlcoholica);
        this.tipoCerveza = tipoCerveza;
    }

    
   
   
}
