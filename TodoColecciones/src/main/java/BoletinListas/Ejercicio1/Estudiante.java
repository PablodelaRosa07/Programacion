package BoletinListas.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    private String nombre;
    private int identificacion;
    private List<Double> listaNotas;

    public Estudiante(int identificacion, String nombre) {
        this.identificacion = identificacion;
        this.listaNotas = new ArrayList<>();
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setListaNotas(List<Double> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void agregarNota(double nota) {
        this.listaNotas.add(nota);
    }

    public List<Double> getListaNotas() {
        return this.listaNotas;
    }


    @Override
    public String toString() {
        return "Estudiante{" +
                "identificacion=" + identificacion +
                ", nombre='" + nombre + '\'' +
                ", listaNotas=" + listaNotas +
                '}';
    }
}
