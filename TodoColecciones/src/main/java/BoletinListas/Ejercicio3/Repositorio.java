package BoletinListas.Ejercicio3;

public class Repositorio {
    static void main(String[] args) {
        Repositorio repositorio = new Repositorio();

        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("La casita de Pablo", "Pablo", "Terror", 2025, Estado.LIBRE);


        repositorio.agregarLibro(libro1, biblioteca);
    }

    public void agregarLibro(Libro libro, Biblioteca biblioteca){
        System.out.println("AGREGANDO LIBRO");
        if (!biblioteca.getListaLibros().contains(libro)){
            biblioteca.getListaLibros().add(libro);
            System.out.println("Libro agregado");
        }
        else {
            System.out.println("No se ha agregado, ya estaba en la lista.");
        }
    }

    public void prestarLibro(Libro libro){
        System.out.println("PRESTANDO LIBRO");
        if (libro.getEstado().equals(Estado.LIBRE)){
            libro.setEstado(Estado.PRESTADO);
            System.out.println("Libro prestado");
        }
        else {
            System.out.println("Error. El libro ya está prestado");
        }
    }


}
