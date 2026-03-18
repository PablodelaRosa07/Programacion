package Objetos.AutosInteligentes;

import java.util.Objects;

public class Coche {
    public enum Estado { APAGADO, ARRANCADO, AVERIA }

    private String marca;
    private String modelo;
    private String matricula;
    private Conductor dueño;
    private Estado estado;
    private Sensor sensor;

    public Coche(String marca, String modelo, String matricula, Conductor dueño) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.dueño = dueño;
        this.estado = Estado.APAGADO;
        this.sensor = new Sensor(100, 0);
    }

    public void arrancar(Conductor quienIntenta) {
        if (quienIntenta.equals(this.dueño)) {
            this.estado = Estado.ARRANCADO;
            System.out.println("Vehículo ARRANCADO.");
        }
        else {
            System.out.println("ALERTA: Solo el dueño " + dueño.getNombre() + " puede arrancar este coche.");
        }
    }

    public void verificarSiDebeParar() {
        System.out.println("Sistema de monitoreo activo...");
        while (this.estado == Estado.ARRANCADO) {
            if (sensor.alertaObstaculo()) {
                System.out.println("¡OBSTÁCULO DETECTADO! Frenado de emergencia...");
                this.estado = Estado.APAGADO;
            }
            else {
                System.out.println("Camino despejado...");
            }
        }
    }

    public void setSensor(Sensor sensor){
        this.sensor = sensor;
    }
    public Estado getEstado(){
        return estado;
    }
}