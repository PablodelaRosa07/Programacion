package Colecciones.Listas.Biblioteca2.Models;

import java.util.Objects;

public class Libro {

    private String nombreLibro;
    private String autor;
    private Estado estado;

    public Libro(String nombreLibro, String autor, Estado estado) {
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.estado = estado;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(nombreLibro, libro.nombreLibro) && Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreLibro, autor);
    }


}
