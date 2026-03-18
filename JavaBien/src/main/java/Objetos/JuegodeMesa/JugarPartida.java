package Objetos.JuegodeMesa;

public class JugarPartida {
    static void main(String[] args) {

        Partida p = new Partida();

        Participante participante1 = new Participante(15, "willyrex", "guille", 500);
        Participante participante2 = new Participante(149, "fargan", "david", 499);
        Participante participante3 = new Participante(-3, "vegeta777", "samuel", 2);
        Participante participante4 = new Participante(999999, "Franco", "Francisco Franco", 9999999);

        p.setGanador(participante4);


        System.out.println(p.getGanador());
    }



}
