package Colecciones.Listas.Biblioteca2.Controller;

import Colecciones.Listas.Biblioteca2.Models.Estado;
import Colecciones.Listas.Biblioteca2.Models.Libro;
import Colecciones.Listas.Biblioteca2.Models.Prestamo;
import Colecciones.Listas.Biblioteca2.Repository.Biblioteca;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige opcion: ");
        int opcion = sc.nextInt();

        Biblioteca biblioteca = new Biblioteca();
        Prestamo prestamo = new Prestamo(1, Libro libro1)
        Libro libro1 = new Libro("Hola", "Yo", Estado.LIBRE);
        Libro libro2 = new Libro("Adios", "Tu", Estado.LIBRE);

        while (opcion < 6 || opcion > 0){
            if (opcion == 1){
                biblioteca.prestarLibro(libro1, p);
            }
        }
    }
}
