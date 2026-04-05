package SimulacroVehiculos;

import java.time.LocalDate;

class Rematriculacion {
    private String vin;
    private String matriculaInicial;
    private String matriculaFinal;
    private LocalDate fechaMatriculacion;

    public Rematriculacion(String vin, String matriculaInicial, String matriculaFinal, LocalDate fechaMatriculacion) {
        this.vin = vin;
        this.matriculaInicial = matriculaInicial;
        this.matriculaFinal = matriculaFinal;
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getVin() { return vin; }
    public String getMatriculaInicial() { return matriculaInicial; }
    public String getMatriculaFinal() { return matriculaFinal; }
    public LocalDate getFecha() { return fechaMatriculacion; }

    @Override
    public String toString() {
        return "Rematriculacion{" +
                "vin='" + vin + '\'' +
                ", matriculaInicial='" + matriculaInicial + '\'' +
                ", matriculaFinal='" + matriculaFinal + '\'' +
                ", fechaMatriculacion=" + fechaMatriculacion +
                '}';
    }
}