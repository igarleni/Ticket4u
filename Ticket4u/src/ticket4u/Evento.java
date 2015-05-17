package ticket4u;

public class Evento {
    private static int idSeed = 0;
    private final int idEvento;
    private final String nombre;
    private final String tipoEvento;
    private final String descripcion;
    
    public Evento(String nombre, String tipoEvento, String descripcion, int aforo) {
        idEvento = idSeed;
        idSeed++;
        this.nombre = nombre;
        this.tipoEvento = tipoEvento;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return idEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
