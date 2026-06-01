package BoletinOrdenaciones.Ejercicio1;

import java.util.Date;
import java.util.Objects;

public class Animal {

    private String identificador;
    private String nombre;
    private String especie;
    private int edad;
    private ClasificacionComida clasificacionComida;
    private int fechaNacimiento;
    private double peso;
    private Medio medio;
    private ClasificacicionGestacion clasificacicionGestacion;

    public Animal(ClasificacicionGestacion clasificacicionGestacion, ClasificacionComida clasificacionComida, int edad, String especie, int fechaNacimiento, String identificador, Medio medio, String nombre, double peso) {
        this.clasificacicionGestacion = clasificacicionGestacion;
        this.clasificacionComida = clasificacionComida;
        this.edad = edad;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.identificador = identificador;
        this.medio = medio;
        this.nombre = nombre;
        this.peso = peso;
    }

    public ClasificacicionGestacion getClasificacicionGestacion() {
        return clasificacicionGestacion;
    }

    public void setClasificacicionGestacion(ClasificacicionGestacion clasificacicionGestacion) {
        this.clasificacicionGestacion = clasificacicionGestacion;
    }

    public ClasificacionComida getClasificacionComida() {
        return clasificacionComida;
    }

    public void setClasificacionComida(ClasificacionComida clasificacionComida) {
        this.clasificacionComida = clasificacionComida;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Medio getMedio() {
        return medio;
    }

    public void setMedio(Medio medio) {
        this.medio = medio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(identificador, animal.identificador) && Objects.equals(nombre, animal.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, nombre);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "clasificacicionGestacion=" + clasificacicionGestacion +
                ", identificador='" + identificador + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", clasificacionComida=" + clasificacionComida +
                ", fechaNacimiento=" + fechaNacimiento +
                ", peso=" + peso +
                ", medio=" + medio +
                '}';
    }
}
