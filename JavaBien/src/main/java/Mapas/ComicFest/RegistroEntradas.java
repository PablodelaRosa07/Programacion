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

    public EntradaVIP buscarEntrada(String nick, String plataforma, Influencer influencer) {
        influencer = new Influencer(nick, plataforma);
        EntradaVIP entradaEncontrada = mapaRegistro.get(influencer);

        return entradaEncontrada;
    }

    public Map<Influencer, EntradaVIP> confirmarAsistencia(Influencer influencer, EntradaVIP entradaVip){
        EntradaVIP entradaEncontrada = buscarEntrada(influencer.getNick(), influencer.getPlataforma(), influencer);
        if(!(entradaEncontrada == null)){
            entradaVip.setEstadoEntrada(EstadoEntrada.CONFIRMADA);
            mapaRegistro.put(influencer, entradaEncontrada);
        }
        else  {
            System.out.println("La entrada no existe");
        }

        return mapaRegistro;
    }

    public void cancelarAsistencia(Influencer influencer, EntradaVIP entradaVip){
        EntradaVIP entradaEncontrada = buscarEntrada(influencer.getNick(), influencer.getPlataforma(), influencer);
        if(!(entradaEncontrada == null)){
            entradaVip.setEstadoEntrada(EstadoEntrada.CANCELADA);
        }
        else  {
            System.out.println("La entrada no existe");
        }
    }

    public void mostrarDatos(){
        for (int i = 0; i < mapaRegistro.size(); i++) {
            System.out.println(mapaRegistro);
        }
        System.out.println(mapaRegistro);
    }

    static void main(String[] args) {
        RegistroEntradas registroEntradas = new RegistroEntradas();
        registroEntradas.mostrarDatos();
    }
}


