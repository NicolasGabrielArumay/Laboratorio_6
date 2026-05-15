
package eComerce_LaReserva;

public class Vino extends Producto{
    private String tipoVino;

    public Vino() {
    }

    public Vino(String tipoVino) {
        this.tipoVino = tipoVino;
    }

    public Vino(String tipoVino, int idProducto, String nombre, double precio, double valorCosto, int stock, double graduacionAlcoholica) {
        super(idProducto, nombre, precio, valorCosto, stock, graduacionAlcoholica);
        this.tipoVino = tipoVino;
    }

    public String getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(String tipoVino) {
        this.tipoVino = tipoVino;
    }
    
    public void mostrarMaridaje(){
        
    }

    @Override
    public String toString() {
        return "Vino{" + "tipoVino=" + tipoVino + '}';
    }
    
    
}
