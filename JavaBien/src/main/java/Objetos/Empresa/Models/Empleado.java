package Objetos.Empresa.Models;

import java.util.Objects;

public abstract class Empleado{

    private String DNI;
    private String nombre;
    private int sueldo;

    public Empleado(String DNI, String nombre, int sueldo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return sueldo == empleado.sueldo && Objects.equals(DNI, empleado.DNI) && Objects.equals(nombre, empleado.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DNI, nombre, sueldo);
    }


}
