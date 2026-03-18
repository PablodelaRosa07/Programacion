package Objetos.Terranova;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.DayOfWeek;

public class Exploracion extends Mision {
    private String destino;
    private int tripulacion;

    public Exploracion(int cod, String nom, LocalDate fec, Nave nav, String destino, int tri) {
        super(cod, nom, fec, nav);
        this.destino = destino;
        this.tripulacion = tri;
    }

    @Override
    public boolean esMisionDeRiesgo() {
        long diasParaLanzamiento = ChronoUnit.DAYS.between(LocalDate.now(), getFechaLanzamiento());
        return destino.equalsIgnoreCase("Marte") || (diasParaLanzamiento <= 7);
    }

    @Override
    public String toString() { return "[Exploración] " + super.toString(); }
}