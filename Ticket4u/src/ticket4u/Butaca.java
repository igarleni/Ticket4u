package ticket4u;

public class Butaca {
    private final int idButaca;
    private  boolean estadoButaca;
    private  final Audicion audicion;

    public Butaca(int idButaca, Audicion audicion) {
        this.idButaca = idButaca;
        this.audicion = audicion;
        estadoButaca = true;
    }
    
    
    
    public void setEstadoButaca(boolean estadoButaca) {
        this.estadoButaca = estadoButaca;
    }

    public boolean getEstadoButaca() {
        return estadoButaca;
    }

    public int getIdButaca() {
        return idButaca;
    }

    public Audicion getAudicion() {
        return audicion;
    }

}

