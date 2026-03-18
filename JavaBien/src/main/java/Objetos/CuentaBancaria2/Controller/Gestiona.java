package Objetos.CuentaBancaria2.Controller;

import Objetos.CuentaBancaria2.Models.Cliente;
import Objetos.CuentaBancaria2.Models.CuentaBancaria;

import java.util.Date;

public class Gestiona {
    static void main(String[] args) {

        Date date1 = new Date(1-1-2026);

        Cliente cliente1 = new Cliente("de la Rosa", "González", "12345678Z", "Pablo");
        Cliente cliente2 = new Cliente("Lazo", "González", "87654321A", "Pepe");
        Cliente cliente3 = new Cliente("García", "Castro", "13579246F", "Gonzalo");

        CuentaBancaria cb1 = new CuentaBancaria(cliente1, cliente2, date1, "ABC123",  1200);
        CuentaBancaria cb2 = new CuentaBancaria(cliente2, cliente3, date1, "DEF456", 1050);
        CuentaBancaria cb3 = new CuentaBancaria(null, cliente1, date1, "GHI789", 4567);

        System.out.println(cb1);

    }
}
