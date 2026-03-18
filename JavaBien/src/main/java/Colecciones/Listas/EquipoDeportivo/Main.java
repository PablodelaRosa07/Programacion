package Colecciones.Listas.EquipoDeportivo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Juan Perez", "11111111A");
        Alumno a2 = new Alumno("Maria Lopez", "22222222B");
        Alumno a3 = new Alumno("Carlos Ruiz", "33333333C");
        Alumno a4 = new Alumno("Ana Sanz", "44444444D");

        Equipo futbol = new Equipo("FC Java",new ArrayList<>());
        Equipo basket = new Equipo("Basket Python",new ArrayList<>());

        try {
            System.out.println("Fase 1: Añadiendo alumnos");
            futbol.añadirAlumno(a1);
            futbol.añadirAlumno(a2);
            futbol.añadirAlumno(a3);

            basket.añadirAlumno(a2);
            basket.añadirAlumno(a4);

            futbol.mostrarLista();
            basket.mostrarLista();

        } catch (DeportivosException e) {
            System.out.println("[EXCEPCIÓN CAPTURADA]: " + e.getMessage());
        }
        try {
            System.out.println("Fase 2: Buscando alumnos");
            futbol.buscarAlumno(a1);
        }
        catch (DeportivosException r) {
            System.out.println("[EXCEPCIÓN CAPTURADA]: " + r.getMessage());
        }

            System.out.println("Fase 3: Operaciones de conjuntos");
            Equipo todos = futbol.juntaEquipo(basket);
            todos.mostrarLista();


            Equipo comunes = futbol.interseccion(basket);
            comunes.mostrarLista();

            try {
            System.out.println("Fase 4: Borrando a Juan del equipo de fútbol");
            futbol.borrarAlumno(a1);
            futbol.mostrarLista();
        }
        catch (DeportivosException r) {
            System.out.println("[EXCEPCIÓN CAPTURADA]: " + r.getMessage());
        }

        try {
            System.out.println("Fase 5: Forzando excepciones");
            basket.añadirAlumno(a4);
        }
        catch (DeportivosException r) {
            System.out.println("[EXCEPCIÓN CAPTURADA]: " + r.getMessage());
        }

    }
}