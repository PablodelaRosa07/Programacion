package Clone.EmpresaCoches;

import java.util.Objects;

public class Coche implements  Cloneable{

    private String matricula;
    private String modelo;
    private int kilometraje;
    private Motor motor; //objeto motor

    public Coche(int kilometraje, String matricula, String modelo, Motor motor) {
        this.kilometraje = kilometraje;
        this.matricula = matricula;
        this.modelo = modelo;
        this.motor = motor;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return Objects.equals(matricula, coche.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "kilometraje=" + kilometraje +
                ", matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor=" + motor +
                '}';
    }

    @Override
    public Coche clone() {
        try {
            Coche clone = (Coche) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
