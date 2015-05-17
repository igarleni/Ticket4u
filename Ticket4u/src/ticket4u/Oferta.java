package ticket4u;

import java.util.Date;

public class Oferta {
    private Date fechaCaducidad;
    private static int idSeed = 0;
    private final int idOferta;
    private double descuento;

    public Oferta(Date fechaCaducidad, double descuento) {
        idOferta = idSeed;
        idSeed++;
        this.fechaCaducidad = fechaCaducidad;
        this.descuento = descuento;
    }

    public void modificarOferta(Date fechaInicio, Date fechaCaducidad, double descuento){
        this.fechaCaducidad = fechaCaducidad;
        this.descuento = descuento;
    }
    
    public double getDescuento() {
        return descuento;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public int getIdOferta() {
        return idOferta;
    }
}