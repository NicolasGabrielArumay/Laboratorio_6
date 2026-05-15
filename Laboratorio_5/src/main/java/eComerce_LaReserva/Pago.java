package eComerce_LaReserva;

import java.util.Date;

public class Pago {

    private int idPago;
    private int monto;
    private Date fechaPado;

    public Pago() {
    }

    public Pago(int idPago, int monto, Date fechaPado) {
        this.idPago = idPago;
        this.monto = monto;
        this.fechaPado = fechaPado;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getFechaPado() {
        return fechaPado;
    }

    public void setFechaPado(Date fechaPado) {
        this.fechaPado = fechaPado;
    }

    public boolean procesarPago() {
        return false;
    }

    public void emitirComprobante() {

    }

    @Override
    public String toString() {
        return "Pago{" + "idPago=" + idPago + ", monto=" + monto + ", fechaPado=" + fechaPado + '}';
    }

}
