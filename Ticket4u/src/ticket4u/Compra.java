package ticket4u;

import java.util.ArrayList;
import java.util.Iterator;

public class Compra {
    private final int id;
    private ArrayList<Entrada> listaEntradas;
    private final double IVA;

    public Compra(int id, int numFactura, int IVA) {
        this.id = id;
        listaEntradas=new ArrayList<>();
        this.IVA = IVA;

    }

    public double calculoTotal(){
        Iterator<Entrada> iterador= listaEntradas.iterator();
        double precio=0;
        while(iterador.hasNext()){
            Entrada entrada = iterador.next();
            precio = precio + entrada.getPrecio();
            
        }
        precio = precio + (precio*(1/IVA));
        return precio;
    }
    public void addEntradas(Entrada entrada){
        this.listaEntradas.add(entrada);
    }

    public ArrayList<Entrada> getListaEntradas() {
        return listaEntradas;
    }

    public void deleteEntrada(Entrada entrada){
        this.listaEntradas.remove(entrada);
    }
}
