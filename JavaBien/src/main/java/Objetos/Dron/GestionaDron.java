package Objetos.Dron;

public class GestionaDron {
    static void main(String[] args) {

        Dron dron1 = new Dron(20, "EN_REPOSO", "ABC123", 100, "Ninguna");
        Dron dron2 = new Dron(30, "EN_REPOSO", "DEF456", 89, "Ninguna");
        Ruta ruta1 = new Ruta("Avenida de la Constitución", "Correos", "EN_PREPARACION", 10);
        Ruta ruta2 = new Ruta("Calle Madrid", "Correos", "EN_PREPARACION", 12);

        dron1.asignarRuta(ruta1, ruta2);
        System.out.println("El paquete ha sido asignado a: " +ruta1);
        dron2.asignarRuta(ruta1, ruta2);
        System.out.println("El paquete ha sido asignado a: " +ruta2);

        


    }


}
