package BoletinSimulaciones.Ejercicio1;

import java.time.LocalDate;
import java.util.Date;

public class Reserva {

    private int idReserva;
    private LocalDate fechaReserva;
    private EstadoReserva estadoReserva;
    private Usuario usuarioReserva;

    public Reserva(EstadoReserva estadoReserva, LocalDate fechaReserva, int idReserva, Usuario usuarioReserva) {
        this.estadoReserva = estadoReserva;
        this.fechaReserva = fechaReserva;
        this.idReserva = idReserva;
        this.usuarioReserva = usuarioReserva;
    }

    public EstadoReserva getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(EstadoReserva estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Usuario getUsuarioReserva() {
        return usuarioReserva;
    }

    public void setUsuarioReserva(Usuario usuarioReserva) {
        this.usuarioReserva = usuarioReserva;
    }


    @Override
    public String toString() {
        return "Reserva{" +
                "estadoReserva=" + estadoReserva +
                ", idReserva=" + idReserva +
                ", fechaReserva=" + fechaReserva +
                ", usuarioReserva=" + usuarioReserva +
                '}';
    }
}
