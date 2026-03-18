package Simulacro2;

import java.util.Scanner;

public class Ejercicio1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean entra = true;
        Ejercicio1 referencia = new Ejercicio1();
        int contador = 0;

        String[] nombreAutor = new String[100];
        String[] sexoAutor = new String[100];
        String[] tituloLibro = new String[100];
        int[] precioUnitario = new int[100];
        int[] unidadesVendidas = new int[100];


        System.out.println("1. Registrar Libros\n" +
                "2. Mostrar % libros por sexo del autor\n" +
                "3. Mostrar libro más barato y más caro\n" +
                "4. Mostrar libro más vendido\n" +
                "5. Salir.\n");
        int opcion = 0;

        while (entra){

            if (opcion <= 0 || opcion >= 6){
                System.out.println("Elige una opción:");
                opcion = sc.nextInt();
            }

            if (opcion == 1){
                contador = referencia.registrarLibros(sc, nombreAutor, sexoAutor, tituloLibro, precioUnitario, unidadesVendidas);
            }

            if (opcion == 2){
                referencia.porcentajeSexos(sexoAutor, contador);
            }

            if (opcion == 3){
                referencia.mostrarPrecios(precioUnitario, contador, tituloLibro);
            }

            if (opcion == 4){
                referencia.mostrarMasVendido(contador, nombreAutor, tituloLibro, precioUnitario, unidadesVendidas);
            }

            if (opcion == 5){
                entra = false;
            }
        }
    }

    int registrarLibros(Scanner sc, String[] nombreAutor, String[] sexoAutor, String[] tituloLibro, int[] precioUnitario, int[] unidadesVendidas){
        System.out.println("¿Cuántos libros quieres registrar?: ");
        int veces = sc.nextInt();

        for (int i = 0; i < veces; i++) {
            String nombre = sc.nextLine();
            System.out.println("Introduce nombre del Autor: ");
            nombreAutor[i] = nombre;

            String sexo = sc.nextLine();
            System.out.println("Introduce su sexo (Hombre, Mujer, Otro): ");
            sexoAutor[i] = sexo;

            String titulo = sc.nextLine();
            System.out.println("Introduce título del libro: ");
            tituloLibro[i] = titulo;

            int precio = sc.nextInt();
            System.out.println("Introduce el precio unitario: ");
            precioUnitario[i] = precio;

            int unidadesV = sc.nextInt();
            System.out.println("Introduce unidades vendidas: ");
            unidadesVendidas[i] = unidadesV;
        }
        return veces;
    }

    void porcentajeSexos(String[] sexoAutor, int contador){
        int contadorHombres = 0;
        int contadorMujeres = 0;

        for (int i = 0; i < contador; i++) {
            if (sexoAutor[i] == "HOMBRE"){
                contadorHombres = contadorHombres+1;
            }

            if (sexoAutor[i] == "MUJER"){
                contadorMujeres = contadorMujeres+1;
            }
        }
        System.out.println("El " + (contadorHombres/contador)*100 + "% de libros está escrito por Hombres");
        System.out.println("El " + (contadorMujeres/contador)*100 + "% de libros está escrito por Mujeres");
    }

    void mostrarPrecios(int[] precioUnitario, int contador, String[]tituloLibro){
        int precioBajo = precioUnitario[0];
        int precioAlto = precioUnitario[0];

        int contadorPrecios = -1;
        for (int i = 0; i < contador-1; i++) {
            if (precioBajo < precioUnitario[i+1]){
                contadorPrecios = contadorPrecios+1;
                precioBajo = precioUnitario[contadorPrecios];
            }
        }
        System.out.println("El libro más barato es " +tituloLibro[contadorPrecios]+ " y cuesta " +precioBajo);

        contadorPrecios = -1;
        for (int i = 0; i < contador-1; i++) {
            if (precioAlto > precioUnitario[i+1]){
                contadorPrecios = contadorPrecios+1;
                precioAlto = precioUnitario[contadorPrecios];
            }
        }
        System.out.println("El libro más caro es " +tituloLibro[contadorPrecios]+ " y cuesta " +precioAlto+ "€");
    }

    void mostrarMasVendido(int contador, String[] nombreAutor, String[] tituloLibro, int[] precioUnitario, int[] unidadesVendidas){
        int vendido = unidadesVendidas[0];

        int contadorVentas = -1;
        for (int i = 0; i < contador-1; i++) {
            if (vendido > unidadesVendidas[i+1]){
                contadorVentas = contadorVentas+1;
                vendido = precioUnitario[contadorVentas];
            }
        }
        System.out.println("El libro más vendido es " +tituloLibro[contadorVentas]+ " de " +nombreAutor[contadorVentas]+ " con un precio de " +precioUnitario[contadorVentas]+ " siendo vendido " +unidadesVendidas[contadorVentas]+ " veces");
    }
}
