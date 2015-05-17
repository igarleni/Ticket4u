package ticket4u;

import java.util.Date;

public class Factura {
    private final Date fecha;
    private static int idSeed = 0;
    private final int idFactura;
    private final Usuario usuario;
    private final CuentaBancaria pago;

    public Factura(double precio, Usuario usuario, CuentaBancaria pago) {
        this.usuario = usuario;
        idFactura = idSeed;
        idSeed ++;
        fecha = new Date();
        this.pago = pago;
    }

    public Date realizarDevolucion(){
        return fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
