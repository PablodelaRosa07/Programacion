package Objetos.Terranova;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.DayOfWeek;


public class Logistica extends Mision {
    private double carga;

    public Logistica(int cod, String nom, LocalDate fec, Nave nav, double carga) {
        super(cod, nom, fec, nav);
        this.carga = carga;
    }

    @Override
    public boolean esMisionDeRiesgo() {
        DayOfWeek dia = getFechaLanzamiento().getDayOfWeek();
        boolean esFinDeSemana = (dia == DayOfWeek.SATURDAY || dia == DayOfWeek.SUNDAY);
        return (carga > 50) && esFinDeSemana;
    }

    @Override
    public String toString() { return "[Logística] " + super.toString(); }
}