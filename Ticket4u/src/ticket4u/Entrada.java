package ticket4u;

public class Evento {
    private final String nombre;
    private final int idEvento;
    private final String tipoEvento;
    private final String descripcion;
    private  Butaca [] listaButacas;
    private final int aforo;
    public Evento(String nombre, int id, String tipoEvento, String descripcion, int aforo) {
        this.nombre = nombre;
        this.idEvento = id;
        this.tipoEvento = tipoEvento;
        this.descripcion = descripcion;
        crearButacas();
        this.aforo=aforo;
    }

    private void crearButacas() {
        listaButacas=new Butaca[aforo];
        for (int i = 0; i <aforo ; i++) {
            listaButacas[i]=new Butaca(i+1,true,idEvento);
        }
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

    public Butaca getButacas(int idButaca) {
        return listaButacas[idButaca];
    }

    public int getAforo() {
        return aforo;
    }

}
