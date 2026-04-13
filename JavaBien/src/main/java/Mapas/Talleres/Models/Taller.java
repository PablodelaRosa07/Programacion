package Mapas.Talleres.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Taller {

    private String id;
    private String nombre;
    private int edadMinima;
    private int aforoMax;
    private List<Alumno> listaAlumnosInscritos;

    public Taller(String id, String nombre, int edadMinima, int aforoMax, List<Alumno> listaAlumnosInscritos) {
        this.id = id;
        this.nombre = nombre;
        this.edadMinima = edadMinima;
        this.aforoMax = aforoMax;
        this.listaAlumnosInscritos = listaAlumnosInscritos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getAforoMax() {
        return aforoMax;
    }

    public void setAforoMax(int aforoMax) {
        this.aforoMax = aforoMax;
    }

    public List<Alumno> getListaAlumnosInscritos() {
        return listaAlumnosInscritos;
    }

    public void setListaAlumnosInscritos(List<Alumno> listaAlumnosInscritos) {
        this.listaAlumnosInscritos = listaAlumnosInscritos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Taller taller = (Taller) o;
        return Objects.equals(id, taller.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
