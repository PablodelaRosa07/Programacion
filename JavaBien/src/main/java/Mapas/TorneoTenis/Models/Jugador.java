package Mapas.TorneoTenis.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Jugador implements Comparable<Jugador> {
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int ranking;
    private int numFicha; // Identificador único
    private List<Partido> partidosJugados;

    public Jugador(String nombre, String apellido, String nacionalidad, int ranking, int numFicha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.ranking = ranking;
        this.numFicha = numFicha;
        this.partidosJugados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getNumFicha() {
        return numFicha;
    }

    public void setNumFicha(int numFicha) {
        this.numFicha = numFicha;
    }

    public List<Partido> getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(List<Partido> partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jugador)) return false;
        Jugador jugador = (Jugador) o;
        return numFicha == jugador.numFicha;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numFicha);
    }

    @Override
    public int compareTo(Jugador otro) {
        int compApellido = this.apellido.compareToIgnoreCase(otro.apellido);
        if (compApellido != 0) return compApellido;

        int compNombre = this.nombre.compareToIgnoreCase(otro.nombre);
        if (compNombre != 0) return compNombre;

        return Integer.compare(this.numFicha, otro.numFicha);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", ranking=" + ranking +
                ", numFicha=" + numFicha +
                ", partidosJugados=" + partidosJugados +
                '}';
    }
}
