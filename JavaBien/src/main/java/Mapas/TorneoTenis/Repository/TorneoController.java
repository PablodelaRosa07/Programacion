package Mapas.TorneoTenis.Repository;

import Mapas.TorneoTenis.Exception.TorneoException;
import Mapas.TorneoTenis.Models.EstadoPartido;
import Mapas.TorneoTenis.Models.Jugador;
import Mapas.TorneoTenis.Models.Partido;

import java.util.*;

public class TorneoController {
    // Usamos Listas para simplificar la gestión.
    // Si Jugador tiene bien implementado 'equals', el contains() funciona perfecto.
    private List<Jugador> jugadores = new ArrayList<>();
    private List<Partido> partidos = new ArrayList<>();

    public void agregarJugador(Jugador jugador) throws TorneoException {
        if (jugadores.contains(jugador)) {
            throw new TorneoException("El jugador con ficha " + jugador.getNumFicha() + " ya existe.");
        }
        jugadores.add(jugador);
    }

    public void registrarPartido(Partido partido) {
        partidos.add(partido);
    }

    public void mostrarJugadores() {
        Collections.sort(jugadores);
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
    }

    public void mostrarPartidosPorJugador(int numFicha) throws TorneoException {
        Jugador buscado = null;

        // Buscamos al jugador manualmente
        for (Jugador jugador : jugadores) {
            if (jugador.getNumFicha() == numFicha) {
                buscado = jugador;
                break;
            }
        }

        if (buscado == null) {
            throw new TorneoException("Jugador no encontrado.");
        }

        // Filtramos y mostramos partidos
        System.out.println("Partidos de: " + buscado.getNombre()+" "+buscado.getApellido());
        for (Partido partido : partidos) {
            if (partido.getJugador1().equals(buscado) || partido.getJugador2().equals(buscado)) {
                System.out.println(partido);
            }
        }
    }

    public Jugador getJugadorGanador(Partido partido) throws TorneoException {
        if (partido.getEstado() == EstadoPartido.PLANIFICADO) {
            throw new TorneoException("Partido no jugado aún.");
        }

        // Lógica simple de conteo
        int puntosJ1 = 0;
        int puntosJ2 = 0;

        // Asumiendo que las listas tienen el mismo tamaño
        for (int i = 0; i < partido.getPuntosJ1().size(); i++) {
            if (partido.getPuntosJ1().get(i) > partido.getPuntosJ2().get(i)) puntosJ1++;
            else puntosJ2++;
        }

        return (puntosJ1 > puntosJ2) ? partido.getJugador1() : partido.getJugador2();
    }
}