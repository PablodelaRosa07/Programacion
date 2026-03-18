package Objetos.Cubo;

public class GestionaLitros {

    public static void main(String[] args) {

        Cubo c = new Cubo(4);

        System.out.println("Área: " + c.getArea());
        System.out.println("Volumen: " + c.getVolumen());

        System.out.println("Rellenar 6: " + c.rellenar(6));
        System.out.println("Vaciar 4: " + c.vaciar(4));
        System.out.println("Vaciar 3: " + c.vaciar(3));
        System.out.println("Rellenar 16: " + c.rellenar(16));
    }
}