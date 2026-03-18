package Objetos.Videojuego;

class Arquero extends Personaje {
    public Arquero(String nombre) { super(nombre, 1, 80); }

    @Override
    public String getArma() { return "Flecha"; }

    @Override
    public boolean esAtacado(Personaje a) {
        return (a instanceof Mago);
    }

    @Override
    public boolean esAtacado(Personaje a, int d) {
        if (a instanceof Mago) return true;
        if (a instanceof Caballero && d < 50) return true;
        return false;
    }
}