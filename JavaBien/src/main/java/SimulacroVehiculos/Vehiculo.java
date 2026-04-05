package SimulacroVehiculos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Vehiculo {
    private String vin; // Identificador único
    private String matricula;
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private String propietarioActual;
    private List<Rematriculacion> historialRematriculaciones;

    public Vehiculo(String vin, String matricula, String marca, String modelo, int anioFabricacion, String propietarioActual) {
        this.vin = vin;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.propietarioActual = propietarioActual;
        this.historialRematriculaciones = new ArrayList<>();
    }

    public String getVin() { return vin; }
    public String getMatricula() { return matricula; }
    public String getPropietarioActual() { return propietarioActual; }
    public List<Rematriculacion> getHistorial() { return historialRematriculaciones; }

    public void rematricular(String nuevaMatricula, LocalDate fecha) {
        for (Rematriculacion r : historialRematriculaciones) {
            if (r.getFecha().equals(fecha)) {
                throw new IllegalArgumentException("Error: Ya existe una rematriculación registrada para este vehículo en la fecha " + fecha);
            }
        }

        Rematriculacion registro = new Rematriculacion(this.vin, this.matricula, nuevaMatricula, fecha);
        historialRematriculaciones.add(registro);

        this.matricula = nuevaMatricula;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "vin='" + vin + '\'' +
                ", matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anioFabricacion=" + anioFabricacion +
                ", propietarioActual='" + propietarioActual + '\'' +
                ", historialRematriculaciones=" + historialRematriculaciones +
                '}';
    }
}
