package Objetos.Anime;

public class SerieAnime {
    private String nombre;
    private int numTemporada;
    private int numCapitulos;
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCapitulos() {
        return numCapitulos;
    }

    public void setNumCapitulos(int numCapitulos) {
        this.numCapitulos = numCapitulos;
    }

    public int getNumTemporada() {
        return numTemporada;
    }

    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }

    public SerieAnime(String autor, String nombre, int numCapitulos, int numTemporada) {
        this.autor = autor;
        this.nombre = nombre;
        this.numCapitulos = numCapitulos;
        this.numTemporada = numTemporada;
    }
}
