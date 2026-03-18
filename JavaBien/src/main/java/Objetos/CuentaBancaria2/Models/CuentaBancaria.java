package Objetos.CuentaBancaria2.Models;

import java.time.LocalDate;
import java.util.Date;

public class CuentaBancaria {

    private double saldo;
    private Date fechaApertura;
    private static int contador = 0;
    private String IBAN;
    private Cliente clienteTitular;
    private Cliente clienteAutorizado;

    public CuentaBancaria(Cliente clienteAutorizado, Cliente clienteTitular, Date fechaApertura, String IBAN, double saldo) {
        this.clienteAutorizado = clienteAutorizado;
        this.clienteTitular = clienteTitular;
        this.fechaApertura = fechaApertura;
        this.IBAN = IBAN;
        contador = contador+1;
        this.saldo = saldo;
    }

    public Cliente getClienteAutorizado() {
        return clienteAutorizado;
    }

    public void setClienteAutorizado(Cliente clienteAutorizado) {
        this.clienteAutorizado = clienteAutorizado;
    }

    public Cliente getClienteTitular() {
        return clienteTitular;
    }

    public void setClienteTitular(Cliente clienteTitular) {
        this.clienteTitular = clienteTitular;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        CuentaBancaria.contador = contador;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "clienteAutorizado=" + clienteAutorizado +
                ", saldo=" + saldo +
                ", fechaApertura=" + fechaApertura +
                ", IBAN='" + IBAN + '\'' +
                ", clienteTitular=" + clienteTitular +
                '}';
    }
}
