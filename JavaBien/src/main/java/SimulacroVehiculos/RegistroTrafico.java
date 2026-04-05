package SimulacroVehiculos;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class RegistroTrafico {
    private Map<String, Vehiculo> vehiculos = new HashMap<>();

    public void registrarVehiculo(String vin, String mat, String marca, String mod, int anio, String prop) {
        if (!vehiculos.containsKey(vin)) {
            vehiculos.put(vin, new Vehiculo(vin, mat, marca, mod, anio, prop));
        } else {
            System.out.println("Error: El VIN " + vin + " ya está en el sistema.");
        }
    }

    public void rematricular(String vin, String nuevaMatricula, LocalDate fecha) {
        Vehiculo vehiculo = vehiculos.get(vin);
        if (vehiculo != null) {
            vehiculo.rematricular(nuevaMatricula, fecha);
        } else {
            System.out.println("Error: El vehículo con VIN " + vin + " no existe.");
        }
    }

    public void mostrarDetalleVehiculo(String vin) {
        Vehiculo vehiculo = vehiculos.get(vin);
        if (vehiculo != null) {
            System.out.println(vehiculo);
            if (vehiculo.getHistorial().isEmpty()) {
                System.out.println("Sin historial de rematriculaciones.");
            } else {
                vehiculo.getHistorial().forEach(System.out::println);
            }
        } else {
            System.out.println("No se encontró el vehículo solicitado.");
        }
    }

    public void listarPorPropietario(String propietario) {
        System.out.println("Listado para: " + propietario);
        List<Vehiculo> lista = vehiculos.values().stream()
                .filter(v -> v.getPropietarioActual().equalsIgnoreCase(propietario))
                .sorted(Comparator.comparing(Vehiculo::getMatricula))
                .collect(Collectors.toList());

        if (lista.isEmpty()) {
            System.out.println("No hay vehículos registrados para este propietario.");
        } else {
            lista.forEach(System.out::println);
        }
    }

    public void listarRematriculadosEnAnio(int anio) {
        System.out.println("--- Vehículos rematriculados en " + anio + " ---");
        List<Vehiculo> filtrados = vehiculos.values().stream()
                .filter(v -> v.getHistorial().stream().anyMatch(r -> r.getFecha().getYear() == anio))
                .collect(Collectors.toList());

        if (filtrados.isEmpty()) {
            System.out.println("No hay registros en ese año.");
        } else {
            filtrados.forEach(System.out::println);
        }
    }
}