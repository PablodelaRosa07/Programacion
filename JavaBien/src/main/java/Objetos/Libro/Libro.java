package Objetos.Libro;

public class Libro {

    String isbn;
    String titulo;
    String autor;
    int numeroPaginas;

    public Libro(String autor, String isbn, int numeroPaginas, String titulo) {
        this.autor = autor;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
