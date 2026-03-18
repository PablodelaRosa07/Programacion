package Objetos.Terranova;

import java.time.LocalDate;

public abstract class Mision {
    private int codigoNumerico;
    private String nombreClave;
    private LocalDate fechaLanzamiento;
    private Nave naveAsignada;
    private String estado;

    public Mision(int codigoNumerico, String nombreClave, LocalDate fechaLanzamiento, Nave naveAsignada) {
        if (fechaLanzamiento.isBefore(LocalDate.now())) {
            System.out.println("La fecha no puede ser pasada.");
        }
        this.codigoNumerico = codigoNumerico;
        this.nombreClave = nombreClave;
        this.fechaLanzamiento = fechaLanzamiento;
        this.naveAsignada = naveAsignada;
        this.estado = "PLANIFICADA";
    }

    public abstract boolean esMisionDeRiesgo();

    @Override
    public String toString() {
        return String.format("%d: %s - %s (%s) -> %s", codigoNumerico, nombreClave, fechaLanzamiento, estado, naveAsignada);
    }

    public int getCodigoNumerico() {
        return codigoNumerico;
    }

    public void setCodigoNumerico(int codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Nave getNaveAsignada() {
        return naveAsignada;
    }

    public void setNaveAsignada(Nave naveAsignada) {
        this.naveAsignada = naveAsignada;
    }

    public String getNombreClave() {
        return nombreClave;
    }

    public void setNombreClave(String nombreClave) {
        this.nombreClave = nombreClave;
    }

    public LocalDate getFechaLanzamiento() { return fechaLanzamiento; }
}