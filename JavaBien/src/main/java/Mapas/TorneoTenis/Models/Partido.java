package Mapas.TorneoTenis.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Partido {
    private Jugador jugador1;
    private Jugador jugador2;
    private EstadoPartido estado;
    private Date fecha;
    private List<Integer> puntosJ1;
    private List<Integer> puntosJ2;

    public Partido(Jugador j1, Jugador j2, Date fecha) {
        this.jugador1 = j1;
        this.jugador2 = j2;
        this.fecha = fecha;
        this.estado = EstadoPartido.PLANIFICADO;
        this.puntosJ1 = new ArrayList<>();
        this.puntosJ2 = new ArrayList<>();
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public EstadoPartido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPartido estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Integer> getPuntosJ1() {
        return puntosJ1;
    }

    public void setPuntosJ1(List<Integer> puntosJ1) {
        this.puntosJ1 = puntosJ1;
    }

    public List<Integer> getPuntosJ2() {
        return puntosJ2;
    }

    public void setPuntosJ2(List<Integer> puntosJ2) {
        this.puntosJ2 = puntosJ2;
    }
}
