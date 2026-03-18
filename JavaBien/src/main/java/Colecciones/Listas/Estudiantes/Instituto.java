package Colecciones.Listas.Estudiantes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Instituto {
    private List<Grupo> listaGrupos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Instituto miInsti = new Instituto();
        miInsti.menuPrincipal();
    }

    public void menuPrincipal() {
        int opcion = 0;
        while (opcion != 7) {
            try {
                System.out.println("--- MENÚ INSTITUTO ---");
                System.out.println("1. Agregar Grupo");
                System.out.println("2. Agregar Estudiante");
                System.out.println("3. Mostrar Estudiantes");
                System.out.println("4. Info Grupo");
                System.out.println("5. Promedio Estudiante");
                System.out.println("6. Promedio Grupo");
                System.out.println("7. Salir");
                opcion = Integer.parseInt(sc.nextLine());

                ejecutarOpcion(opcion);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private void ejecutarOpcion(int op) throws EntidadNoEncontradaException {
        if (op == 1){
            agregarGrupo();
        }
        if (op == 2){
            agregarEstudiante();
        }
        if (op == 3){
            mostrarEstudiantes();
        }
        if (op == 4){
            infoGrupo();
        }
        if (op == 5){
            promedioEstudiante();
        }
        if (op == 6){
            promedioGrupo();
        }
        if (op == 7){
            System.out.println("Cerrando programa.");
        }
        else {
            System.out.println("Opción no válida.");
        }
    }

    private void agregarGrupo() {
        System.out.print("ID: ");
        String id = sc.nextLine();

        System.out.print("Descripción: ");
        String desc = sc.nextLine();

        System.out.print("Tutor: ");
        String tut = sc.nextLine();

        System.out.print("Aula: ");
        String aula = sc.nextLine();

        listaGrupos.add(new Grupo(id, desc, tut, aula));
    }

    private void agregarEstudiante() throws EntidadNoEncontradaException {
        System.out.print("Descripción del grupo: ");
        Grupo g = buscarGrupo(sc.nextLine());

        System.out.print("Nombre: "); String nom = sc.nextLine();
        System.out.print("ID Estudiante: "); String id = sc.nextLine();
        Estudiante e = new Estudiante(nom, id);

        System.out.print("¿Cuántas notas?: ");
        int cant = Integer.parseInt(sc.nextLine());
        for(int i=0; i<cant; i++) {
            System.out.print("Nota " + (i+1) + ": ");
            e.notas.add(Double.parseDouble(sc.nextLine()));
        }
        g.estudiantes.add(e);
    }

    private void promedioEstudiante() throws EntidadNoEncontradaException {
        System.out.print("ID Estudiante: ");
        String idBuscado = sc.nextLine();
        Estudiante encontrado = null;

        for (Grupo g : listaGrupos) {
            for (Estudiante e : g.estudiantes) {
                if (e.id.equals(idBuscado)) {
                    encontrado = e;
                }
            }
        }

        if (encontrado == null) {
            throw new EntidadNoEncontradaException("Estudiante no hallado.");
        }
        System.out.println("Promedio: " + encontrado.obtenerPromedio());
    }

    private void promedioGrupo() throws EntidadNoEncontradaException {
        System.out.print("Descripción Grupo: ");
        Grupo g = buscarGrupo(sc.nextLine());
        double sumaTotal = 0;
        int totalNotas = 0;

        for (Estudiante e : g.estudiantes) {
            for (Double nota : e.notas) {
                sumaTotal = nota+sumaTotal;
                totalNotas = totalNotas+1;
            }
        }

        double resultado = 0;
        if (totalNotas > 0) {
            resultado = sumaTotal / totalNotas;
        }
        System.out.println("Promedio del grupo: " + resultado);
    }

    private Grupo buscarGrupo(String desc) throws EntidadNoEncontradaException {
        Grupo grupoEncontrado = null;
        for (Grupo g : listaGrupos) {
            if (g.descripcion.equals(desc)) {
                grupoEncontrado = g;
            }
        }

        if (grupoEncontrado == null) {
            throw new EntidadNoEncontradaException("Grupo no encontrado.");
        }
        return grupoEncontrado;
    }

    private void infoGrupo() throws EntidadNoEncontradaException {
        System.out.print("Descripción: ");
        Grupo g = buscarGrupo(sc.nextLine());
        System.out.println("Tutor: " + g.tutor + " | Alumnos: " + g.estudiantes.size());
    }

    private void mostrarEstudiantes() throws EntidadNoEncontradaException {
        System.out.print("Descripción: ");
        Grupo g = buscarGrupo(sc.nextLine());
        for (Estudiante e : g.estudiantes) {
            System.out.println(e.nombre + "Notas: " + e.notas);
        }
    }
}