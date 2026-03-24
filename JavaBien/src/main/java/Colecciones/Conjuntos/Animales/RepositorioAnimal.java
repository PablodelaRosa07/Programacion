package Colecciones.Conjuntos.Animales;

import java.util.TreeSet;

public class RepositorioAnimal {

    private String nombre;
    private String lugar;
    private double presupuestoAnual;
    private TreeSet<Animal> animales;

    public RepositorioAnimal(String nombre, String lugar, double presupuestoAnual) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.presupuestoAnual = presupuestoAnual;
        this.animales = new TreeSet<>();
    }

    public boolean agregarAnimal(Animal a) {
        return animales.add(a); // TreeSet evita duplicados y mantiene orden
    }

    public void mostrarAnimales() {
        for (Animal a : animales) {
            System.out.println(a);
        }
    }

    public boolean modificarNombreAnimal(int id, String nuevoNombre) {
        for (Animal a : animales) {
            if (a.getId() == id) {
                animales.remove(a);
                Animal modificado = new Animal(id, nuevoNombre, a.especie, a.edad,
                        a.getClasificacionComida(), a.getFechaNacimiento(), a.peso,
                        a.getMedio(), a.clasificacionGestacion);
                animales.add(modificado);
                return true;
            }
        }
        return false;
    }
}