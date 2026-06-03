package BoletinSimulaciones.Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Evento implements Comparable<Evento>{

    private String nombreEvento;
    private LocalDate fechaEvento;
    private String lugarCelebracion;
    private List<Reserva> listaReservas;

    public Evento(LocalDate fechaEvento, String lugarCelebracion, String nombreEvento) {
        this.fechaEvento = fechaEvento;
        this.listaReservas = new ArrayList<>();
        this.lugarCelebracion = lugarCelebracion;
        this.nombreEvento = nombreEvento;
    }

    public LocalDate getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(LocalDate fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public String getLugarCelebracion() {
        return lugarCelebracion;
    }

    public void setLugarCelebracion(String lugarCelebracion) {
        this.lugarCelebracion = lugarCelebracion;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    @Override
    public int compareTo(Evento otroEvento) {
        int resultado = this.fechaEvento.compareTo(otroEvento.getFechaEvento());
        if (resultado == 0){
            resultado = this.nombreEvento.compareTo(otroEvento.getNombreEvento());
        }
        return resultado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Evento evento = (Evento) o;
        return Objects.equals(nombreEvento, evento.nombreEvento) && Objects.equals(fechaEvento, evento.fechaEvento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreEvento, fechaEvento);
    }

    @Override
    public String toString() {
        return "Evento{" +
                "fechaEvento=" + fechaEvento +
                ", nombreEvento='" + nombreEvento + '\'' +
                ", lugarCelebracion='" + lugarCelebracion + '\'' +
                ", listaReservas=" + listaReservas +
                '}';
    }


}
