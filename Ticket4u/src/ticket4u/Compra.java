package ticket4u;

import java.util.ArrayList;

public class Compra {
    private static int idSeed;
    private final int idCompra;
    private final  ArrayList<Entrada> listaEntradas;
    private final double IVA;
    private double precioTotal;
    private final Oferta oferta;
    private Factura factura;
    private boolean pagoRealizado;
    private final Usuario usuario;

    public Compra(int IVA, Usuario usuario) {
        idCompra = idSeed;
        idSeed++;
        listaEntradas=new ArrayList<>();
        this.IVA = IVA;
        precioTotal = 0.0;
        pagoRealizado = false;
        this.usuario = usuario;
        oferta = null;
    }

    public Compra(int idCompra, double IVA,Usuario usuario, Oferta oferta) {
        this.idCompra = idCompra;
        listaEntradas=new ArrayList<>();
        this.IVA = IVA;
        precioTotal = 0.0;
        pagoRealizado = false;
        this.usuario = usuario;
        this.oferta = oferta;
    }

    public double getPrecioTotal() {
        if (oferta != null) return oferta.getDescuento()*precioTotal;
        return precioTotal;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public Factura getFactura() {
        return factura;
    }

    public void addEntradas(Entrada entrada){
        if (pagoRealizado) return;
        precioTotal += entrada.getPrecio() + entrada.getPrecio()*IVA;
        this.listaEntradas.add(entrada);
    }

    public ArrayList<Entrada> getListaEntradas() {
        return listaEntradas;
    }

    public void deleteEntrada(Entrada entrada){
        if (pagoRealizado) return;
        precioTotal -= entrada.getPrecio();
        this.listaEntradas.remove(entrada);
    }
    
    public Factura pagar(){
        if (pagoRealizado) return null;
        Pago cuentaBancaria = usuario.getCuentaBancaria();
        cuentaBancaria.realizarCobro(getPrecioTotal());
        factura = new Factura(getPrecioTotal(), usuario, cuentaBancaria);
        pagoRealizado = true;
        return factura;
    }
}
