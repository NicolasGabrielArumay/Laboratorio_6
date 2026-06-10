
package Mat_NoodlesSRL;

public class Productos {
    private String tipoPasta;
    private double cantidad;
    private double precio;

    public Productos() {
    }

    public Productos(String tipoPasta, double cantidad, double precio) {
        this.tipoPasta = tipoPasta;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getTipoPasta() {
        return tipoPasta;
    }

    public void setTipoPasta(String tipoPasta) {
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