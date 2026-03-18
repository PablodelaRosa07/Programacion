package Examen1Java;

import java.util.Random;
import java.util.Scanner;

public class EscapeRoom {
    static void main(String[] args) {
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        int[] codigoNumerico = new int[5];
        String[] estadoSalas = new String[5];
        EscapeRoom referencia = new EscapeRoom();
        boolean correcto = false;

        System.out.println("G. Generar Partida");
        System.out.println("A. Intentar abrir una sala");
        System.out.println("E. Estado del Scape Room");
        System.out.println("S. Salir");


        while (!salir){
            System.out.println("Elige una opción: ");
            String opcion = sc.nextLine().toLowerCase();

            if (opcion.equals("g")){
                System.out.println("Generando Partida");
                referencia.generarPartida(codigoNumerico, estadoSalas);
            }

            if (opcion.equals("a")){
                System.out.println("Abriendo una sala");
                referencia.abrirSala(sc, estadoSalas, codigoNumerico, opcion, correcto, salir);

            }

            if (opcion.equals("e")){
                System.out.println("Estado del Scape Room");
                referencia.estadoScapeRoom(estadoSalas);
            }

            if (opcion.equals("s")){
                System.out.println("Saliendo");
                salir = true;
            }
        }
    }

    void generarPartida(int[] codigoNumerico, String[] estadoSalas){
        for (int i = 0; i < codigoNumerico.length; i++) {
            Random generator = new Random();
            int numeroRandom = generator.nextInt(0,6);

            codigoNumerico[i] = numeroRandom;
            estadoSalas[i] = "BLOQUEADA";
        }
    }

    void estadoScapeRoom(String[] estadoSalas){
        int contadorBloqueadas = 0;
        int contadorAbiertas = 0;
        int contadorInvalidadas = 0;

        for (int i = 0; i < estadoSalas.length; i++) {
            System.out.println("Sala " +i+ ": " +estadoSalas[i]);
            if (estadoSalas[i].equals("BLOQUEADA")){
                contadorBloqueadas = contadorBloqueadas+1;
            }
            if (estadoSalas[i].equals("ABIERTA")){
                contadorAbiertas = contadorAbiertas+1;
            }
            if (estadoSalas[i].equals("INVALIDADA")){
                contadorInvalidadas = contadorInvalidadas+1;
            }
        }
        System.out.println("Hay " +contadorBloqueadas+ " salas bloquedas, " +contadorAbiertas+ " salas abiertas y " +contadorInvalidadas+ " salas invalidadas.");
    }

    void abrirSala(Scanner sc, String[] estadoSalas, int[] codigoNumerico, String opcion, boolean correcto, boolean salir){
        int contadorIntentos = 0;
        System.out.println("Introduce el número de sala: ");
        int numeroSala = sc.nextInt();

        while (!correcto){
            while (numeroSala >= 5 && numeroSala <= -1){
                System.out.println("Incorrecto, introduce el número de sala: ");
                numeroSala = sc.nextInt();
            }

            if (estadoSalas[numeroSala].equals("DESBLOQUEADA")){
                System.out.println("La sala " +numeroSala+ " ya ha sido desbloqueada");
                System.out.println("Introduce el número de sala: ");
                numeroSala = sc.nextInt();
            }
            if (estadoSalas[numeroSala].equals("INVALIDADA")){
                System.out.println("La sala " +numeroSala+ " está invalidada y ya no puedes completar el juego");
                correcto = true;
                salir = true;
            }
            if (estadoSalas[numeroSala].equals("BLOQUEADA")){
                System.out.println("Introduce el código numérico entre 0 y 6 para desbloquearla: ");
                int numeroAdivinar = sc.nextInt();
                if (codigoNumerico[numeroSala] == numeroAdivinar){
                    System.out.println("Código Correcto. Sala " +numeroSala+ " desbloqueada");
                    contadorIntentos = 0;
                    estadoSalas[numeroSala] = "DESBLOQUEADA";
                    System.out.println("Introduce el número de sala: ");
                    numeroSala = sc.nextInt();

                }
                else {
                    contadorIntentos = contadorIntentos+1;
                    if (contadorIntentos >= 3){
                        System.out.println("Solo tenías 3 intentos y los has desaprovechado, la sala ha quedado INVALIDADA");
                        estadoSalas[numeroSala] = "INVALIDADA";
                        correcto = true;
                        salir = true;
                    }
                    else {
                        System.out.println("Código incorrecto");
                    }
                }
            }


        }
    }
}









