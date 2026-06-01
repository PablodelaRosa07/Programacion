package BoletinOrdenaciones.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Tarea implements Comparable<Tarea>{

    private int id;
    private String categoria;
    private String descripcion;
    private int prioridad;

    public Tarea(int id, String categoria, String descripcion, int prioridad) {
        this.id = id;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }



    @Override
    public int compareTo(Tarea otraTarea) {
        int resultado = Integer.compare(this.prioridad, otraTarea.getPrioridad());
        return resultado;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", categoria='" + categoria + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }


}
