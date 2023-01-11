package Entidades;

import jakarta.persistence.*;

@Entity // Esto quiere decir que Java esta asumiendo que esta clase forma parte de JPA
@Table(name = "usuarios")

public class Usuario {

    // La tabla de BBDD "usuarios" pasa a ser unobjeto de la clase Usuario en nuestro codigo. A esto se le llama "Mapear". De esta forma conectamos la BBDD.

    @Id  // Como este id es primary key tengo q poner @id que indica que el campo que viene a continuacion es un primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Esto es para generar el valor automaticamente mediante la  estrategia llamda "IDENTITY" que es incrementar de uno en uno

    // Mapeo las propiedades de la clase con los campos de la tabla:
    private Long id;
    private String usuario;
    private String nombre;
    private String apellidos;
    private String clave;

    public Long getId() {
        return id;
    }

    public Usuario() {
    }

    public Usuario(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "id= " + id +
                ", Nombre= " + nombre + " " +
                ", Apellidos='" + apellidos + " " +
                ", Usuario='" + usuario + " " +
                ", Clave='" + clave  + " ";
    }
}
