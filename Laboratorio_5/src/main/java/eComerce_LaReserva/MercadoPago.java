package eComerce_LaReserva;

import java.util.Date;

public class MercadoPago extends Pago {

    private String aliasCuenta;

    public MercadoPago() {
    }

    public MercadoPago(String aliasCuenta) {
        this.aliasCuenta = aliasCuenta;
    }

    public MercadoPago(String aliasCuenta, int idPago, int monto, Date fechaPado) {
        super(idPago, monto, fechaPado);
        this.aliasCuenta = aliasCuenta;
    }

    public String getAliasCuenta() {
        return aliasCuenta;
    }

    public void setAliasCuenta(String aliasCuenta) {
        this.aliasCuenta = aliasCuenta;
    }

    public boolean validarCuenta() {
        return false;
    }
}
