package Objetos.Biblioteca.Models;

public class Multimedia extends Recurso {
    private String nombre;
    private String genero;
    private Tipo tipo;
    private int valorEspecifico; // Duración o Fases

    public Multimedia(String id, String ubicacion, int unidadesTotales, String genero, String nombre, Tipo tipo, int valorEspecifico) {
        super(id, ubicacion, unidadesTotales);
        this.genero = genero;
        this.nombre = nombre;
        this.tipo = tipo;
        this.valorEspecifico = valorEspecifico;
    }

    @Override
    public int getDevuelveDiasPrestamo() {
        return 10;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getValorEspecifico() {
        return valorEspecifico;
    }

    public void setValorEspecifico(int valorEspecifico) {
        this.valorEspecifico = valorEspecifico;
    }

    public String getNombre() {
        return nombre;
    }
}
