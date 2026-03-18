package Objetos.Videojuego;

public class Personaje {
    protected String nombre;
    protected int nivel;
    protected int hp;

    public Personaje(String nombre, int nivel, int hp) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.hp = hp;
    }

    public String getArma() {
        return "Ninguna";
    }

    public boolean esAtacado(Personaje atacante){
        return true;
    }

    public boolean esAtacado(Personaje atacante, int distancia){
        return true;
    }

    public String getNombre() {
        return nombre;
    }
}
