package Objetos.Videojuego;

class Caballero extends Personaje {
    public Caballero(String nombre) { super(nombre, 1, 150); }

    @Override
    public String getArma() { return "Espada"; }

    @Override
    public boolean esAtacado(Personaje a) {
        return (a instanceof Mago || a instanceof Arquero);
    }

    @Override
    public boolean esAtacado(Personaje a, int d) {
        if (a instanceof Mago) return true;
        if (a instanceof Arquero && d > 100) return true;
        return false;
    }
}