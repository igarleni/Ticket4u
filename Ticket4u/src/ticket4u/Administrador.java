package ticket4u;

import java.util.Date;

public class Administrador extends Usuario {

    public Administrador(String nombre, String apellidos, String calle, String ciudad, String pais, Date fechaNacimiento, int telefono, String usuario, String pass, String email, Pago cuentaBancaria) {
        super(nombre, apellidos, calle, ciudad, pais, fechaNacimiento, telefono, usuario, pass, email, cuentaBancaria);
    }
    
}
