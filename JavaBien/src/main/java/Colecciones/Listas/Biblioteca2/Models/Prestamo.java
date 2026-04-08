package Colecciones.Listas.Biblioteca2.Models;

import java.time.LocalDate;
import java.util.Objects;

public class Prestamo {

    private int id;
    private Libro libro;
    private String nombreUsuario; //dni
    private LocalDate fechaPrestamo;

    public Prestamo(int id, Libro libro, String nombreUsuario, LocalDate fechaPrestamo) {
        this.id = id;
        this.libro = libro;
        this.nombreUsuario = nombreUsuario;
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Prestamo prestamo = (Prestamo) o;
        return Objects.equals(libro, prestamo.libro) && Objects.equals(nombreUsuario, prestamo.nombreUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libro, nombreUsuario);
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "id='" + id + '\'' +
                ", libro=" + libro +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", fechaPrestamo=" + fechaPrestamo +
                '}';
    }
}
