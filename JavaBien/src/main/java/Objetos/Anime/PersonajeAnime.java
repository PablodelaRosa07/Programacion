package Objetos.Anime;

import java.util.Objects;

public class PersonajeAnime {

    private String nombre;
    private SerieAnime serie;
    int edad;
    private Transformacion transformacion;

    public void comer(){
        System.out.println("Está comiendo");
    }

    public void atacar(){
        System.out.println("Está atacando");
    }

    public boolean transformarse(PersonajeAnime origen, PersonajeAnime destino){
        boolean transformado = true;
        this.transformacion = new Transformacion(origen, destino);

        return transformado;

    }

    @Override
    public String toString() {
        return "PersonajeAnime{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", serie=" + serie +
                ", transformacion=" + transformacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonajeAnime that = (PersonajeAnime) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(serie, that.serie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, serie);
    }

    public PersonajeAnime(){
        this.nombre = nombre;
    }


    public PersonajeAnime(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public SerieAnime getSerie() {
        return serie;
    }

    public void setSerie(SerieAnime serie) {
        this.serie = serie;
    }

    public Transformacion getTransformacion() {
        return transformacion;
    }

    public void setTransformacion(Transformacion transformacion) {
        this.transformacion = transformacion;
    }
}
