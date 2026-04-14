package Mapas.LigaVideojuegos.Controller;

import Mapas.LigaVideojuegos.Models.Equipo;
import Mapas.LigaVideojuegos.Models.Partida;
import Mapas.LigaVideojuegos.Models.Resultado;
import Mapas.LigaVideojuegos.Models.Videojuego;
import Mapas.LigaVideojuegos.Repository.RepositorioLiga;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GestionaLiga {
    public static void main(String[] args) {
        RepositorioLiga liga = new RepositorioLiga();

        try {
            // Creamos 3 equipos
            Equipo e1 = new Equipo("G2", "G2 Esports", "Alemania", LocalDate.of(2015,1,1));
            Equipo e2 = new Equipo("KOI", "KOI Squad", "España", LocalDate.of(2021,1,1));
            Equipo e3 = new Equipo("FNC", "Fnatic", "Reino Unido", LocalDate.of(2004,1,1));

            liga.registrarEquipo(e1);
            liga.registrarEquipo(e2);
            liga.registrarEquipo(e3);

            // INTENTO DE DUPLICADO (Lanzará excepción)
            System.out.println("Intentando registrar G2 otra vez...");
            liga.registrarEquipo(new Equipo("G2", "G2 Clon", "España", LocalDate.now()));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            // Añadimos 3 partidas a G2 (Gana todas = 9 puntos)
            liga.añadirPartida("G2", new Partida(LocalDateTime.now(), Videojuego.VALORANT, "Leviatán", Resultado.VICTORIA));
            liga.añadirPartida("G2", new Partida(LocalDateTime.now(), Videojuego.CS2, "NaVi", Resultado.VICTORIA));
            liga.añadirPartida("G2", new Partida(LocalDateTime.now(), Videojuego.FIFA, "Heretics", Resultado.VICTORIA));

            // Añadimos partidas a KOI (1 victoria, 1 empate, 1 derrota = 4 puntos)
            liga.añadirPartida("KOI", new Partida(LocalDateTime.now(), Videojuego.LEAGUE_OF_LEGENDS, "T1", Resultado.VICTORIA));
            liga.añadirPartida("KOI", new Partida(LocalDateTime.now(), Videojuego.LEAGUE_OF_LEGENDS, "G2", Resultado.EMPATE));
            liga.añadirPartida("KOI", new Partida(LocalDateTime.now(), Videojuego.LEAGUE_OF_LEGENDS, "FNC", Resultado.DERROTA));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
