package SimulacroAgenda;

import java.util.Objects;

public class Contacto implements Comparable<Contacto> {
    private String nombre;
    private String apellidos;
    private String email;
    private String direccion;
    private String telefono;

    public Contacto(String nombre, String apellidos, String email, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public String getEmail() { return email; }
    public String getTelefono() { return telefono; }

    @Override
    public int compareTo(Contacto otro) {
        int comparacionNombre = this.nombre.compareToIgnoreCase(otro.nombre);
        if (comparacionNombre != 0) {
            return comparacionNombre;
        }
        return this.apellidos.compareToIgnoreCase(otro.apellidos);
    }

    @Override
    public String toString() {
        return String.format("%s %s | Tel: %s | Email: %s", nombre, apellidos, telefono, email);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contacto)) return false;
        Contacto contacto = (Contacto) o;
        return nombre.equalsIgnoreCase(contacto.nombre) &&
                apellidos.equalsIgnoreCase(contacto.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre.toLowerCase(), apellidos.toLowerCase());
    }
}