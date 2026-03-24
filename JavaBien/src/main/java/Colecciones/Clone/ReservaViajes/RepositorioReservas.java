package Colecciones.Clone.ReservaViajes;

import java.util.LinkedHashSet;
import java.util.Set;

public class RepositorioReservas {
    private Set<Reserva> reservas = new LinkedHashSet<>();

    public void añadirReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public Reserva obtenerPorId(int id) {
        for (Reserva reserva : reservas) {
            if (reserva.getId() == id) return reserva;
        }
        return null;
    }

    public void mostrarReservas() {
        if (reservas.isEmpty()) System.out.println("No hay reservas.");
        for (Reserva reserva : reservas) System.out.println(reserva);
    }

    public Reserva cambiarAsiento(int id, String nuevoAsiento, boolean confirmar) {
        Reserva original = obtenerPorId(id);
        if (original == null) return null;

        if (confirmar) {
            original.setAsiento(nuevoAsiento);
            return original;
        } else {
            // Devolvemos una copia para simular sin alterar el original
            Reserva simulacion = new Reserva(original);
            simulacion.setAsiento(nuevoAsiento);
            return simulacion;
        }
    }
}