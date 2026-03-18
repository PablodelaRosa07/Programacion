package Colecciones.Listas.Biblioteca;

import java.util.LinkedHashSet;
import java.util.Set;

public class RepositorioPrestamos {
    private Set<Prestamo> historialPrestamos;

    public RepositorioPrestamos() {
        this.historialPrestamos = new LinkedHashSet<>();
    }

    public void agregarPrestamo(Libro libro, String dni) {
        try {
            if (libro.getEstado() == Estado.PRESTADO) {
                throw new BibliotecaException("No es posible realizar el préstamo de un libro que ya está prestado.");
            }

            Prestamo nuevo = new Prestamo(libro, dni);
            if (historialPrestamos.add(nuevo)) {
                libro.setEstado(Estado.PRESTADO);
                System.out.println("Préstamo registrado con éxito.");
            } else {
                System.out.println("Este préstamo ya consta como duplicado en el sistema.");
            }

        } catch (BibliotecaException e) {
            System.out.println(e.getMessage());
        }
    }

    public void devolverLibro(Libro libro) {
        try {
            if (libro.getEstado() == Estado.LIBRE) {
                throw new BibliotecaException("El libro ya está libre en la biblioteca.");
            }
            libro.setEstado(Estado.LIBRE);
            System.out.println("Libro devuelto y estado actualizado a LIBRE.");
        } catch (BibliotecaException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarHistorialOrdenado() {
        if (historialPrestamos.isEmpty()) {
            System.out.println("No hay registros de préstamos.");
        } else {
            historialPrestamos.forEach(System.out::println);
        }
    }

    public void buscarPorTituloYAutor(String titulo, String autor) {
        System.out.println("Historial para: " + titulo + " de " + autor);
    }
}