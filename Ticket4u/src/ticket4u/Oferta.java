package ticket4u;

import java.util.Date;

public class Oferta {
    private final Date fechaInicio;
    private final Date fechaCaducidad;
    private final Evento evento;
    private final int id;

    public Oferta(Date fechaInicio, Date fechaCaducidad, Evento evento, int id) {
        this.fechaInicio = fechaInicio;
        this.fechaCaducidad = fechaCaducidad;
        this.evento = evento;
        this.id = id;
    }

    public void modificarOferta(){

    }
    public void addOferta(){

    }
    public void eliminarOferta(){

    }
}