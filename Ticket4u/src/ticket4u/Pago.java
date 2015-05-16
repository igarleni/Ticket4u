package ticket4u;

import java.util.Date;

public class Pago {
    private final Date fecha;
    private final int id;
    private final Usuario usuario;

    public Pago(Date fecha, int id, Usuario usuario) {
        this.fecha = fecha;
        this.id = id;
        this.usuario = usuario;
    }

    public void obtenerFactura(){

    }
    public static Date realizarDevolucion(){
        return fecha;
    }
}
