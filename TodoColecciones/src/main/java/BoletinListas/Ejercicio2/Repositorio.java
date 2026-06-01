package BoletinListas.Ejercicio2;

import BoletinListas.Ejercicio1.Estudiante;

import java.util.List;

public class Repositorio {
    static void main(String[] args) {
        Repositorio repositorio = new Repositorio();

        Alumno alumno1 = new Alumno("12345678A", "Pablo");
        Alumno alumno2 = new Alumno("87654321B", "Javi");
        Alumno alumno3 = new Alumno("11223344C", "Elena");
        Alumno alumno4 = new Alumno("11112222D", "Pepe");

        Equipo equipo = new Equipo("Real Betis");
        Equipo equipo2 = new Equipo("Sevilla Futbol Club");
        Equipo equipo3 = new Equipo("Equipo Neutro");

        repositorio.añadirAlumno(alumno1, equipo);
        repositorio.añadirAlumno(alumno2, equipo);
        repositorio.añadirAlumno(alumno4, equipo);
        repositorio.añadirAlumno(alumno4, equipo2);
        repositorio.añadirAlumno(alumno3, equipo2);

        repositorio.borrarAlumno(alumno2, equipo);

        repositorio.estaEnEquipo(alumno1, equipo);
        repositorio.estaEnEquipo(alumno3, equipo);

        repositorio.mostrarPantalla(equipo);

        repositorio.juntarEquipos(equipo3, equipo);
        repositorio.juntarEquipos(equipo3, equipo2);

        repositorio.interseccionEquipos(equipo, equipo2, equipo3, alumno1);
        repositorio.interseccionEquipos(equipo, equipo2, equipo3, alumno2);
        repositorio.interseccionEquipos(equipo, equipo2, equipo3, alumno3);
        repositorio.interseccionEquipos(equipo, equipo2, equipo3, alumno4);

    }

    public void añadirAlumno(Alumno alumno, Equipo equipo){
        System.out.println("AÑADIENDO ALUMNO");
        if (equipo.getGrupoAlumnos().contains(alumno)){
            throw new DeportivosException("El alumno ya está en el grupo");
        }
        else {
            equipo.getGrupoAlumnos().add(alumno);
            System.out.println(alumno+ " añadido");
        }
    }

   public void borrarAlumno(Alumno alumno, Equipo equipo){
       System.out.println("BORRANDO ALUMNO");
       if (!equipo.getGrupoAlumnos().contains(alumno)){
           throw new DeportivosException("El alumno no está en el grupo, por tanto no se puede eliminar");
       }
       else {
           equipo.getGrupoAlumnos().remove(alumno);
           System.out.println(alumno+ " borrado");
       }
   }

   public void estaEnEquipo(Alumno alumno, Equipo equipo){
       System.out.println("COMPROBANDO SI ESTÁ EL ALUMNO EN EL EQUIPO");
        boolean estado = true;
        for (int i = 0; i < equipo.getGrupoAlumnos().size(); i++) {
            if (alumno.equals(equipo.getGrupoAlumnos().get(i))){
                estado = true;
            }
            else {
                estado = false;
            }
        }
        System.out.println(alumno+ "Pertenece al equipo: " +estado);
    }

    public void mostrarPantalla(Equipo equipo){
        System.out.println("MOSTRANDO LSITA DE PERSONAS DEL GRUPO");
        System.out.println(equipo.getGrupoAlumnos());
    }

    public void juntarEquipos(Equipo equipo, Equipo equipo2){
        System.out.println("JUNTANDO EQUIPOS");
        equipo.getGrupoAlumnos().addAll(equipo2.getGrupoAlumnos());
        System.out.println("Grupo añadido");
    }

    public void interseccionEquipos(Equipo equipo, Equipo equipo2, Equipo equipo3, Alumno alumno){
        System.out.println("REVISANDO ALUMNO EN LOS 2 EQUIPOS");
        if (equipo.getGrupoAlumnos().contains(alumno) && equipo2.getGrupoAlumnos().contains(alumno)){
            equipo3.getGrupoAlumnos().add(alumno);
            System.out.println(alumno+ " añadido");
        }
        else {
            System.out.println(alumno+ " no añadido");
        }
    }
}
