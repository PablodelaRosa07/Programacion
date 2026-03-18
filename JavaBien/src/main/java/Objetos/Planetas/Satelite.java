package Objetos.Planetas;

public class Satelite extends Astro {

    public Satelite(String nombre, double masa, double diametro, double pRot, double pTras, double dist) {
        super(nombre, masa, diametro, pRot, pTras, dist);
    }

    @Override
    public String toString() {
        return "Satélite: " + nombre + " | Masa: " + masa + " | Diámetro: " + diametro;
    }


}
