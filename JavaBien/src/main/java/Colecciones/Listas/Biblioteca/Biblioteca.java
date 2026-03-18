package Colecciones.Listas.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Libro> listaLibros;

    public Biblioteca() {
        this.listaLibros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
        System.out.println("Libro añadido.");
    }

    public void prestarEjemplar(String titulo) throws BibliotecaException {
        Libro libro = buscarLibros(titulo);

        if (libro == null) {
            throw new BibliotecaException("El libro " + titulo + " no existe en el inventario.");
        }
        if (libro.getEstado() == Estado.PRESTADO) {
            throw new BibliotecaException("Operación inválida, el libro ya está prestado.");
        }

        libro.setEstado(Estado.PRESTADO);
        System.out.println("El libro ha sido prestado.");
    }

    public void devolverEjemplar(String titulo) throws BibliotecaException {
        Libro libro = buscarLibros(titulo);

        if (libro == null) {
            throw new BibliotecaException("El libro " + titulo + " no pertenece a esta biblioteca.");
        }
        if (libro.getEstado() == Estado.LIBRE) {
            throw new BibliotecaException("El libro ya está libre en la biblioteca.");
        }

        libro.setEstado(Estado.LIBRE);
        System.out.println("El libro ha sido devuelto.");
    }

    public void mostrarInventario() {
        if (listaLibros.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("INVENTARIO COMPLETO");
            listaLibros.forEach(System.out::println);
        }
    }

    public Libro buscarLibros(String criterio) {
        System.out.println("Resultados para: " + criterio);
        boolean encontrado = false;
        for (Libro l : listaLibros) {
            if (l.getTitulo().equalsIgnoreCase(criterio) || l.getAutor().equalsIgnoreCase(criterio)) {
                System.out.println(l);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("No se encontraron coincidencias.");
        return null;
    }

}