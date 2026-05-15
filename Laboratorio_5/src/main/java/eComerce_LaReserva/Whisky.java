package eComerce_LaReserva;

public class Whisky extends Producto{
    private int aniosAnejamiento;

    public Whisky() {
    }

    public Whisky(int aniosAnejamiento) {
        this.aniosAnejamiento = aniosAnejamiento;
    }

    public Whisky(int aniosAnejamiento, int idProducto, String nombre, double precio, double valorCosto, int stock, double graduacionAlcoholica) {
        super(idProducto, nombre, precio, valorCosto, stock, graduacionAlcoholica);
        this.aniosAnejamiento = aniosAnejamiento;
    }

    public int getAniosAnejamiento() {
        return aniosAnejamiento;
    }

    public void setAniosAnejamiento(int aniosAnejamiento) {
        this.aniosAnejamiento = aniosAnejamiento;
    }
    
    public void mostrarAntiguedad (){
        
    }

    @Override
    public String toString() {
        return "Whisky{" + "aniosAnejamiento=" + aniosAnejamiento + '}';
    }
    
    
}
