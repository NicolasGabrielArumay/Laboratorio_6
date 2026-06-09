
package Mat_NoodlesSRL;

import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private String medioVenta;
    private ArrayList<Productos> items;

    public Pedido(Cliente cliente, String medioVenta, ArrayList<Productos> items) {
        this.cliente = cliente;
        this.medioVenta = medioVenta;
        this.items = items;
    }

    public Pedido() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getMedioVenta() {
        return medioVenta;
    }

    public void setMedioVenta(String medioVenta) {
        this.medioVenta = medioVenta;
    }

    public ArrayList<Productos> getItems() {
        return items;
    }

    public void setItems(ArrayList<Productos> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Pedido{" + "cliente=" + cliente + 
                ", medioVenta=" + medioVenta + 
                ", items=" + items + '}';
        
    }

    
    
}
