package eComerce_LaReserva;

import java.util.Date;

public class TarjetaDeCredito extends Pago {

    private String numeroTarjeta;
    private String banco;

    public TarjetaDeCredito() {
    }

    public TarjetaDeCredito(String numeroTarjeta, String banco) {
        this.numeroTarjeta = numeroTarjeta;
        this.banco = banco;
    }

    public TarjetaDeCredito(String numeroTarjeta, String banco, int idPago, int monto, Date fechaPado) {
        super(idPago, monto, fechaPado);
        this.numeroTarjeta = numeroTarjeta;
        this.banco = banco;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public boolean validarTarjeta() {
        return false;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numeroTarjeta=" + numeroTarjeta + ", banco=" + banco + '}';
    }

}
