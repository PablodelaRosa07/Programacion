package Objetos.Vehiculo2;

public class Camion extends Vehiculo {
    private int mma;
    private int pasajeros;

    public Camion(String matricula, String marca, String modelo, String distintivo, int mma, int pasajeros) {
        super(matricula, marca, modelo, distintivo);
        this.mma = mma;
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "mma=" + mma +
                ", pasajeros=" + pasajeros +
                '}';
    }
}
