package Objetos.Terranova;

import java.util.Objects;

public class Nave {
    private String codigoRegistro;
    private String modelo;
    private int horasVuelo;
    private Comandante responsable;

    public Nave(String codigoRegistro, String modelo, int horasVuelo, Comandante responsable) {
        this.codigoRegistro = codigoRegistro;
        this.modelo = modelo;
        this.horasVuelo = horasVuelo;
        this.responsable = responsable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nave nave = (Nave) o;
        return Objects.equals(codigoRegistro, nave.codigoRegistro);
    }

    @Override
    public String toString() {
        return "Nave " + codigoRegistro + " [Cmdte: " + responsable + "]";
    }

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    public int getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(int horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Comandante getResponsable() {
        return responsable;
    }

    public void setResponsable(Comandante responsable) {
        this.responsable = responsable;
    }
}