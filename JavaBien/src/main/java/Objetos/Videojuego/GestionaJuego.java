package Objetos.Videojuego;

public class GestionaJuego {
    public static void main(String[] args) {

        Personaje v = new Villano("Sánchez");
        Personaje c = new Caballero("Quijote");
        Personaje a = new Arquero("Bo");
        Personaje m = new Mago("Isco");

        System.out.println("EQUIPAMIENTO");
        System.out.println(v.getNombre() + " porta: '" + v.getArma() + "'");
        System.out.println(c.getNombre() + " porta: " + c.getArma());
        System.out.println(a.getNombre() + " porta: " + a.getArma());
        System.out.println(m.getNombre() + " porta: " + m.getArma());

        System.out.println("SIMULACIÓN DE COMBATE");

        // 1. Arquero vs Caballero
        System.out.println("¿Arquero ataca a Caballero (a 150m)?: " + c.esAtacado(a, 150));
        System.out.println("¿Arquero ataca a Caballero (sin distancia)?: " + c.esAtacado(a));

        // 2. Caballero vs Arquero
        System.out.println("¿Caballero ataca a Arquero (a 30m)?: " + a.esAtacado(c, 30));
        System.out.println("¿Caballero ataca a Arquero (sin distancia)?: " + a.esAtacado(c));

        // 3. Mago vs Todos
        System.out.println("¿Alguien puede atacar al Mago?: " + m.esAtacado(v));

        // 4. Todos vs Villano
        System.out.println("¿El Mago ataca al Villano?: " + v.esAtacado(m));
    }
}