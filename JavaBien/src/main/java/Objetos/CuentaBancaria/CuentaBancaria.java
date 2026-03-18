package Objetos.CuentaBancaria;

public class CuentaBancaria {

    private double saldo;
    private int numeroCuenta;
    private Persona informacionTitular;


    public void ingresarDinero(){

    }

    public void retirarDinero(){

    }

    public Persona getInformacionTitular() {
        return informacionTitular;
    }

    public void setInformacionTitular(Persona informacionTitular) {
        this.informacionTitular = informacionTitular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
