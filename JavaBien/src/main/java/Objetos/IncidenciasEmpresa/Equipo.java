package Objetos.IncidenciasEmpresa;

public class Equipo {

    private String nombre;
    private String direccionMac;
    private String so;
    private int numIncidentes;
    private Usuario usuario;

    public Equipo(String direccionMac, String nombre, int numIncidentes, String so, Usuario usuario) {
        this.direccionMac = direccionMac;
        this.nombre = nombre;
        this.numIncidentes = numIncidentes;
        this.so = so;
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + " - " + direccionMac + " : " + numIncidentes + " - Usuario: " + (usuario != null ? usuario.getNombre() : "Sin usuario");
    }
}