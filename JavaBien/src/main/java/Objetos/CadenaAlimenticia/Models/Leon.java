package Objetos.CadenaAlimenticia.Models;

public class Leon extends Animal {

    public Leon(String especie, String habitat) {
        super(especie, "leon", habitat);
        agregarADieta("rapaz");
        agregarADieta("serpiente");
        agregarADieta("roedor");
    }

    public boolean huir(Animal a) {
        return false;
    }
}
