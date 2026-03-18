package Colecciones.Listas.Biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        System.out.println("BIENVENIDO AL SISTEMA DE GESTIÓN DE BIBLIOTECA");

        while (opcion != 7) {
            try {
                System.out.println("MENÚ DE OPCIONES");
                System.out.println("1. Agregar un nuevo libro");
                System.out.println("2. Prestar un ejemplar");
                System.out.println("3. Devolver un ejemplar");
                System.out.println("4. Mostrar inventario completo");
                System.out.println("5. Mostrar información detallada");
                System.out.println("6. Buscar por Título o Autor");
                System.out.println("7. Salir");
                System.out.print("Seleccione una opción: ");

                opcion = Integer.parseInt(sc.nextLine());

                if (opcion == 1) {
                    System.out.print("Título: "); String t = sc.nextLine();
                    System.out.print("Autor: "); String a = sc.nextLine();
                    System.out.print("Género: "); String g = sc.nextLine();
                    System.out.print("Año de publicación: ");
                    int anio = Integer.parseInt(sc.nextLine());
                    miBiblioteca.agregarLibro(new Libro(anio, a, g, t));
                }

                if (opcion == 2) {
                    System.out.print("Ingrese el título del libro a PRESTAR: ");
                    String titulo = sc.nextLine();
                    miBiblioteca.prestarEjemplar(titulo);
                }

                if (opcion == 3) {
                    System.out.print("Ingrese el título del libro a DEVOLVER: ");
                    String titulo = sc.nextLine();
                    miBiblioteca.devolverEjemplar(titulo);
                }

                if (opcion == 4) {
                    miBiblioteca.mostrarInventario();
                }

                if (opcion == 5) {
                    miBiblioteca.mostrarInventario();

                }

                if (opcion == 6) {
                    System.out.print("Ingrese nombre de búsqueda: ");
                    String criterio = sc.nextLine();
                    miBiblioteca.buscarLibros(criterio);
                }

                if (opcion == 7) {
                    System.out.println("Cerrando el programa");
                }

                else {
                    System.out.println("Opción no válida. Intente de nuevo.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, introduzca un número.");
            } catch (BibliotecaException e) {
                System.out.println("AVISO DE BIBLIOTECA: " + e.getMessage());
            }
        }
    }
}