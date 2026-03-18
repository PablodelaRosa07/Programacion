package Colecciones.Listas.Biblioteca;

public class Libro {

    private String titulo;
    private String autor;
    private String genero;
    private int anyoPublicacion;
    private Estado estado;

    public Libro(int anyoPublicacion, String autor, String genero, String titulo) {
        this.anyoPublicacion = anyoPublicacion;
        this.autor = autor;
        this.genero = genero;
        this.titulo = titulo;
        this.estado = Estado.LIBRE;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public void setAnyoPublicacion(int anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "anyoPublicacion=" + anyoPublicacion +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", estado=" + estado +
                '}';
    }
}
