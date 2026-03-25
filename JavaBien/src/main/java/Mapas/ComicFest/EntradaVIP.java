package Mapas.ComicFest;

import java.util.Date;

public class EntradaVIP {

    private String codigoEntrada;
    private Date fechaEntrada;
    private TipoEntrada tipoEntrada;
    private EstadoEntrada estadoEntrada;

    public EntradaVIP(String codigoEntrada, EstadoEntrada estadoEntrada, Date fechaEntrada, TipoEntrada tipoEntrada) {
        this.codigoEntrada = codigoEntrada;
        this.estadoEntrada = estadoEntrada;
        this.fechaEntrada = fechaEntrada;
        this.tipoEntrada = tipoEntrada;
    }

    public String getCodigoEntrada() {
        return codigoEntrada;
    }

    public void setCodigoEntrada(String codigoEntrada) {
        this.codigoEntrada = codigoEntrada;
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


}
