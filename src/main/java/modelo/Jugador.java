package modelo;

public class Jugador {
    private String nombre;
    private String rut;
    private String contraseña;

    public Jugador(String nombre, String rut, String contraseña) {
        this.nombre = nombre;
        this.rut = rut;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String toString() {
        return "modelo.Jugador{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}
