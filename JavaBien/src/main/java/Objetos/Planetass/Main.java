package Objetos.Planetass;

public class Main {
    public static void main(String[] args) {

        Planeta tierra = new Planeta("Tierra", 5.97e24, 12742, 24, 8760, 0);
        Satelite luna = new Satelite("Luna", 7.35e22, 3474, 655, 655, 384400, tierra);

        tierra.agregarSatelite(luna);

        muestraInfo.muestraInformacion(tierra);
        muestraInfo.muestraInformacion(luna);

    }
}
