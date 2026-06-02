package BoletinMapas.Ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class RegistroTrafico {

    private Map<Vehiculo, Rematriculacion> mapaVehiculos;

    public RegistroTrafico() {
        this.mapaVehiculos = new HashMap<>();
    }

    public Map<Vehiculo, Rematriculacion> getMapaVehiculos() {
        return mapaVehiculos;
    }

    public void setMapaVehiculos(Map<Vehiculo, Rematriculacion> mapaVehiculos) {
        this.mapaVehiculos = mapaVehiculos;
    }

    @Override
    public String toString() {
        return "RegistroTrafico{" +
                "mapaVehiculos=" + mapaVehiculos +
                '}';
    }
}
