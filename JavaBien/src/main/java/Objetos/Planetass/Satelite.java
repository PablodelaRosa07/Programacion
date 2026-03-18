package Objetos.Planetass;

public class Satelite extends Astro {

    private Planeta planetaPadre;

    public Satelite(String nombre, double masa, double diametro, double periodoRotacion, double periodoTraslacion, double distanciaMedia, Planeta planetaPadre){
        super(nombre, masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia);
        setTipo(Tipo.SATELITE);
        this.planetaPadre = planetaPadre;
    }

    public Planeta getPlanetaPadre(){
        return planetaPadre;
    }

    @Override
    public String toString() {
        return "Satélite: " + getNombre() + " | Masa: " + getMasa() + " | Diámetro: " + getDiametro();
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Orbita alrededor de: " + planetaPadre.getNombre());
    }
}
