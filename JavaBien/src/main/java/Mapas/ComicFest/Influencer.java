package Mapas.ComicFest;

import java.util.Objects;

public class Influencer {

    private String nombre;
    private String nick;
    private int numSeguidores;
    private String plataforma;

    public Influencer(String nick, String nombre, int numSeguidores, String plataforma) {
        this.nick = nick;
        this.nombre = nombre;
        this.numSeguidores = numSeguidores;
        this.plataforma = plataforma;
    }

    public Influencer(String nick, String plataforma) {
        this.nick = nick;
        this.plataforma = plataforma;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumSeguidores() {
        return numSeguidores;
    }

    public void setNumSeguidores(int numSeguidores) {
        this.numSeguidores = numSeguidores;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Influencer that = (Influencer) o;
        return Objects.equals(nick, that.nick) && Objects.equals(plataforma, that.plataforma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, plataforma);
    }

    @Override
    public String toString() {
        return "Influencer{" +
                "nick='" + nick + '\'' +
                ", nombre='" + nombre + '\'' +
                ", numSeguidores=" + numSeguidores +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }
}
