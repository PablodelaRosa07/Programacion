package BoletinListas.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    static void main(String[] args) {
        Repositorio repositorio = new Repositorio();

        Instituto instituto = new Instituto();
        Grupo grupo1 = new Grupo("Grupo DAM", "1234ABC", 1, "Javi");
        Estudiante estudiante1 = new Estudiante(1234, "Pablo");
        Estudiante estudiante2 = new Estudiante(5678, "Javi");
        estudiante1.agregarNota(9);
        estudiante1.agregarNota(7);
        estudiante2.agregarNota(2);
        estudiante2.agregarNota(4);

        repositorio.agregarEstudiante(estudiante1, grupo1);
        repositorio.agregarEstudiante(estudiante2, grupo1);
        repositorio.agregarGrupo(grupo1, instituto);
        repositorio.mostrarListaEstudiantes(instituto);
        repositorio.mostrarInfoGrupo(instituto);
        repositorio.mostrarMedia(grupo1);
        repositorio.calcularMediaGrupo(instituto);


    }

    public List<Estudiante> agregarEstudiante(Estudiante estudiante, Grupo grupo){
        System.out.println("AGREGANDO ESTUDIANTE");
        List<Estudiante> estudiantes = grupo.getListaEstudiantes();

        if (estudiante != null && !estudiantes.contains(estudiante)){
            estudiantes.add(estudiante);
        }
        else {
            System.out.println("No se ha podido agregar porque o es nulo, o ya está en la lista");
        }
        return estudiantes;
    }

    public List<Grupo> agregarGrupo(Grupo grupo, Instituto instituto){
        System.out.println("AGREGANDO GRUPOS");
        List<Grupo> grupos = instituto.getGrupos();

        if (grupo != null && !grupos.contains(grupo)){
            grupos.add(grupo);
        }
        else {
            System.out.println("No se ha podido agregar porque o es nulo, o ya está en la lista");
        }
        return grupos;
    }

    public void mostrarListaEstudiantes(Instituto instituto){
        System.out.println("MOSTRANDO LISTAS DE ESTUDIANTES");
        List<Grupo> grupos = instituto.getGrupos();

        if (grupos.isEmpty()){
            System.out.println("Está vacío");
        }

        else {
            for (Grupo grupo : grupos){
                System.out.println("Grupo: " +grupo);

                List<Estudiante> listaEstudiantes = grupo.getListaEstudiantes();

                if (listaEstudiantes.isEmpty()){
                    System.out.println("Está vacío");
                }

                else {
                    for (Estudiante estudiante : listaEstudiantes){
                        System.out.println("Estudiante: " +estudiante);

                        List<Double> notas = estudiante.getListaNotas();

                        if (notas.isEmpty()){
                            System.out.println("Está vacío");
                        }
                    }
                }
            }
        }
    }

    public void mostrarInfoGrupo(Instituto instituto){
        System.out.println("MOSTRANDO INFO DE CADA GRUPO");
        for (Grupo mostrar : instituto.getGrupos()){
            System.out.println("Descripcion: " +mostrar.getDescription());
            System.out.println("Tutor: " +mostrar.getTutor());
            System.out.println("NumEstudiantes: " +mostrar.getListaEstudiantes().contains(mostrar.getListaEstudiantes()));
        }
    }

    public void mostrarMedia(Grupo grupo){
        System.out.println("MOSTRANDO MEDIA DE ESTUDIANTE");
        int contador = 0;
        double totalNotas = 0;
        for (Estudiante e1 : grupo.getListaEstudiantes()){
            for (int i = 0; i < e1.getListaNotas().size(); i++) {
                totalNotas = totalNotas+e1.getListaNotas().get(i);
                contador = contador+1;
            }
            if (!grupo.getListaEstudiantes().contains(e1)){
                throw new Exception("El estudiante no pertenece al grupo");
            }
            totalNotas = totalNotas/contador;
            System.out.println("Nota media de " +e1.getIdentificacion()+ " es: " +totalNotas);

        }

    }

    public void calcularMediaGrupo(Instituto instituto){
        System.out.println("MOSTRANDO MEDIA DE GRUPO");
        int contador = 0;
        double totalNotas = 0;
        for (Grupo grupo : instituto.getGrupos()){
            for (Estudiante e1 : grupo.getListaEstudiantes()){
                for (int i = 0; i < e1.getListaNotas().size(); i++) {
                    totalNotas = totalNotas+e1.getListaNotas().get(i);
                    contador = contador+1;
                }
        }
            totalNotas = totalNotas/contador;

            System.out.println("Nota media de " +grupo.getIdentificador()+ " es: " +totalNotas);
        }
    }
}
