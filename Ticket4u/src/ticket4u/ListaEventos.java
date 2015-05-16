package ticket4u;

import java.util.ArrayList;

public class ListaEventos {
    private ArrayList<Evento> listaEventos;

    public ListaEventos() {
        listaEventos = new ArrayList<>();
    }

    public  void addEvento(Evento evento) {
        listaEventos.add(evento);
    }

    public void deleteEvento(Evento evento){
        listaEventos.remove(evento);
    }
}
