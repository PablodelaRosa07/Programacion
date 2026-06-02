package BoletinMapas.Ejercicio1;

import java.util.Date;

public class EntradaVIP {

    private String codEntrada;
    private Date fechaEntrada;
    private TipoEntrada tipoEntrada;
    private EstadoEntrada estadoEntrada;

    public EntradaVIP(String codEntrada, EstadoEntrada estadoEntrada, Date fechaEntrada, TipoEntrada tipoEntrada) {
        this.codEntrada = codEntrada;
        this.estadoEntrada = estadoEntrada;
        this.fechaEntrada = fechaEntrada;
        this.tipoEntrada = tipoEntrada;
    }

    public String getCodEntrada() {
        return codEntrada;
    }

    public void setCodEntrada(String codEntrada) {
        this.codEntrada = codEntrada;
    }

    public EstadoEntrada getEstadoEntrada() {
        return estadoEntrada;
    }

    public void setEstadoEntrada(EstadoEntrada estadoEntrada) {
        this.estadoEntrada = estadoEntrada;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public TipoEntrada getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(TipoEntrada tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    @Override
    public String toString() {
        return "EntradaVIP{" +
                "codEntrada='" + codEntrada + '\'' +
                ", fechaEntrada=" + fechaEntrada +
                ", tipoEntrada=" + tipoEntrada +
                ", estadoEntrada=" + estadoEntrada +
                '}';
    }
}
