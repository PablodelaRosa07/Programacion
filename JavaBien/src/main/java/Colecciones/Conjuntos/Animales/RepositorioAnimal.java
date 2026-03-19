package Colecciones.Conjuntos.Animales;

import java.util.TreeSet;

public class RepositorioAnimal implements Comparable{

    private String nombre;
    private String lugar;
    private double presupuesto;
    private TreeSet<Animal> listaAnimal;


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
