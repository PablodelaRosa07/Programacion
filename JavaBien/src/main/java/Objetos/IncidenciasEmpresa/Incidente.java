package Objetos.IncidenciasEmpresa;

import java.time.LocalDate;

public class Incidente {

    private int identificadorNum;
    private String nombre;
    private String descripcion;
    private LocalDate fechaRegistro;
    private LocalDate fechaCierre;
    private String estado;
    private String criticidad;
    private Equipo equipoIncidencia;

    public Incidente(String criticidad, String descripcion, Equipo equipoIncidencia, String estado, String fechaCierre, String fechaRegistro, int identificadorNum, String nombre) {
        this.criticidad = criticidad;
        this.descripcion = descripcion;
        this.equipoIncidencia = equipoIncidencia;
        this.estado = estado;
       /* this.fechaCierre = fechaCierre;
        this.fechaRegistro = fechaRegistro;*/
        this.identificadorNum = identificadorNum;
        this.nombre = nombre;
    }


    public boolean esUrgente() {
        return this.criticidad.equalsIgnoreCase("GRAVE") ||
                this.criticidad.equalsIgnoreCase("CRITICA");
    }

    public int getIdentificadorNum() {
        return identificadorNum;
    }

    public void setIdentificadorNum(int identificadorNum) {
        this.identificadorNum = identificadorNum;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalDate getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(LocalDate fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCriticidad() {
        return criticidad;
    }

    public void setCriticidad(String criticidad) {
        this.criticidad = criticidad;
    }

    public Equipo getEquipoIncidencia() {
        return equipoIncidencia;
    }

    public void setEquipoIncidencia(Equipo equipoIncidencia) {
        this.equipoIncidencia = equipoIncidencia;
    }

    public void cerrarIncidencia() {
        this.estado = "CERRADA";
        this.fechaCierre = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Incidente{" +
                "criticidad='" + criticidad + '\'' +
                ", identificadorNum=" + identificadorNum +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                ", fechaCierre=" + fechaCierre +
                ", estado='" + estado + '\'' +
                ", equipoIncidencia=" + equipoIncidencia +
                '}';
    }
}

