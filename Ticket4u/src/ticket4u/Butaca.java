package ticket4u;

public class Butaca {

    private final int numeroButaca;
    private  boolean estadoButaca;
    private  final int idEvento;
    public Butaca(int numeroButaca,boolean estadoButaca, int idEvento){
        this.numeroButaca=numeroButaca;
        this.estadoButaca = estadoButaca;
        this.idEvento=idEvento;
    }
    public void cambiarEstado(boolean estadoButaca){
        this.estadoButaca=estadoButaca;


    }


}

