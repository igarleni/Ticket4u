package ticket4u;

public class CuentaPayPal implements CuentaBancaria{
    private final int idCuenta;

    public CuentaPayPal(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public void realizarCobro(double precio) {
        
    }
}

