package Objetos.CuentaBancaria;

public class GestionaPersona {
    static void main(String[] args) {

        Persona p1 = new Persona("Sanchez", "12345678Z", 1970, "Pedro");
        Persona p2 = new Persona("Sanchez", "12345678Z", 1970, "Pedro");

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }



}
