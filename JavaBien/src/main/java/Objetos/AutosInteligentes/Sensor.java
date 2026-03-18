package Objetos.AutosInteligentes;

public class Sensor {
    private double distanciaObstaculo;
    private double velocidad;

    public Sensor(double distanciaObstaculo, double velocidad) {
        this.distanciaObstaculo = distanciaObstaculo;
        this.velocidad = velocidad;
    }

    public boolean alertaObstaculo() {
        return distanciaObstaculo < 50;
    }

    public boolean alertaVelocidad() {
        return velocidad > 120;
    }

    public void setDistanciaObstaculo(double distancia){
        this.distanciaObstaculo = distancia;
    }
}