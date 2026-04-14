package Mapas.LigaVideojuegos.Models;

import java.time.LocalDateTime;

public class Partida {
    private static int contador = 1;
    private int id;
    private LocalDateTime fecha;
    private Videojuego juego;
    private String rival;
    private Resultado resultado;
    private int puntos;

    public Partida(LocalDateTime fecha, Videojuego juego, String rival, Resultado resultado) {
        this.id = contador++;
        this.fecha = fecha;
        this.juego = juego;
        this.rival = rival;
        this.resultado = resultado;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Partida.contador = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Videojuego getJuego() {
        return juego;
    }

    public void setJuego(Videojuego juego) {
        this.juego = juego;
    }

    public String getRival() {
        return rival;
    }

    public void setRival(String rival) {
        this.rival = rival;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", juego=" + juego +
                ", rival='" + rival + '\'' +
                ", resultado=" + resultado +
                ", puntos=" + puntos +
                '}';
    }
}