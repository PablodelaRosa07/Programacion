package BoletinOrdenaciones.Ejercicio1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        boolean devuelve = true;

        RepositorioAnimal repositorioAnimal = new RepositorioAnimal("Sevilla", "Zoo Sevilla", 15000);

        Animal animal1 = new Animal(ClasificacicionGestacion.ovíparos, ClasificacionComida.omnívoros, 3, "Mamífero", 01-01-2025, "1234ABC", Medio.agua, "Pedro", 12);
        Animal animal2 = new Animal(ClasificacicionGestacion.ovíparos, ClasificacionComida.hervíboros, 3, "Mamífero", 01-01-2026, "5678CBA", Medio.aire, "Sanchez", 22);

        System.out.println("Elige opcion (1 - Agregar Animales. 2 - Modificar Datos. 3 - Mostrar Todo. 4 - Salir): ");
        int opcion = sc.nextInt();

        while (devuelve){

            if (opcion == 1){
                main.agregarAnimal(animal1, repositorioAnimal);
                main.agregarAnimal(animal2, repositorioAnimal);
                System.out.println("Elige opcion (1 - Agregar Animales. 2 - Modificar Datos. 3 - Mostrar Todo. 4 - Salir): ");
                opcion = sc.nextInt();
            }
            if (opcion == 2){
                main.modificarDatos(animal1, sc);
                main.modificarDatos(animal2, sc);
                System.out.println("Elige opcion (1 - Agregar Animales. 2 - Modificar Datos. 3 - Mostrar Todo. 4 - Salir): ");
                opcion = sc.nextInt();
            }
            if (opcion == 3){
                main.mostrarTodo(repositorioAnimal);
                System.out.println("Elige opcion (1 - Agregar Animales. 2 - Modificar Datos. 3 - Mostrar Todo. 4 - Salir): ");
                opcion = sc.nextInt();
            }
            if (opcion == 4){
                devuelve = false;
            }
            if (opcion < 1 || opcion > 4){
                System.out.println("Elige opcion (1 - Agregar Animales. 2 - Modificar Datos. 3 - Mostrar Todo. 4 - Salir: ");
                opcion = sc.nextInt();
            }
        }


    }

    public void agregarAnimal(Animal animal, RepositorioAnimal repositorioAnimal){
        System.out.println("AÑADIENDO ANIMAL");
        repositorioAnimal.getListaAnimales().add(animal);
        System.out.println("Animal añadido");
    }

    public void modificarDatos(Animal animal, Scanner sc){
        System.out.println("Qué quieres modificar? (Medio - 1, Gestacion - 2, Comida - 3: ");
        int opcion = sc.nextInt();

        if (opcion == 1){
            System.out.println("MODIFICANDO MEDIO");
            System.out.println("Qué quieres modificar? (Agua - 1, Aire - 2, Tierra - 3: ");
            int opcion2 = sc.nextInt();
            if (opcion2 == 1){
                animal.setMedio(Medio.agua);
            }
            if (opcion2 == 2){
                animal.setMedio(Medio.aire);
            }
            if (opcion2 == 3){
                animal.setMedio(Medio.tierra);
            }
        }

        if (opcion == 2){
            System.out.println("MODIFICANDO GESTACION");
            System.out.println("Qué quieres modificar? (Oviparos - 1, Ovoviviparos - 2, Viviparos - 3: ");
            int opcion2 = sc.nextInt();
            if (opcion2 == 1){
                animal.setClasificacicionGestacion(ClasificacicionGestacion.ovíparos);
            }
            if (opcion2 == 2){
                animal.setClasificacicionGestacion(ClasificacicionGestacion.ovovivíparos);
            }
            if (opcion2 == 3){
                animal.setClasificacicionGestacion(ClasificacicionGestacion.vivíparos);
            }
        }

        if (opcion == 3){
            System.out.println("MODIFICANDO COMIDA");
            System.out.println("Qué quieres modificar? (Herviboros - 1, Carnivoros - 2, Omnivoros - 3: ");
            int opcion2 = sc.nextInt();
            if (opcion2 == 1){
                animal.setClasificacionComida(ClasificacionComida.hervíboros);
            }
            if (opcion2 == 2){
                animal.setClasificacionComida(ClasificacionComida.carnívoros);
            }
            if (opcion2 == 3){
                animal.setClasificacionComida(ClasificacionComida.omnívoros);
            }
        }
    }

    public void mostrarTodo(RepositorioAnimal repositorioAnimal){
        System.out.println(repositorioAnimal.getListaAnimales());
    }

}
