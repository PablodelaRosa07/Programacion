package BoletinOrdenaciones.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class RepoTarea {

    private List<Tarea> listaTareas;

    public RepoTarea() {
        this.listaTareas = new ArrayList<>();
    }

    public List<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(List<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    @Override
    public String toString() {
        return "RepoTarea{" +
                "listaTareas=" + listaTareas +
                '}';
    }
}
