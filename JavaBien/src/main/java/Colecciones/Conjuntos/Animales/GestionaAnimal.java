package Colecciones.Conjuntos.Animales;

import java.time.LocalDate;

public class GestionaAnimal {
    public static void main(String[] args) {
        RepositorioAnimal repo = new RepositorioAnimal("MundoFauna", "Madrid", 50000);

        repo.agregarAnimal(new Animal(1, "Leo", "León", 5, ClasificacionComida.CARNIVOROS,
                LocalDate.of(2019, 3, 10), 190.5, Medio.TIERRA, ClasificacionGestacion.VIVIPAROS));

        repo.agregarAnimal(new Animal(2, "Delphin", "Delfín", 8, ClasificacionComida.CARNIVOROS,
                LocalDate.of(2016, 7, 21), 150.0, Medio.AGUA, ClasificacionGestacion.VIVIPAROS));

        repo.agregarAnimal(new Animal(3, "Bambi", "Ciervo", 2, ClasificacionComida.HERVIBOROS,
                LocalDate.of(2022, 5, 2), 60.0, Medio.TIERRA, ClasificacionGestacion.VIVIPAROS));

        System.out.println("Animales iniciales");
        repo.mostrarAnimales();

        System.out.println("Modificando nombre del animal con ID 3");
        repo.modificarNombreAnimal(3, "Ciervo");

        System.out.println("Animales tras modificación");
        repo.mostrarAnimales();
    }
}
