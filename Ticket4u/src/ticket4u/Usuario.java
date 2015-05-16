package ticket4u;

import java.util.Date;

public class Usuario {
    private final String nombre;
    private final String apellidos;
    private final String calle;
    private final String ciudad;
    private final String pais;
    private final Date fechaNacimiento;
    private final int telefono;
    private final String usuario;
    private final String pass;
    private final String email;
    private final String cuentaBancaria;

    public Usuario(String nombre, String apellidos, String calle, String ciudad, String pais, Date fechaNacimiento, int telefono, String usuario, String pass, String email, String cuentaBancaria) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.calle = calle;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.usuario = usuario;
        this.pass = pass;
        this.email = email;
        this.cuentaBancaria = cuentaBancaria;
    }


    public void modificarDatosCuenta(){

    }
    public void modificarDatosPersonales(){

    }
}
