package Simulacro1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    static void main(String[] args) {
        int[] listaApuestas = new int[100];
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        Ejercicio1 ref = new Ejercicio1();
        int[] apuestas = new int[100];
        String[] resultado = new String[100];
        int funcion1 = 0;

        boolean finalizado = false;
        while (finalizado == false) {

            System.out.println("Elige una opción: \n" +
                    "1. Apostar \n" +
                    "2. Mostrar historial \n" +
                    "3. Retirarse");


            System.out.println("Elige 1, 2, 3: ");
            int opcion = sc.nextInt();

            if (opcion == 1) {
                funcion1 = ref.apostar(sc, contador, listaApuestas, resultado, apuestas);
                contador = contador + 1;
            }

            if (opcion == 2) {
                ref.mostrarHistorial(resultado, apuestas, listaApuestas, funcion1);
            }

            if (opcion == 3) {
                finalizado = true;
            }
        }
    }

    int apostar(Scanner sc, int contador, int[] listaApuestas, String[] resultado, int[] apuestas) {
        Random aleatorioR = new Random();
        int ganancia = 0;
        System.out.println("Elige número al que apostar: ");
        int apuesta = sc.nextInt();
        apuestas[contador] = apuesta;

        System.out.println("¿Cuánto quieres apostar?: ");
        int cantidad = sc.nextInt();

        int dado1 = aleatorioR.nextInt(6) + 1;
        int dado2 = aleatorioR.nextInt(6) + 1;

        if (apuesta == dado1 + dado2) {
            ganancia = cantidad * 2;
            resultado[contador] = "ganando";
            System.out.println("Has ganado " + cantidad * 2 + "€");
            listaApuestas[contador] = ganancia;
        }
        if (apuesta != dado1 + dado2) {
            ganancia = cantidad;
            resultado[contador] = "perdiendo";
            System.out.println("Has perdido " + cantidad + "€");
            listaApuestas[contador] = ganancia;
        }
        return ganancia;
    }

    int mostrarHistorial(String[] resultado, int[] apuesta, int[] listaApuestas, int funcion1){
        for (int i = 0; i < resultado.length; i++) {
            if (resultado[i] != null){
                System.out.println("En la jugada " + (i+1) + " apostó el valor " + apuesta[i] + ", " + Arrays.toString(resultado) + listaApuestas);
            }
        }
        return 0;
    }
}
