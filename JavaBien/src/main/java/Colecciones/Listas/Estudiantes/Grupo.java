package Colecciones.Listas.Estudiantes;

import java.util.ArrayList;
import java.util.List;

class Grupo {
    String id;
    String descripcion;
    String tutor;
    String aula;
    List<Estudiante> estudiantes = new ArrayList<>();
    HorarioDia[] horario = new HorarioDia[5];

    public Grupo(String id, String descripcion, String tutor, String aula) {
        this.id = id;
        this.descripcion = descripcion;
        this.tutor = tutor;
        this.aula = aula;
    }
}
