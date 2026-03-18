package EjerciciosClase;

import java.util.Scanner;

public class Racing {
    static void main(String[] args) {
        String[] nombresPilotos = new String[100];
        double[] tiemposPilotos = new double[100];
        int contador = 0;
        int veces = 0;
        int sumaMedia = 0;
        Racing referencia = new Racing();
        int numPiloto = 0;

        boolean noSalir = true;
        while (noSalir == true){
            referencia.ejecutarMenu();
            Scanner input = new Scanner(System.in);
            System.out.println("Elige opción: ");
            int sc = input.nextInt();

            if (sc == 1) {
                numPiloto = referencia.inicializarEscuderia(nombresPilotos, tiemposPilotos, contador, veces);
            }

            if (sc == 2){
                referencia.formatearPilotos(nombresPilotos);
            }

            if (sc == 3){
                referencia.obtenerEstadisticas(nombresPilotos, tiemposPilotos);
            }

            if (sc == 4){
                referencia.buscarPiloto(nombresPilotos, tiemposPilotos, numPiloto);
            }

            if (sc == 5){
                referencia.generarIDS(nombresPilotos);
            }

            if (sc == 6){
                noSalir = false;
            }
        }
    }

    void ejecutarMenu(){
            System.out.println("1. Cargar/Reiniciar Datos: Llama al Apartado 2.\n" +
                    "2. Formatear Nombres: Ejecuta el proceso de limpieza y mayúsculas.\n" +
                    "3. Ver Estadísticas: Muestra la media y el ganador.\n" +
                    "4. Buscar Piloto: Pide un nombre y devuelve su tiempo.\n" +
                    "5. Generar IDs de Carrera: Muestra los códigos de tres letras.\n" +
                    "6. Salir.\n");
        }

    int inicializarEscuderia(String[] nombresPilotos, double[] tiemposPilotos, int contador, int veces){
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuántos pilotos quieres añadir?: ");
        veces = input.nextInt();
        for (int i = 0; i < veces; i++) {
            Scanner input2 = new Scanner(System.in);
            System.out.println("Introduce nombre del piloto: ");
            String nombrePiloto = input2.nextLine();
            System.out.println("Introduce tiempo del piloto:");
            int tiempoPiloto = input2.nextInt();

            while (tiempoPiloto <= -1){
                System.out.println("Introduce tiempo del piloto");
                tiempoPiloto = input2.nextInt();
            }

            nombresPilotos[contador] = nombrePiloto;
            tiemposPilotos[contador] = tiempoPiloto;
            contador = contador+1;
        }
        return contador;
    }

    void formatearPilotos(String[] nombresPilotos){
        for (int i = 0; i < nombresPilotos.length; i++) {
            if (nombresPilotos[i] != null){
                nombresPilotos[i] = nombresPilotos[i].toUpperCase();
                if (nombresPilotos[i].length() > 10){
                    nombresPilotos[i] = nombresPilotos[i].substring(0, 9)+".";
                }
                System.out.println(nombresPilotos[i]);
            }

        }
    }

    void obtenerEstadisticas(String[] nombresPilotos, double[] tiemposPilotos) {

        double suma = 0;
        int contador = 0;

        double mejorTiempo = 0;
        String mejorPiloto = "";

        for (int i = 0; i < nombresPilotos.length; i++) {
            if (nombresPilotos[i] != null) {
                double tiempo = tiemposPilotos[i];

                if (mejorPiloto.equals("")) {
                    mejorTiempo = tiempo;
                    mejorPiloto = nombresPilotos[i];
                }
                suma += tiempo;
                contador++;
                if (tiempo < mejorTiempo) {
                    mejorTiempo = tiempo;
                    mejorPiloto = nombresPilotos[i];
                }
            }
        }
        if (contador == 0) {
            System.out.println("No hay pilotos registrados.");
            return;
        }
        double media = suma / contador;

        System.out.println("Tiempo medio: " + media);
        System.out.println("Mejor tiempo: " + mejorTiempo);
        System.out.println("Piloto más rápido: " + mejorPiloto);
    }

    double buscarPiloto(String[] nombresPilotos, double[] tiemposPilotos, int contador) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre de piloto:");
        String nombreBuscado = sc.nextLine().toUpperCase();
        boolean encontrado = false;
        int i = 0;
        double resultado = -1;
        while (!encontrado && i < contador) {

                if (nombresPilotos[i].equalsIgnoreCase(nombreBuscado)) {
                    System.out.println("Tiempo del piloto: " + tiemposPilotos[i]);
                    resultado = tiemposPilotos[i];
                    encontrado = true;
            }
                else {
                    i = i+1;
                }
        }

        return resultado;
    }

    void generarIDS(String[] nombresPilotos) {
        for (int i = 0; i < nombresPilotos.length; i++) {
            if (nombresPilotos[i] != null) {
                String nombre = nombresPilotos[i];
                String codigo;
                if (nombre.length() >= 3) {
                    codigo = nombre.substring(0, 3).toUpperCase();
                }
                else {
                    codigo = nombre.toUpperCase();
                }
                codigo = codigo + "-" + i;
                System.out.println(codigo);
            }
        }
    }
}
