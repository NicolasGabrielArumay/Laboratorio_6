
package Mat_NoodlesSRL;

public class Producto {
    private TipoPasta tipoPasta;
    private double cantidad;
    private double precio;

    public Producto() {
    }

    public Producto(TipoPasta tipoPasta, double cantidad, double precio) {
        this.tipoPasta = tipoPasta;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public TipoPasta getTipoPasta() {
        return tipoPasta;
    }

    public void setTipoPasta(TipoPasta tipoPasta) {
        this.tipoPasta = tipoPasta;
    }

    
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" + "tipoPasta=" + tipoPasta + 
                ", cantidad=" + cantidad + 
                ", precio=" + precio + '}';
        
    }

    public void cargarPedido(){
    
    
    }
}