package BoletinListas.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

    private String identificador;
    private String description;
    private List<Estudiante> listaEstudiantes;
    private String tutor;
    private int numAula;
    private List<Horario> listaHorario;

    public Grupo(String description, String identificador, int numAula, String tutor) {
        this.description = description;
        this.identificador = identificador;
        this.listaEstudiantes = new ArrayList<>();
        this.listaHorario = new ArrayList<>();
        this.numAula = numAula;
        this.tutor = tutor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public List<Horario> getListaHorario() {
        return listaHorario;
    }

    public void setListaHorario(List<Horario> listaHorario) {
        this.listaHorario = listaHorario;
    }

    public int getNumAula() {
        return numAula;
    }

    public void setNumAula(int numAula) {
        this.numAula = numAula;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }







    @Override
    public String toString() {
        return "Grupo{" +
                "description='" + description + '\'' +
                ", identificador='" + identificador + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                ", tutor='" + tutor + '\'' +
                ", numAula=" + numAula +
                ", listaHorario=" + listaHorario +
                '}';
    }
}
