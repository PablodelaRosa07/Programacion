package BoletinOrdenaciones.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contacto> listaContactos;

    public Agenda() {
        this.listaContactos = new ArrayList<>();
    }

    public List<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(List<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "listaContactos=" + listaContactos +
                '}';
    }
}
