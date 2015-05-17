package ticket4u;

import java.util.Date;

public class Usuario {
    private static int idSeed = 0;
    private int idUsuario;
    private String nombre;
    private String apellidos;
    private String calle;
    private String ciudad;
    private String pais;
    private Date fechaNacimiento;
    private int telefono;
    private String usuario;
    private String pass;
    private String email;
    private CuentaBancaria cuentaBancaria;

    public Usuario(String nombre, String apellidos, String calle, String ciudad, String pais, Date fechaNacimiento, int telefono, String usuario, String pass, String email, CuentaBancaria cuentaBancaria) {
        idUsuario = idSeed;
        idSeed++;
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

    public void modificarCuenta(String nombre, String apellidos, String calle, String ciudad, String pais, Date fechaNacimiento, int telefono, String usuario, String pass, String email, CuentaBancaria cuentaBancaria){
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
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }
    
}
