package ticket4u;

import java.util.Date;

public class Entrada {
    private static int idSeed = 0;
    private final int idEntrada;

    private final Butaca butaca;
    private final double precio;
    
    public Entrada(Butaca butaca, double precio) {
        idEntrada = idSeed;
        idSeed++;
        this.butaca = butaca;
        this.precio=precio;
    }

    public int getIdEntrada() {
        return idEntrada;
    }
    
    public Butaca getButaca() {
        return butaca;
    }

    public double getPrecio() {
        return precio;
    }

}
