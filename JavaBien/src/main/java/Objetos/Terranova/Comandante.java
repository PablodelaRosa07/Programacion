package Objetos.Terranova;

import java.util.Objects;

public class Comandante {
    private String dni;
    private String nombre;
    private String rango;

    public Comandante(String dni, String nombre, String rango) {
        this.dni = dni;
        this.nombre = nombre;
        this.rango = rango;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comandante that = (Comandante) o;
        return Objects.equals(dni, that.dni);
    }

    @Override
    public String toString() {
        return nombre + " (" + rango + ")";
    }
}