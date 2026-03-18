package Objetos.CadenaAlimenticia.Models;

public class Rapaz extends Animal {

    public Rapaz(String especie, String habitat) {
        super(especie, "rapaz", habitat);
        agregarADieta("serpiente");
        agregarADieta("roedor");
    }

    public boolean huir(Animal a) {
        return a.getFamilia().equals("leon");
    }
}

