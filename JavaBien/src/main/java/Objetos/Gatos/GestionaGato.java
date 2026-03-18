package Objetos.Gatos;

public class GestionaGato {



    static void main(String[] args) {

        Gatos gato1 = new Gatos("negro", 15, 7 ,"egipcio", "macho");
        Gatos gato2 = new Gatos("gris", 8, 150,"siamés", "hembra");
        Gatos gato3 = new Gatos("negro", 10, 2, "siamés", "hembra");

        gato1.maulla();
        gato1.come("Pienso");
        gato1.ronronea();
        gato1.pelear(gato2);
        gato2.pelear(gato3);

    }
}
