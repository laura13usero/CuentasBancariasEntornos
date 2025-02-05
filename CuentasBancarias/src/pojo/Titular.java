package pojo;

public class Titular {
    private String nombre;
    private String apellidos;
    private String dni;

    // Constructor
    public Titular(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    // Métodos
    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Titular: " + getNombreCompleto() + ", DNI: " + dni;
    }
}
