package Objetos.Vehiculo;

public class GestionaVehiculos {
    public static void main(String[] args) {
        Vehiculo cocheEco = new Automovil("1234ECO", "ECO");
        Vehiculo cocheC = new Automovil("5678CCC", "C");

        System.out.println("COCHE ECO en Madrid: " + cocheEco.tieneLimitacionParaCircular("Madrid")); // false
        System.out.println("COCHE C en Madrid: " + cocheC.tieneLimitacionParaCircular("Madrid"));     // true
        System.out.println("COCHE C en Sevilla: " + cocheC.tieneLimitacionParaCircular("Sevilla"));   // true

        System.out.println("---");

        Vehiculo camionLigero = new Camion("LIG-999", "B", 500, 2);

        Vehiculo camionPesado = new Camion("PES-111", "C", 5000, 7);

        System.out.println("Camión 500kg Licencia: " + camionLigero.getLicencias());
        System.out.println("Camión 5000kg/7pax Licencia: " + camionPesado.getLicencias()); // Debería ser C1

        Vehiculo tesla = new CocheElectrico("TES-001", "ECO", "NCM");
        System.out.println("Tesla Licencia: " + tesla.getLicencias());
    }
}
