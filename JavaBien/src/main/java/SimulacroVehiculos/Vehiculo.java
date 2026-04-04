package SimulacroVehiculos;

import java.util.Objects;

public class Vehiculo {

    private String numBastidor;
    private int numMatricula;
    private String marca;
    private String modelo;
    private int anyoFabricacion;
    private String propietarioActual;

    public Vehiculo(String numBastidor, int numMatricula, String marca, String modelo, int anyoFabricacion, String propietarioActual) {
        this.numBastidor = numBastidor;
        this.numMatricula = numMatricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anyoFabricacion = anyoFabricacion;
        this.propietarioActual = propietarioActual;
    }

    public String getNumBastidor() {
        return numBastidor;
    }

    public void setNumBastidor(String numBastidor) {
        this.numBastidor = numBastidor;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
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

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public void setAnyoFabricacion(int anyoFabricacion) {
        this.anyoFabricacion = anyoFabricacion;
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
        return Objects.equals(numBastidor, vehiculo.numBastidor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numBastidor);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "numBastidor='" + numBastidor + '\'' +
                ", numMatricula=" + numMatricula +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anyoFabricacion=" + anyoFabricacion +
                ", propietarioActual='" + propietarioActual + '\'' +
                '}';
    }
}
