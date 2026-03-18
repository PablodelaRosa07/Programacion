package Objetos.Planetas;

public class GestionaSistemaSolar {
    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", 5.97e24, 12742, 24, 8760, 149600000);

        Satelite luna = new Satelite("Luna", 7.34e22, 3474, 655.7, 655.7, 384400);

        tierra.agregarSatelite(luna);

        System.out.println(tierra.toString());
        tierra.muestraInformacion();

        System.out.println("---------------------------");

        System.out.println(luna.toString());
        luna.muestraInformacion();

        Satelite otraLuna = new Satelite("Luna", 7.34e22, 3474, 655.7, 655.7, 384400);
        System.out.println("¿Son la misma Luna?: " + luna.equals(otraLuna));
    }
}
