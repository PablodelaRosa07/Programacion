package BoletinSimulaciones.Ejercicio2.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Alumno {
    private int id; // Autogenerado
    private static int numeroAlumnos;
    private String nombre;
    private String apellidos;
    private int edad;
    private String telefono;
    private List<String> alergias;
    private boolean autorizaImagenes;
    private Maestro maestro;

    public Alumno(int id, String nombre, String apellidos, int edad, String telefono, boolean autorizaImagenes, Maestro maestro) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.telefono = telefono;
        this.alergias = new ArrayList<>();
        this.autorizaImagenes = autorizaImagenes;
        this.maestro = maestro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public static void setNumeroAlumnos(int numeroAlumnos) {
        Alumno.numeroAlumnos = numeroAlumnos;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<String> alergias) {
        this.alergias = alergias;
    }

    public boolean isAutorizaImagenes() {
        return autorizaImagenes;
    }

    public void setAutorizaImagenes(boolean autorizaImagenes) {
        this.autorizaImagenes = autorizaImagenes;
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(apellidos, alumno.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", telefono='" + telefono + '\'' +
                ", alergias=" + alergias +
                ", autorizaImagenes=" + autorizaImagenes +
                ", maestro=" + maestro +
                '}';
    }
}
