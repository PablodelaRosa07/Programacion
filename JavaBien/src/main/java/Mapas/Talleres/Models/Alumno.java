package Mapas.Talleres.Models;

import java.util.Objects;

public class Alumno {

    private String nombreCompleto;
    private int edad;
    private int numTelefono;

    public Alumno(String nombreCompleto, int edad, int numTelefono) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.numTelefono = numTelefono;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombreCompleto, alumno.nombreCompleto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombreCompleto);
    }
}
