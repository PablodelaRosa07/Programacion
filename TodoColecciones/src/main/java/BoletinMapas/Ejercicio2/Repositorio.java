package BoletinMapas.Ejercicio2;

public class Repositorio {
    static void main(String[] args) {
        Repositorio repositorio = new Repositorio();

        RegistroTrafico registroTrafico = new RegistroTrafico();

        Vehiculo vehiculo1 = new Vehiculo(2008, "Ford", "Focus", "1965FZP", "123456789A", "Pablo");
        Vehiculo vehiculo2 = new Vehiculo(1999, "Kia", "Sportage", "1234ABC", "987654321B", "Javier");
        Vehiculo vehiculo3 = new Vehiculo(2008, "Ford", "Focus XL", "2007PLS", "11223344C", "Pablo");

        Rematriculacion rematriculacion1 = new Rematriculacion(1-1-2025, "1122AAA", "1965FZP", "123456789A");
        Rematriculacion rematriculacion2 = new Rematriculacion(1-5-2025, "3344BBB", "1234ABC", "987654321B");


        repositorio.agregarVehiculo(vehiculo1, registroTrafico);
        repositorio.agregarVehiculo(vehiculo2, registroTrafico);
        repositorio.agregarVehiculo(vehiculo3, registroTrafico);

        repositorio.registrarRematriculacion(vehiculo1, rematriculacion1, registroTrafico);
        repositorio.registrarRematriculacion(vehiculo2, rematriculacion2, registroTrafico);

        repositorio.buscarNumVIN("123456789A", registroTrafico);
        repositorio.buscarNumVIN("987654321B", registroTrafico);

        repositorio.registrosPorPropietario("Pablo", registroTrafico);

        repositorio.mostrarPorAnyo(2008, registroTrafico);

        repositorio.mostrarRematriculaciones(vehiculo1, registroTrafico);
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
                System.out.println(vehiculo+" ---- "+registroTrafico.getMapaVehiculos().get(vehiculo));
                contador = 1;
            }
        }
        if (contador == 0){
            System.out.println("VIN no encontrado");
        }
    }

    public void registrosPorPropietario(String nombre, RegistroTrafico registroTrafico){
        System.out.println("BUSCANDO PROPIETARIO");
        int contador = 0;
        for (Vehiculo vehiculo : registroTrafico.getMapaVehiculos().keySet()){
            if (vehiculo.getPropietarioActual().equals(nombre)){
                System.out.println(vehiculo+" ---- "+registroTrafico.getMapaVehiculos().get(vehiculo));
                contador = 1;
            }
        }
        if (contador == 0){
            System.out.println("Propietario no encontrado");
        }
    }

    public void mostrarPorAnyo(int anyo, RegistroTrafico registroTrafico){
        System.out.println("BUSCANDO AÑO");
        int contador = 0;
        for (Vehiculo vehiculo : registroTrafico.getMapaVehiculos().keySet()){
            if (vehiculo.getAnyoFabricacion() == anyo){
                System.out.println(vehiculo+" ---- "+registroTrafico.getMapaVehiculos().get(vehiculo));
                contador = 1;
            }
        }
        if (contador == 0){
            System.out.println("Anyo no encontrado");
        }
    }

    public void mostrarRematriculaciones(Vehiculo vehiculo, RegistroTrafico registroTrafico){
        System.out.println("BUSCANDO REMATRICULACIONES");
        System.out.println(registroTrafico.getMapaVehiculos().get(vehiculo));

    }
}
