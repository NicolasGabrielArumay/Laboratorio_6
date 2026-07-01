
package Mat_NoodlesSLR;

import java.util.Scanner;

public class Producto{

    private TipoPasta tipo;
    private double cantidad;
    private double precio;

    public Producto() {
    }

    public Producto(TipoPasta tipo, double cantidad, double precio) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public TipoPasta getTipo() {
        return tipo;
    }

    public void setTipo(TipoPasta tipo) {
        this.tipo = tipo;
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
        return tipo + " Cantidad: " + cantidad + " Precio: $" + precio;
    }
    
    public void cargarProducto() throws PedidoInvalidoException {
        
        Scanner sc = new Scanner(System.in);
        Scanner scd = new Scanner(System.in);
        System.out.println("Tipo de pasta:");
        System.out.println("1-Fideos al huevo");
        System.out.println("2-Ravioles");
        System.out.println("3-Noquis");
        System.out.println("4-Agnolotis");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                tipo = TipoPasta.FIDEOS_AL_HUEVO;
                break;
            case 2:
                tipo = TipoPasta.RAVIOLES;
                break;
            case 3:
                tipo = TipoPasta.ÑOQUIS;
                break;
            case 4:
                tipo = TipoPasta.AGNOLOTIS;
                break;
            default:
                throw new IllegalArgumentException("Tipo invalido");
        }

        if (tipo == TipoPasta.RAVIOLES
                || tipo == TipoPasta.AGNOLOTIS) {

            System.out.println("Ingrese cantidad de cajas:");
            cantidad = scd.nextDouble();

            if (cantidad <= 0) {
                throw new PedidoInvalidoException("Cantidad de cajas invalida");
            }
        } else {

            System.out.println("Ingrese kilos:");
            cantidad = scd.nextDouble();

            if (cantidad <= 0 || cantidad > 10) {
                throw new PedidoInvalidoException("Kg invalidos");
            }
        }
    }
}
