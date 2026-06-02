package BoletinMapas.Ejercicio2;

import java.util.Objects;

public class Rematriculacion {

    private String numVastidorVIN;
    private String matriculaInicial;
    private String matriculaFinal;
    private int fechaMatriculacion;

    public Rematriculacion(int fechaMatriculacion, String matriculaFinal, String matriculaInicial, String numVastidorVIN) {
        this.fechaMatriculacion = fechaMatriculacion;
        this.matriculaFinal = matriculaFinal;
        this.matriculaInicial = matriculaInicial;
        this.numVastidorVIN = numVastidorVIN;
    }

    public int getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(int fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getMatriculaFinal() {
        return matriculaFinal;
    }

    public void setMatriculaFinal(String matriculaFinal) {
        this.matriculaFinal = matriculaFinal;
    }

    public String getMatriculaInicial() {
        return matriculaInicial;
    }

    public void setMatriculaInicial(String matriculaInicial) {
        this.matriculaInicial = matriculaInicial;
    }

    public String getNumVastidorVIN() {
        return numVastidorVIN;
    }

    public void setNumVastidorVIN(String numVastidorVIN) {
        this.numVastidorVIN = numVastidorVIN;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rematriculacion that = (Rematriculacion) o;
        return fechaMatriculacion == that.fechaMatriculacion && Objects.equals(numVastidorVIN, that.numVastidorVIN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numVastidorVIN, fechaMatriculacion);
    }

    @Override
    public String toString() {
        return "Rematriculacion{" +
                "fechaMatriculacion=" + fechaMatriculacion +
                ", numVastidorVIN='" + numVastidorVIN + '\'' +
                ", matriculaInicial='" + matriculaInicial + '\'' +
                ", matriculaFinal='" + matriculaFinal + '\'' +
                '}';
    }
}
