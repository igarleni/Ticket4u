package ticket4u;

import java.util.Date;

public class Audicion {
    private static int idSeed = 0;
    private final int idAudicion;
    private final Evento evento;
    private Butaca[] listaButacas;
    private final int aforo;
    private final Date fecha;

    public Audicion(Evento evento, int aforo, Date fecha) {
        idAudicion = idSeed;
        idSeed++;
        this.evento = evento;
        this.aforo = aforo;
        this.fecha = fecha;
        crearButacas();
    }

    private void crearButacas() {
        listaButacas = new Butaca[aforo];
        for (int i = 0; i < aforo; i++) {
            listaButacas[i] = new Butaca(i, this);
        }
    }

    public Butaca ocuparButaca(){
        for (int i = 0; i < listaButacas.length; i++) {
            Butaca butaca = listaButacas[i];
            if(butaca.getEstadoButaca() == true){
                butaca.setEstadoButaca(false);
                return butaca;
            }
        }
        return null;
    }

    public int getIdAudicion() {
        return idAudicion;
    }

    public Evento getEvento() {
        return evento;
    }

    public Butaca[] getListaButacas() {
        return listaButacas;
    }

    public int getAforo() {
        return aforo;
    }

    public Date getFecha() {
        return fecha;
    }
    
    
    
    
}
