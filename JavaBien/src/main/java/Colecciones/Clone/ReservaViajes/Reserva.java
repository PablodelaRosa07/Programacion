package Colecciones.Clone.ReservaViajes;

import java.util.Objects;

public class Reserva {

    private String nombrePasajero;
    private String destinoVuelo;
    private int numAsiento;
    private double precioBillete;
    private int id;
    private static int contadorid = 1;

    public Reserva(String destinoVuelo, int id, String nombrePasajero, int numAsiento, double precioBillete) {
        this.destinoVuelo = destinoVuelo;
        this.id = contadorid+1;
        this.nombrePasajero = nombrePasajero;
        this.numAsiento = numAsiento;
        this.precioBillete = precioBillete;
    }

    public static int getContadorid() {
        return contadorid;
    }

    public static void setContadorid(int contadorid) {
        Reserva.contadorid = contadorid;
    }

    public String getDestinoVuelo() {
        return destinoVuelo;
    }

    public void setDestinoVuelo(String destinoVuelo) {
        this.destinoVuelo = destinoVuelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public double getPrecioBillete() {
        return precioBillete;
    }

    public void setPrecioBillete(double precioBillete) {
        this.precioBillete = precioBillete;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return id == reserva.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "destinoVuelo='" + destinoVuelo + '\'' +
                ", nombrePasajero='" + nombrePasajero + '\'' +
                ", numAsiento=" + numAsiento +
                ", precioBillete=" + precioBillete +
                ", id=" + id +
                '}';
    }
}
