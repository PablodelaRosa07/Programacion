package Objetos.CuentaBancaria;

import Objetos.Refactoriza.Models.Cliente;

import java.util.Objects;

public class Persona {

    private String dni;
    private String nombre;
    private String apellido;
    private int fechaNacimiento;

    public void mayorEdad(){
        if (2026-fechaNacimiento >= 18){
            System.out.println("Es mayor de edad");
        }
    }

    public Persona(String apellido, String dni, int fechaNacimiento, String nombre) {
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    public void añadirRol(Cliente cliente) {
    }
}
