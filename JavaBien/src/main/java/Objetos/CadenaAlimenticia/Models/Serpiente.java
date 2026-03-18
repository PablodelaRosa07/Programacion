package Objetos.CadenaAlimenticia.Models;

public class Serpiente extends Animal {

    public Serpiente(String especie, String habitat) {
        super(especie, "serpiente", habitat);
        agregarADieta("roedor");
    }

    public boolean huir(Animal a) {
        return false;
    }
}

