package Objetos.Terranova;

import java.time.LocalDate;
import java.util.ArrayList;

public class ControlMisiones {
    public static void main(String[] args) {
        Comandante c1 = new Comandante("12345678A", "Shepard", "COMANDANTE");
        Nave n1 = new Nave("NCC-1701", "Enterprise", 500, c1);
        Nave n2 = new Nave("MILL-01", "Halcón Milenario", 1200, c1);

        ArrayList<Mision> calendario = new ArrayList<>();

        calendario.add(new Exploracion(101, "Red One", LocalDate.now().plusMonths(1), n1, "Marte", 5));
        calendario.add(new Exploracion(102, "Moon Walk", LocalDate.now().plusDays(3), n2, "Luna", 3));
        calendario.add(new Logistica(201, "Suministros A", LocalDate.now().plusDays(10), n1, 20.5));
        calendario.add(new Logistica(202, "Heavy Metal", LocalDate.of(2026, 2, 21), n2, 80.0));

        System.out.println("--- INFORME DE MISIONES DE RIESGO ---");
        for (Mision m : calendario) {
            if (m.esMisionDeRiesgo()) {
                System.out.println(m);
            }
        }
    }
}