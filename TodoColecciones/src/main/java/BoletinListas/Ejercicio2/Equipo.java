package BoletinListas.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {

    private String nombreEquipo;
    private List<Alumno> grupoAlumnos;

    public Equipo(String nombreEquipo) {
        this.grupoAlumnos = new ArrayList<>();
        this.nombreEquipo = nombreEquipo;
    }

    public List<Alumno> getGrupoAlumnos() {
        return grupoAlumnos;
    }

    public void setGrupoAlumnos(List<Alumno> grupoAlumnos) {
        this.grupoAlumnos = grupoAlumnos;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }






    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return Objects.equals(nombreEquipo, equipo.nombreEquipo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombreEquipo);
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "grupoAlumnos=" + grupoAlumnos +
                ", nombreEquipo='" + nombreEquipo + '\'' +
                '}';
    }
}
