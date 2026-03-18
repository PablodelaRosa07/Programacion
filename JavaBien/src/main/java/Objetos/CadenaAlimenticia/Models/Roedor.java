package Objetos.CadenaAlimenticia.Models;

public class Roedor extends Animal {

    public Roedor(String especie, String habitat) {
        super(especie, "roedor", habitat);
    }

    public boolean huir(Animal a) {
        return a.getFamilia().equals("serpiente");
    }
}
