package ticket4u;

public class TarjetaCredito implements Pago{
    private final int idTarjeta;
    private final int codigoSeguridad;

    public TarjetaCredito(int idTarjeta, int codigoSeguridad) {
        this.idTarjeta = idTarjeta;
        this.codigoSeguridad = codigoSeguridad;
    }

    public void realizarCobro(double precio){
        
    }
}
