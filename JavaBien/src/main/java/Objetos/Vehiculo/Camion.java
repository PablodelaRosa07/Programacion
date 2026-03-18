package Objetos.Vehiculo;

public class Camion extends Vehiculo {
    private double mma; // Masa Máxima Autorizada
    private int pasajeros;

    public Camion(String matricula, String distintivo, double mma, int pasajeros) {
        super(matricula, distintivo);
        this.mma = mma;
        this.pasajeros = pasajeros;
    }

    @Override
    public String getLicencias() {
        if (pasajeros <= 9) {
            if (mma > 3500 && mma <= 7500) return "C1";
            if (mma > 7500) return "C";
        }
        return "Requiere licencia especial (D o E)";
    }
}