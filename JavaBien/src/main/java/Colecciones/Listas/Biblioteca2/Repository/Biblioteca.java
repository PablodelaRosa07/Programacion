package Colecciones.Listas.Biblioteca2.Repository;

import Colecciones.Listas.Biblioteca2.Exception.MiExcepcion;
import Colecciones.Listas.Biblioteca2.Models.Estado;
import Colecciones.Listas.Biblioteca2.Models.Libro;
import Colecciones.Listas.Biblioteca2.Models.Prestamo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    List<Prestamo> listaPrestamos = new ArrayList<>();
    List<Libro> listaLibros = new ArrayList<>();

    public void prestarLibro(Libro libro, Prestamo prestamo){
        if (libro.getEstado().equals(Estado.LIBRE)){
            libro.setEstado(Estado.PRESTADO);
            listaPrestamos.add(prestamo);
        }
        else {
            throw new MiExcepcion("No se ha podido realizar el prestamo");
        }
    }

    public void devolverLibro(Libro libro){
        if (libro.getEstado().equals(Estado.PRESTADO) && listaPrestamos.contains(libro)){
            libro.setEstado(Estado.LIBRE);
        }
        else {
            throw new MiExcepcion("No se ha podido realizar la devolución");
        }
    }

    public void mostrarListaPrestamos(){
        for (int i = 0; i < listaPrestamos.size(); i++) {
            System.out.println(listaPrestamos.get(i));
        }
    }

    public void filtrarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Di el autor: ");
        String autor = sc.nextLine();
        System.out.println("Di el título: ");
        String titulo = sc.nextLine();

        for (Libro libro : listaLibros){
            if (libro.getAutor().equals(autor) && libro.getNombreLibro().equals(titulo)){
                System.out.println(libro);
            }
        }
    }




}


