package BoletinMapas.Ejercicio2;

import java.util.Objects;

public class Vehiculo {

    private String numVastidorVIN;
    private String numMatricula;
    private String marca;
    private String modelo;
    private int anyoFabricacion;
    private String propietarioActual;

    public Vehiculo(int anyoFabricacion, String marca, String modelo, String numMatricula, String numVastidorVIN, String propietarioActual) {
        this.anyoFabricacion = anyoFabricacion;
        this.marca = marca;
        this.modelo = modelo;
        this.numMatricula = numMatricula;
        this.numVastidorVIN = numVastidorVIN;
        this.propietarioActual = propietarioActual;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public void setAnyoFabricacion(int anyoFabricacion) {
        this.anyoFabricacion = anyoFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getNumVastidorVIN() {
        return numVastidorVIN;
    }

    public void setNumVastidorVIN(String numVastidorVIN) {
        this.numVastidorVIN = numVastidorVIN;
    }

    public String getPropietarioActual() {
        return propietarioActual;
    }

    public void setPropietarioActual(String propietarioActual) {
        this.propietarioActual = propietarioActual;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(numVastidorVIN, vehiculo.numVastidorVIN);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numVastidorVIN);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "anyoFabricacion=" + anyoFabricacion +
                ", numVastidorVIN='" + numVastidorVIN + '\'' +
                ", numMatricula='" + numMatricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", propietarioActual='" + propietarioActual + '\'' +
                '}';
    }
}
