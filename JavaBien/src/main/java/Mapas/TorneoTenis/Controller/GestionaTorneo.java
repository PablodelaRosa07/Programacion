package Mapas.TorneoTenis.Controller;

// GestionaTorneo.java
import Mapas.TorneoTenis.Exception.TorneoException;
import Mapas.TorneoTenis.Models.Jugador;
import Mapas.TorneoTenis.Models.Partido;
import Mapas.TorneoTenis.Repository.TorneoController;

import java.util.Date;

public class GestionaTorneo {
    public static void main(String[] args) {
        TorneoController torneo = new TorneoController();

        try {
            // Alta de 4 jugadores
            Jugador j1 = new Jugador("Rafael", "Nadal", "ESP", 1, 101);
            Jugador j2 = new Jugador("Carlos", "Alcaraz", "ESP", 2, 102);
            Jugador j3 = new Jugador("Novak", "Djokovic", "SRB", 3, 103);
            Jugador j4 = new Jugador("Roger", "Federer", "SUI", 4, 104);

            torneo.agregarJugador(j1);
            torneo.agregarJugador(j2);
            torneo.agregarJugador(j3);
            torneo.agregarJugador(j4);

            // Intento de duplicado para probar excepción
            // torneo.agregarJugador(new Jugador("Rafa", "Nadal", "ESP", 1, 101));

            // Registrar 3 partidos (2 repetidos entre j1 y j2)
            torneo.registrarPartido(new Partido(j1, j2, new Date()));
            torneo.registrarPartido(new Partido(j1, j2, new Date()));
            torneo.registrarPartido(new Partido(j3, j4, new Date()));

            System.out.println("--- Lista de Jugadores Ordenada (Apartado 4) ---");
            torneo.mostrarJugadores();

            System.out.println("\n--- Partidos de Nadal ---");
            torneo.mostrarPartidosPorJugador(101);

            // Probar excepción de ganador en partido planificado
            System.out.println("\n--- Intentando obtener ganador de partido pendiente ---");
            // Aquí lanzará la excepción
            // torneo.getJugadorGanador(j1.getPartidosJugados().get(0));

        } catch (TorneoException e) {
            System.err.println("CAPTURA DE EXCEPCIÓN: " + e.getMessage());
        }
    }
}
