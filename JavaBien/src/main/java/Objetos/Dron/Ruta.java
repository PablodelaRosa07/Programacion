package Objetos.Dron;

public class Ruta {

    private String direccionOrigen;
    private String direccionDestino;
    private int pesoPaquete;
    private String estadoPaquete;

    public Ruta(String direccionDestino, String direccionOrigen, String estadoPaquete, int pesoPaquete) {
        this.direccionDestino = direccionDestino;
        this.direccionOrigen = direccionOrigen;
        this.estadoPaquete = estadoPaquete;
        this.pesoPaquete = pesoPaquete;
    }
}
