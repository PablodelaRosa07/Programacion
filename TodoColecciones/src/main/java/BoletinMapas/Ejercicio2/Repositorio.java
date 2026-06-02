package BoletinMapas.Ejercicio2;

public class Repositorio {
    static void main(String[] args) {
        Repositorio repositorio = new Repositorio();

        RegistroTrafico registroTrafico = new RegistroTrafico();

        Vehiculo vehiculo1 = new Vehiculo(2008, "Ford", "Focus", "1965FZP", "123456789A", "Pablo");
        Vehiculo vehiculo2 = new Vehiculo(1999, "Kia", "Sportage", "1234ABC", "987654321B", "Javier");

        Rematriculacion rematriculacion1 = new Rematriculacion(1-1-2025, "1122AAA", "1234POL", "123456789A");
        Rematriculacion rematriculacion2 = new Rematriculacion(1-5-2025, "3344BBB", "5678ASD", "987654321B");


        repositorio.agregarVehiculo(vehiculo1, registroTrafico);
        repositorio.agregarVehiculo(vehiculo2, registroTrafico);

        repositorio.registrarRematriculacion(vehiculo1, rematriculacion1, registroTrafico);
        repositorio.registrarRematriculacion(vehiculo2, rematriculacion2, registroTrafico);

        repositorio.buscarNumVIN("123456789A", registroTrafico);
    }

    public void agregarVehiculo(Vehiculo vehiculo, RegistroTrafico registroTrafico){
        System.out.println("AGREGANDO VEHICULO");
        if (!registroTrafico.getMapaVehiculos().containsKey(vehiculo)){
            registroTrafico.getMapaVehiculos().put(vehiculo, null);
            System.out.println("Vehiculo agregado: " +vehiculo.getModelo());
        }
        else {
            System.out.println("No se ha podido agregar porque ya estaba: " +vehiculo.getModelo());
        }
    }

    public void registrarRematriculacion(Vehiculo vehiculo, Rematriculacion rematriculacion, RegistroTrafico registroTrafico){
        System.out.println("AGREGANDO REMATRICULACION");
        if (registroTrafico.getMapaVehiculos().containsKey(vehiculo)){
            registroTrafico.getMapaVehiculos().put(vehiculo, rematriculacion);
            System.out.println("Rematriculacion asignada a: " +vehiculo.getModelo());
        }
        else {
            System.out.println("No existe el vehiculo: " +vehiculo.getModelo());
        }
    }

    public void buscarNumVIN(String numVIN, RegistroTrafico registroTrafico){
        System.out.println("BUSCANDO VIN");
        int contador = 0;
        for (Vehiculo vehiculo : registroTrafico.getMapaVehiculos().keySet()){
            if (vehiculo.getNumVastidorVIN().equals(numVIN)){
                System.out.println(vehiculo);
                contador = 1;
            }
        }
        if (contador == 0){
            System.out.println("VIN no encontrado");
        }
    }


}
