package Objetos.AutosInteligentes;

public class Conductor {
    private String nombre;
    private int añosExperiencia;

    public Conductor(String nombre, int añosExperiencia) {
        this.nombre = nombre;
        this.añosExperiencia = añosExperiencia;
    }

    public void conducir() {
        System.out.println(this.nombre + " conduciendo");
    }

    public String getNombre() {
        return nombre;
    }
}

