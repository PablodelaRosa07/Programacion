package Clone.ReservaViajes;

import java.util.LinkedHashSet;
import java.util.Set;

public class RepositorioReservas {
    private Set<Reserva> coleccionReservas;

    public RepositorioReservas() {
        this.coleccionReservas = new LinkedHashSet<>();
    }

    public void añadirReserva(Reserva reserva) {
        coleccionReservas.add(reserva);
    }

    public Reserva obtenerReserva(int id) {
        Reserva encontrada = null;
        for (Reserva reserva : coleccionReservas) {
            if (reserva.getId() == id) {
                encontrada = reserva;
            }
        }
        return encontrada;
    }

    public void mostrarTodas() {
        if (coleccionReservas.isEmpty()) {
            System.out.println("No hay reservas.");
        } else {
            for (Reserva reserva : coleccionReservas) {
                System.out.println(reserva);
            }
        }
    }
    public Reserva cambiarAsiento(int id, int nuevoAsiento, boolean confirmar) {
        Reserva original = obtenerReserva(id);
        Reserva resultado = null;

        if (original != null) {
            if (confirmar) {
                original.setNumAsiento(nuevoAsiento);
                resultado = original;
            }
            else {
                resultado = new Reserva(original.getDestinoVuelo(), original.getId(), original.getNombrePasajero(), nuevoAsiento, original.getPrecioBillete());
                resultado.setId(original.getId());
            }
        }
        return resultado;
    }
}