package Colecciones.Listas.EquipoDeportivo;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreEquipo;
    private List<Alumno> listaAlumnos;

    public Equipo(String nombreEquipo, List<Alumno> listaAlumnos) {
        this.nombreEquipo = nombreEquipo;
        this.listaAlumnos = new ArrayList<>();
    }


    public void añadirAlumno(Alumno alumno) throws DeportivosException{
        if (listaAlumnos.contains(alumno)){
            throw new DeportivosException("El alumno ya está en la lista");
        }
        else {
            listaAlumnos.add(alumno);
        }
    }


    public void borrarAlumno(Alumno alumno) throws DeportivosException{
        if (!listaAlumnos.contains(alumno)){
            throw new DeportivosException("El alumno no está en la lista");
        }
        else {
            listaAlumnos.remove(alumno);
        }
    }


    public Alumno buscarAlumno(Alumno alumno) throws DeportivosException{
        if (listaAlumnos.contains(alumno)){
            throw new DeportivosException("El alumno ha sido encontrado");
        }
        else {
            alumno = null;
        }
        return alumno;
    }


    public void mostrarLista(){
        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println(listaAlumnos.get(i));
        }
    }


    public Equipo juntaEquipo(Equipo e2){
        Equipo e1 = new Equipo(this.nombreEquipo, this.listaAlumnos);
        e1.listaAlumnos.addAll(e2.listaAlumnos);
        return e1;
    }


    public Equipo juntaEquipoAmbos(Equipo e2){
        Equipo e1 = new Equipo(this.nombreEquipo, this.listaAlumnos);
        e1.listaAlumnos.addAll(e2.listaAlumnos);
        return e1;
    }


    public Equipo interseccion(Equipo otro) {
        Equipo resultado = new Equipo(this.nombreEquipo, this.listaAlumnos);
        for (Alumno a : this.listaAlumnos) {
            if (otro.listaAlumnos.contains(a)) {
                resultado.listaAlumnos.add(a);
            }
        }
        return resultado;
    }
}

