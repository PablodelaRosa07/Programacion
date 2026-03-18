package Objetos.Planetas;
import java.util.ArrayList;
import java.util.List;

public class Planeta extends Astro {
    private List<Satelite> satelites;

    public Planeta(String nombre, double masa, double diametro, double pRot, double pTras, double dist) {
        super(nombre, masa, diametro, pRot, pTras, dist);
        this.satelites = new ArrayList<>();
    }

    public void agregarSatelite(Satelite s){
        satelites.add(s);
    }

    @Override
    public String toString(){
        return "Planeta: " + nombre + " | Masa: " + masa + " | Diámetro: " + diametro;
    }

    @Override
    public void muestraInformacion() {
        super.muestraInformacion();
        if (satelites.isEmpty()) {
            System.out.println("No tiene satélites conocidos.");
        }
        else {
            System.out.println("Satélites de " + nombre + ":");
            for (Satelite s : satelites) {
                System.out.println(" - " + s.getNombre());
            }
        }
    }
}