package Objetos.Vehiculo2;

public class GestionaVehiculos {
    public static void main(String[] args) {
        // Automóviles
        Vehiculo autoEco = new Automovil("1111AAA", "Toyota", "Corolla", "ECO");
        Vehiculo autoC = new Automovil("2222BBB", "Seat", "Ibiza", "C");

        // Camiones
        Vehiculo camionPeque = new Camion("3333CCC", "Iveco", "Daily", "B", 500, 2);
        Vehiculo camionGrande = new Camion("4444DDD", "Volvo", "FH", "C", 5000, 7);

        // Pruebas de Limitación
        System.out.println("--- Pruebas de Limitación ---");
        System.out.println("Auto ECO en Madrid: " + autoEco.tieneLimitacion("Madrid")); // false
        System.out.println("Auto C en Sevilla: " + autoC.tieneLimitacion("Sevilla"));   // true

        // Pruebas de Licencias
        System.out.println("\n--- Pruebas de Licencias ---");
        System.out.println("Camion 500kg: " + camionPeque.getLicencias());
        System.out.println("Camion 5000kg (7 pax): " + camionGrande.getLicencias()); // C1
    }
}
