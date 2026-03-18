package Objetos.Cubo;

public class Cubo {

    double lado;      // en decímetros
    double litros;    // litros dentro del cubo

    public Cubo(double lado) {
        this.lado = lado;
        this.litros = 0;
    }

    public double getArea() {
        return 6 * lado * lado;
    }

    public double getVolumen() {
        return lado * lado * lado; // dm³ = litros
    }

    public boolean rellenar(double l) {
        if (litros + l <= getVolumen()) {
            litros += l;
            return true;
        }
        return false;
    }

    public boolean vaciar(double l) {
        if (litros - l >= 0) {
            litros -= l;
            return true;
        }
        return false;
    }
}