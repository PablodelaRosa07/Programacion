package BoletinOrdenaciones.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class RepositorioAnimal {

    private String nombre;
    private String lugar;
    private double presupuestoAnual;
    private List<Animal> listaAnimales;

    public RepositorioAnimal(String lugar, String nombre, double presupuestoAnual) {
        this.listaAnimales = new ArrayList<>();
        this.lugar = lugar;
        this.nombre = nombre;
        this.presupuestoAnual = presupuestoAnual;
    }

    public List<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(List<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPresupuestoAnual() {
        return presupuestoAnual;
    }

    public void setPresupuestoAnual(double presupuestoAnual) {
        this.presupuestoAnual = presupuestoAnual;
    }






    @Override
    public String toString() {
        return "RepositorioAnimal{" +
                "listaAnimales=" + listaAnimales +
                ", nombre='" + nombre + '\'' +
                ", lugar='" + lugar + '\'' +
                ", presupuestoAnual=" + presupuestoAnual +
                '}';
    }
}
