package Objetos.Planetass;

import java.util.ArrayList;
import java.util.List;

public class Planeta extends Astro {

    private List<Satelite> satelites;

    public Planeta(String nombre, double masa, double diametro, double periodoRotacion, double periodoTraslacion, double distanciaMedia){
        super(nombre, masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia);
        setTipo(Tipo.PLANETA);
        this.satelites = new ArrayList<>();
    }

    public void agregarSatelite(Satelite s){
        satelites.add(s);
    }

    public List<Satelite> getSatelites(){
        return satelites;
    }

    @Override
    public String toString(){
        return "Planeta: " + getNombre() + " | Masa: " + getMasa() + " | Diámetro: " + getDiametro();
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Número de satélites: " + satelites.size());
        for (Satelite s : satelites) {
            System.out.println(" - " + s.getNombre());
        }
    }

}