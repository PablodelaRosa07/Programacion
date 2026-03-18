package Objetos.CadenaAlimenticia.Models;

public abstract class Animal {
    private String especie;
    private String familia;
    private String habitat;
    private String[] dieta = new String[10];
    private String[] depredadores = new String[10];
    private int numDieta = 0;
    private int numDepredadores = 0;

    public Animal(String especie, String familia, String habitat) {
        this.especie = especie;
        this.familia = familia;
        this.habitat = habitat;
    }

    public void agregarADieta(String familiaAnimal) {
        if (numDieta < 10) {
            dieta[numDieta++] = familiaAnimal;
        }
    }

    public void agregarADepredador(String familiaAnimal) {
        if (numDepredadores < 10) {
            depredadores[numDepredadores++] = familiaAnimal;
        }
    }

    public boolean atacar(Animal a) {
        if (this.especie.equals(a.getEspecie())) {
            return false;
        }
        for (int i = 0; i < numDieta; i++) {
            if (dieta[i].equals(a.getFamilia())) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean huir(Animal a);

    public String getEspecie() {
        return especie;
    }
    public String getFamilia() {
        return familia;
    }
}