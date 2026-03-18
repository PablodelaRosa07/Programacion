package Colecciones.Listas.Biblioteca;

import java.time.LocalDate;
import java.util.Objects;

public class Prestamo {
    private static int contadorId = 1;
    private int id;
    private Libro libro;
    private String nombreUsuario;
    private LocalDate fechaPrestamo;

    public Prestamo(Libro libro, String nombreUsuario) {
        this.id = contadorId++;
        this.libro = libro;
        this.nombreUsuario = nombreUsuario;
        this.fechaPrestamo = LocalDate.now();
    }

    public Libro getLibro() { return libro; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prestamo prestamo = (Prestamo) o;
        return Objects.equals(libro.getTitulo(), prestamo.libro.getTitulo()) &&
                Objects.equals(libro.getAutor(), prestamo.libro.getAutor()) &&
                Objects.equals(nombreUsuario, prestamo.nombreUsuario) &&
                Objects.equals(fechaPrestamo, prestamo.fechaPrestamo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libro.getTitulo(), libro.getAutor(), nombreUsuario, fechaPrestamo);
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "fechaPrestamo=" + fechaPrestamo +
                ", id=" + id +
                ", libro=" + libro +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                '}';
    }
}