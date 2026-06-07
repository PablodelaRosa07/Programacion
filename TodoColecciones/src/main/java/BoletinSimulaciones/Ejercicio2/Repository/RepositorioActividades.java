package BoletinSimulaciones.Ejercicio2.Repository;

import BoletinSimulaciones.Ejercicio2.Models.Actividad;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepositorioActividades {

    private Set<Actividad> actividades;

    /* * JUSTIFICACIÓN DE LA ESTRUCTURA DE DATOS:
     * Se ha elegido 'Set' (en concreto la implementación 'HashSet') porque el requerimiento
     * principal es almacenar las actividades "sin repeticiones".
     * La interfaz Set garantiza por definición que no existan elementos duplicados. */

    public RepositorioActividades() {
        this.actividades = new HashSet<>();
    }

    public Set<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(Set<Actividad> actividades) {
        this.actividades = actividades;
    }

    @Override
    public String toString() {
        return "RepositorioActividades{" +
                "actividades=" + actividades +
                '}';
    }
}
