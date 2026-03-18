package Objetos.PruebaHerencia;

import java.util.Objects;

public abstract class Persona {
    private String dni;
    protected abstract void comer();

    public Persona(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                '}';
    }
}
