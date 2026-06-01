package BoletinOrdenaciones.Ejercicio3;

import java.util.Collections;

public class Repositorio {
    static void main(String[] args) {
        Repositorio repositorio = new Repositorio();
        RepoTarea repoTarea = new RepoTarea();

        Tarea tarea1 = new Tarea(123, "Limpieza", "Limpiar baño", 3);
        Tarea tarea2 = new Tarea(456, "Jugar", "Jugar al fifa", 1);
        Tarea tarea3 = new Tarea(789, "Cocinar", "Cocinar papas", 2);

        repositorio.agregarTarea(tarea1, repoTarea);
        repositorio.agregarTarea(tarea2, repoTarea);
        repositorio.agregarTarea(tarea3, repoTarea);

        repositorio.eliminarTarea(tarea3, repoTarea);

        repositorio.mostrarLista(repoTarea);

        repositorio.mostrarMax(repoTarea);

    }

    public void agregarTarea(Tarea tarea, RepoTarea repoTarea){
        System.out.println("AÑADIENDO TAREA");
        repoTarea.getListaTareas().add(tarea);
        System.out.println("Tarea " +tarea.getCategoria()+ " añadida");

        Collections.sort(repoTarea.getListaTareas()); //Para ordenar con arraylist
    }

    public void eliminarTarea(Tarea tarea, RepoTarea repoTarea){
        System.out.println("ELIMINANDO TAREA");
        repoTarea.getListaTareas().remove(tarea);
        System.out.println("Tarea " +tarea.getCategoria()+ " eliminada");
    }

    public void mostrarLista(RepoTarea repoTarea){
        System.out.println("MOSTRANDO LISTA");
        System.out.println(repoTarea.getListaTareas());
    }

    public void mostrarMax(RepoTarea repoTarea){
        System.out.println("MOSTRANDO TAREA MAS PRIORITARIA");
        System.out.println(repoTarea.getListaTareas().get(0));
    }
}
