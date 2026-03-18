package Objetos.Prueba;

public class GestionaPrueba {
    static void main(String[] args) {
        Padre p = (Hijo) new Padre();
        ((Hijo) p).a();
    }
}
