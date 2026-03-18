package Objetos.Planetass;

import java.util.Objects;

public class Astro {

    public enum Tipo { ASTRO, PLANETA, SATELITE }

    private String nombre;
    private double masa;
    private double diametro;
    private double periodoRotacion;
    private double periodoTraslacion;
    private double distanciaMedia;
    private Tipo tipo;

    public Astro(String nombre, double masa, double diametro, double periodoRotacion, double periodoTraslacion, double distanciaMedia) {

        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
        this.periodoRotacion = periodoRotacion;
        this.periodoTraslacion = periodoTraslacion;
        this.distanciaMedia = distanciaMedia;
        this.tipo = Tipo.ASTRO;
    }

    public String getNombre(){
        return nombre;
    }

    public double getMasa(){
        return masa;
    }

    public double getDiametro(){
        return diametro;
    }

    public double getPeriodoRotacion(){
        return periodoRotacion;
    }

    public double getPeriodoTraslacion(){
        return periodoTraslacion;
    }

    public double getDistanciaMedia(){
        return distanciaMedia;
    }

    public Tipo getTipo(){
        return tipo;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setMasa(double masa){
        this.masa = masa;
    }

    public void setDiametro(double diametro){
        this.diametro = diametro;
    }

    public void setPeriodoRotacion(double periodoRotacion){
        this.periodoRotacion = periodoRotacion;
    }

    public void setPeriodoTraslacion(double periodoTraslacion){
        this.periodoTraslacion = periodoTraslacion;
    }

    public void setDistanciaMedia(double distanciaMedia){
        this.distanciaMedia = distanciaMedia;
    }

    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }


    @Override
    public String toString(){
        return "Astro: " + nombre + " | Masa: " + masa + " | Diámetro: " + diametro;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Astro)) return false;

        Astro otro = (Astro) obj;
        return this.nombre.equals(otro.nombre) && this.masa == otro.masa && this.distanciaMedia == otro.distanciaMedia;
    }

    public void mostrarInformacion(){
        System.out.println(toString());
        System.out.println("Periodo de rotación: " + periodoRotacion + " h");
        System.out.println("Periodo de traslación: " + periodoTraslacion + " h");
        System.out.println("Distancia media: " + distanciaMedia + " km");
    }
}