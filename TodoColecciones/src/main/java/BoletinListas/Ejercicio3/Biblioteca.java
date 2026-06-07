package BoletinListas.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Libro> listaLibros;

    public Biblioteca() {
        this.listaLibros = new ArrayList<>();
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "listaLibros=" + listaLibros +
                '}';
    }
}
