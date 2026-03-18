package Objetos.JuegodeMesa;

public class Participante {

    private String nick;
    private String nombre;
    private int edad;
    private double puntuacion;


    //Constructor

    public Participante(int edad, String nick, String nombre, double puntuacion) {
        this.edad = edad;
        this.nick = nick;
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }


    //Setter y getter

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "edad=" + edad +
                ", nick='" + nick + '\'' +
                ", nombre='" + nombre + '\'' +
                ", puntuacion=" + puntuacion +
                '}';
    }
}


