package BoletinMapas.Ejercicio1;

import java.util.*;

public class RegistrosEntrada {
    static void main(String[] args) {
        RegistrosEntrada registrosEntrada = new RegistrosEntrada();

        Date fechaEnviado1 = new Date();

        EntradaVIP entradaVIP1 = new EntradaVIP("1234ABC", EstadoEntrada.ENVIADA, fechaEnviado1, TipoEntrada.SILVER);
        EntradaVIP entradaVIP2 = new EntradaVIP("5678DEF", EstadoEntrada.ENVIADA, fechaEnviado1, TipoEntrada.PLATINIUM);

        Influencer influencer1 = new Influencer("Ibai", "Ibai Llanos", 12000000, "Twitch");
        Influencer influencer2 = new Influencer("Pedro", "Pedro", 12345, "YouTube");
        Influencer influencer3 = new Influencer("Pablito", "Pablo", 123456789, "Kick");

        registrosEntrada.añadirRegistro(influencer1, entradaVIP1);
        registrosEntrada.añadirRegistro(influencer3, entradaVIP2);


        registrosEntrada.buscarEntrada("Ibai", "Twitch");
        registrosEntrada.buscarEntrada("Ibai", "Twitch");
        registrosEntrada.buscarEntrada("Pedro", "YouTube");

        registrosEntrada.confirmarAsistencia("Ibai", "Twitch");
        registrosEntrada.confirmarAsistencia("Pablito", "Kick");
        registrosEntrada.confirmarAsistencia("Pedro", "YouTube");

        registrosEntrada.cancelarAsistencia("Ibai", "Twitch");
        registrosEntrada.cancelarAsistencia("Pedro", "YouTube");

        registrosEntrada.mostrarDatosConfirmados();

        registrosEntrada.mostrarDatosCancelados();

        registrosEntrada.mostrarDatosPendientes();

        registrosEntrada.mostrarTop();
    }



    Map <Influencer, EntradaVIP> mapaRegistroEntradas;

    public RegistrosEntrada() {
        this.mapaRegistroEntradas = new TreeMap<>();
    }

    public Map<Influencer, EntradaVIP> getMapaRegistroEntradas() {
        return mapaRegistroEntradas;
    }

    public void setMapaRegistroEntradas(Map<Influencer, EntradaVIP> mapaRegistroEntradas) {
        this.mapaRegistroEntradas = mapaRegistroEntradas;
    }



    @Override
    public String toString() {
        return "RegistrosEntrada{" +
                "mapaRegistroEntradas=" + mapaRegistroEntradas +
                '}';
    }





    public void añadirRegistro(Influencer influencer, EntradaVIP entradaVIP){
        System.out.println("AÑADIENDO REGISTRO. ");
        if (!mapaRegistroEntradas.containsKey(influencer)){
            mapaRegistroEntradas.put(influencer, entradaVIP);
            System.out.println("Registro añadido: " +influencer.getNick());
        }
        else {
            System.out.println("Este influencer ya tiene entrada: " +influencer.getNick());
        }
    }

    public void buscarEntrada(String nick, String plataforma){
        System.out.println("BUSCANDO ENTRADA");
        int contador = 0;
        for (Influencer influencer : mapaRegistroEntradas.keySet()){
            if (influencer.getNick().equals(nick) && influencer.getPlataforma().equals(plataforma)){
                System.out.println("Entrada de " +influencer.getNick()+ ": " +mapaRegistroEntradas.get(influencer));
                contador = 1;

            }
        }
        if (contador == 0){
            System.out.println((String) null);
        }
    }

    public void confirmarAsistencia(String nick, String plataforma){
        System.out.println("CONFIRMANDO ASISTENCIA");
        int contador = 0;

        for (Influencer influencer : mapaRegistroEntradas.keySet()){
            if (influencer.getNick().equals(nick) && influencer.getPlataforma().equals(plataforma)){
                EntradaVIP entrada = mapaRegistroEntradas.get(influencer);
                entrada.setEstadoEntrada(EstadoEntrada.CONFIRMADA);
                contador = 1;
                System.out.println("Asistencia confirmada para: " +nick);
            }
        }
        if (contador == 0){
            System.out.println("No se han encontrado entradas para este influencer: " +nick);
        }
    }

    public void cancelarAsistencia(String nick, String plataforma){
        System.out.println("CONFIRMANDO ASISTENCIA");
        int contador = 0;

        for (Influencer influencer : mapaRegistroEntradas.keySet()){
            if (influencer.getNick().equals(nick) && influencer.getPlataforma().equals(plataforma)){
                EntradaVIP entrada = mapaRegistroEntradas.get(influencer);
                entrada.setEstadoEntrada(EstadoEntrada.CANCELADA);
                contador = 1;
                System.out.println("Asistencia cancelada para: " +nick);
            }
        }
        if (contador == 0){
            System.out.println("No se han encontrado entradas para este influencer: " +nick);
        }
    }

    public void mostrarDatosConfirmados(){
        System.out.println("MOSTRANDO INFLUENCERS CONFIRMADOS");
        for (Influencer influencer : mapaRegistroEntradas.keySet()){
            EntradaVIP entradaVIP = mapaRegistroEntradas.get(influencer);
            if (entradaVIP.getEstadoEntrada().equals(EstadoEntrada.CONFIRMADA)){
                System.out.println("Influencer confirmado: " +influencer);
            }
        }
    }

    public void mostrarDatosCancelados(){
        System.out.println("MOSTRANDO INFLUENCERS CANCELADOS");
        for (Influencer influencer : mapaRegistroEntradas.keySet()){
            EntradaVIP entradaVIP = mapaRegistroEntradas.get(influencer);
            if (entradaVIP.getEstadoEntrada().equals(EstadoEntrada.CANCELADA)){
                System.out.println("Influencer cancelado: " +influencer);
            }
        }
    }

    public void mostrarDatosPendientes(){
        System.out.println("MOSTRANDO INFLUENCERS POR CONFIRMAR");
        for (Influencer influencer : mapaRegistroEntradas.keySet()){
            EntradaVIP entradaVIP = mapaRegistroEntradas.get(influencer);
            if (entradaVIP.getEstadoEntrada().equals(EstadoEntrada.ENVIADA)){
                System.out.println("Influencer cancelado: " +influencer);
            }
        }
    }

    public void mostrarTop(){
        System.out.println("MOSTRANDO LOS INFLUENCERS CON MAS SEGUIDORES");
        List <Influencer> listaTOP = new ArrayList<>(mapaRegistroEntradas.keySet());

        if (mapaRegistroEntradas.size() >= 1){
            System.out.println(listaTOP.get(0));
        }

        if (mapaRegistroEntradas.size() >= 2){
            System.out.println(listaTOP.get(1));
        }

        if (mapaRegistroEntradas.size() >= 3){
            System.out.println(listaTOP.get(2));
        }

    }


}
