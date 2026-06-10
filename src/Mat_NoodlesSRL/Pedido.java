
package Mat_NoodlesSRL;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    private Cliente cliente;
    private String medioVenta;
    private ArrayList<Producto> items;

    public Pedido(Cliente cliente, String medioVenta, ArrayList<Producto> items) {
        this.cliente = cliente;
        this.medioVenta = medioVenta;
        this.items = items;
    }

    public Pedido() {
    }
    
    public Pedido(Cliente cliente){
        this.cliente = cliente;
        this.items = new ArrayList<>();
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

    public ArrayList<Producto> getItems() {
        return items;
    }

    public void setItems(ArrayList<Producto> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Pedido{" + "cliente=" + cliente + 
                ", medioVenta=" + medioVenta + 
                ", items=" + items + '}';
        
    }
    
    public void agregarProducto(Producto producto) {
        items.add(producto);
    }

    public void cargarMedioVenta() {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Teléfono");
        System.out.println("2 - Web");
        System.out.println("3 - Redes Sociales");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1 ->
                medioVenta = "Teléfono";
            case 2 ->
                medioVenta = "Web";
            case 3 ->
                medioVenta = "Redes Sociales";
            default ->
                throw new IllegalArgumentException("Opción inválida");
        }
    }
}
