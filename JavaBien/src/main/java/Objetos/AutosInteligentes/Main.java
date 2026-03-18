package Objetos.AutosInteligentes;

public class Main {
    public static void main(String[] args) {
        Conductor dueño = new Conductor("Pepe", 10);
        Conductor intruso = new Conductor("Ladrón", 1);

        Coche miCoche = new Coche("FutureCars", "Model S", "ABC-1234", dueño);

        System.out.println("Intento de arranque no autorizado");
        miCoche.arrancar(intruso);

        System.out.println("Intento de arranque del dueño");
        miCoche.arrancar(dueño);
        dueño.conducir();

        System.out.println("Monitoreo de seguridad en marcha");
        miCoche.setSensor(new Sensor(30, 80));

        miCoche.verificarSiDebeParar();

        System.out.println("Estado final del coche: " + miCoche.getEstado());
    }
}
