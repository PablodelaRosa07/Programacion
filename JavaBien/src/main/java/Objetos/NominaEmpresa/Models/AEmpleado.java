package Objetos.NominaEmpresa.Models;

import java.util.Objects;

public abstract class AEmpleado {
    private String id;
    private String nombre;
    private double salarioBase;
    private boolean tieneReduccion;

    public AEmpleado(String id, String nombre, double salarioBase, boolean tieneReduccion) {
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.tieneReduccion = tieneReduccion;
    }

    public abstract void imprimeHorario();
    public abstract String devuelveFunciones();
    public abstract double calcularNomina();

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getSalarioBase() { return salarioBase; }
    public boolean isTieneReduccion() { return tieneReduccion; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AEmpleado aEmpleado = (AEmpleado) o;
        return Objects.equals(id, aEmpleado.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("ID: %s | Nombre: %s | Salario Total: %.2f€",
                id, nombre, calcularNomina());
    }
}