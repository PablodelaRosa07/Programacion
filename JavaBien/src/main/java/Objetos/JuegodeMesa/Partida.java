package Objetos.JuegodeMesa;

import java.util.Arrays;

public class Partida {

    private String nombreJuego;
    private Participante[] Participantes;
    private Participante ganador;
    private double puntuacion;


    // Getter y setter

    public Participante getGanador() {
        return ganador;
    }

    public void setGanador(Participante ganador) {
        this.ganador = ganador;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public Participante[] getParticipantes() {
        return Participantes;
    }

    public void setParticipantes(Participante[] participantes) {
        Participantes = participantes;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "ganador=" + ganador +
                ", nombreJuego='" + nombreJuego + '\'' +
                ", Participantes=" + Arrays.toString(Participantes) +
                '}';
    }

    /*public Participante participanteMayorPuntuacion(){
        int contador = 0;
        Participante p1 = Participantes[0];
        for (int i = 0; i < getParticipantes().length; i++) {
            Participante p = this.Participantes[i];
            if (p.getPuntuacion() > puntuacion){
                puntuacion = p.getPuntuacion();

            }

        }
        return Participantes;
    }*/
}
