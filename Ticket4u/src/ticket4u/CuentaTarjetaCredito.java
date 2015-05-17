package ticket4u;

public class CuentaTarjetaCredito implements CuentaBancaria{
    private final int idTarjeta;
    private final int codigoSeguridad;

    public CuentaTarjetaCredito(int idTarjeta, int codigoSeguridad) {
        this.idTarjeta = idTarjeta;
        this.codigoSeguridad = codigoSeguridad;
    }

    public void realizarCobro(double precio){
        
    }
}
