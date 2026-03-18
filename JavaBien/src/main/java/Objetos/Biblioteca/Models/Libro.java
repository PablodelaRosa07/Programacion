package Objetos.Biblioteca.Models;

public class Libro extends Recurso {
    private String autor;
    private String editorial;
    private String genero;

    public Libro(String id, String ubicacion, int unidadesTotales, String autor, String editorial, String genero) {
        super(id, ubicacion, unidadesTotales);
        this.autor = autor;
        this.editorial = editorial;
        this.genero = genero;
    }

    @Override
    public int getDevuelveDiasPrestamo() { return 21; }
}
