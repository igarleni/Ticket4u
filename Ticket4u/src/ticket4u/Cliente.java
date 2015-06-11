package ticket4u;

import java.util.Date;

public class Cliente extends Usuario{

    public Cliente(String nombre, String apellidos, String calle, String ciudad, String pais, Date fechaNacimiento, int telefono, String usuario, String pass, String email, Pago cuentaBancaria) {
        super(nombre, apellidos, calle, ciudad, pais, fechaNacimiento, telefono, usuario, pass, email, cuentaBancaria);
    }
    
}
