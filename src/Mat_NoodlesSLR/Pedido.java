package Mat_NoodlesSLR;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {

    private Cliente cliente;
    private String medioVenta;
    private ArrayList<Producto> productos;
    private double total;

    public Pedido() {
        productos = new ArrayList<>();
    }

    public Pedido(Cliente cliente, String medioVenta, ArrayList productos, double total) {
        this.cliente = cliente;
        this.medioVenta = medioVenta;
        this.productos = productos;
        this.total = total;
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

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    @Override
    public String toString() {
        return "Cliente: " + cliente +
                "\nMedio de venta: " + medioVenta +
                "\nProducto: " + productos +
                "\nTotal: $" + total;
    }

    public void pedirMedioVenta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Medio de venta:");
        System.out.println("1 - Telefono");
        System.out.println("2 - Web");
        System.out.println("3 - Redes Sociales");

        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                medioVenta = "Telefono";
                break;
            case 2:
                medioVenta = "Web";
                break;
            case 3:
                medioVenta = "Redes Sociales";
                break;
            default:
                throw new IllegalArgumentException("Medio de venta invalido");
        }
    }

    public void agregarProducto(Producto producto) {

        productos.add(producto);

    }

    public double calcularTotal() {

        double total = 0;

         for (Producto p : productos) {

            switch (p.getTipo()) {

                case FIDEOS_AL_HUEVO:
                    total += p.getCantidad() * 500;
                    break;

                case ÑOQUIS:
                    total += p.getCantidad() * 700;
                    break;

                case RAVIOLES:
                    total += p.getCantidad() * 1500;
                    break;

                case AGNOLOTIS:
                    total += p.getCantidad() * 1800;
                    break;
            }
        }

        return total;
    }
    public void mostrarResumen() {

        System.out.println("===== RESUMEN =====");
        System.out.println(cliente);
        System.out.println("Medio de venta: " + medioVenta);

        for (Producto p : productos) {
            System.out.println(p);
        }

        System.out.println("Importe: $" + calcularTotal());
    }
}