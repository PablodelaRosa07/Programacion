package Objetos.Planetas;

import java.util.Objects;

public class Astro {
    protected String nombre;
    protected double masa;
    protected double diametro;
    protected double periodoRotacion;
    protected double periodoTraslacion;
    protected double distanciaMedia;

    public Astro(String nombre, double masa, double diametro, double periodoRotacion,
                 double periodoTraslacion, double distanciaMedia) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
        this.periodoRotacion = periodoRotacion;
        this.periodoTraslacion = periodoTraslacion;
        this.distanciaMedia = distanciaMedia;
    }

    public String getNombre(){
        return nombre; }
    public void setNombre(String nombre){
        this.nombre = nombre; }
    public double getMasa(){
        return masa; }
    public double getDistanciaMedia(){
        return distanciaMedia;
    }

    @Override
    public String toString(){
        return "Astro: " + nombre + " | Masa: " + masa + " | Diámetro: " + diametro;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Astro astro = (Astro) obj;
        return Double.compare(astro.masa, masa) == 0 &&
                Double.compare(astro.distanciaMedia, distanciaMedia) == 0 &&
                Objects.equals(nombre, astro.nombre);
    }

    public void muestraInformacion() {
        System.out.println("=== DATOS DEL ASTRO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Rotación: " + periodoRotacion + " h");
        System.out.println("Traslación: " + periodoTraslacion + " h");
        System.out.println("Distancia al cuerpo que orbita: " + distanciaMedia + " km");
    }
}
