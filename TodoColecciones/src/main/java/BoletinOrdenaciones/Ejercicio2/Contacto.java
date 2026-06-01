package BoletinOrdenaciones.Ejercicio2;

import java.util.Objects;

public class Contacto implements Comparable<Contacto>{

    private String nombre;
    private String apellidos;
    private String email;
    private String direccion;
    private int numTelefono;

    public Contacto(String nombre, String apellidos, String email, String direccion, int numTelefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.direccion = direccion;
        this.numTelefono = numTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }


    @Override
    public int compareTo(Contacto otroContacto) {
        int resultado = this.nombre.compareTo(otroContacto.getNombre());
        if (resultado == 0){
            resultado = this.apellidos.compareTo(otroContacto.getApellidos());
        }
        return resultado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(nombre, contacto.nombre) && Objects.equals(apellidos, contacto.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos);
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numTelefono=" + numTelefono +
                '}';
    }
}
