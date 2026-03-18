package Objetos.NominaEmpresa.Models;

import java.util.Date;

public class Proyecto {

    private String identificador;
    private String descripcion;
    private Date fechaInicio;
    private int numeroMesesDuracion;
    private double presupuesto;

    public Proyecto(String identificador, String descripcion, Date fechaInicio, int numeroMesesDuracion, double presupuesto) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.numeroMesesDuracion = numeroMesesDuracion;
        this.presupuesto = presupuesto;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getNumeroMesesDuracion() {
        return numeroMesesDuracion;
    }

    public void setNumeroMesesDuracion(int numeroMesesDuracion) {
        this.numeroMesesDuracion = numeroMesesDuracion;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
}
