package eComerce_LaReserva;

import java.util.Date;

public class Pedido {

    private int idPedido;
    private Date fecha;
    private double total;
    private EstadoPedido estado;

    public Pedido() {
    }

    public Pedido(int idPedido, Date fecha, double total, EstadoPedido estado) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void agregarDetalle(DetallePedido datalle) {

    }

    public double calcularTotal() {
        return 0.0;
    }

    public void confirmarPedido() {

    }

    public Pago generarPago() {
        Pago pago = new Pago();
        return pago;
    }

    public void cambiarEstado() {

    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", fecha=" + fecha + ", total=" + total + ", estado=" + estado + '}';
    }
}
