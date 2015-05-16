package ticket4u;

import java.util.ArrayList;

public class HistorialDeCompra {
    private final ArrayList<Compra> listaCompras;

    public HistorialDeCompra() {
       listaCompras = new ArrayList<>();
    }

    public ArrayList<Compra> getListaCompras() {
        return listaCompras;
    }

    public void addCompra(Compra compra){
        this.listaCompras.add(compra);
    }

    public void eliminarCompra(Compra compra){
        this.listaCompras.remove(compra);
    }
}