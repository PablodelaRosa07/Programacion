package Mapas.ComicFest;

import java.util.*;

public class RegistroEntradas {

    private Map<Influencer, EntradaVIP> mapaRegistro;

    public RegistroEntradas() {
        this.mapaRegistro = new HashMap<>();
    }

    public void añadirEntrada(Influencer influencer, String codigo, Date fecha, TipoEntrada tipo) {
        if (!mapaRegistro.containsKey(influencer)) {
            EntradaVIP nueva = new EntradaVIP(codigo, EstadoEntrada.ENVIADA, fecha, tipo);
            mapaRegistro.put(influencer, nueva);
            System.out.println("SISTEMA: Entrada asignada a " + influencer.getNick());
        }
        else {
            System.out.println("ERROR: El influencer ya tiene una entrada.");
        }
    }

    public EntradaVIP buscarEntrada(String nick, String plataforma) {
        Influencer influencer = new Influencer(nick, plataforma);
        EntradaVIP entradaEncontrada = mapaRegistro.get(influencer);

        return entradaEncontrada;
    }

    public EntradaVIP confirmarAsistencia(String nick, String plataforma){
        Influencer influencer = new Influencer(nick, plataforma);
        EntradaVIP entradaVIP =
    }
}

