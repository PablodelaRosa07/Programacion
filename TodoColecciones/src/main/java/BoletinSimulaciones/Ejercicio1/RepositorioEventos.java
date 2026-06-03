package BoletinSimulaciones.Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepositorioEventos {
    static void main(String[] args) {
        RepositorioEventos repositorioEventos = new RepositorioEventos();

        LocalDate fecha1 = LocalDate.of(2026, 5, 1);
        LocalDate fecha2 = LocalDate.of(2026, 1, 1);
        LocalDate fecha3 = LocalDate.now();


        Usuario usuario1 = new Usuario("abc@gmail.com", 1, "Pablo de la Rosa");
        Usuario usuario2 = new Usuario("def@gmail.com", 2, "Elena Pablo");

        Reserva reserva1 = new Reserva(EstadoReserva.RESERVADA, fecha1, 1, usuario1);

        Evento evento1 = new Evento(fecha2, "Sevilla Centro", "MangaFest");


        repositorioEventos.crearEvento(evento1, repositorioEventos, fecha3);

        repositorioEventos.agregarReserva(usuario1.getEmail(), evento1.getNombreEvento(), repositorioEventos, reserva1);
        repositorioEventos.agregarReserva(usuario1.getEmail(), "Sevilla 2", repositorioEventos, reserva1);

        repositorioEventos.devolverReserva(reserva1.getIdReserva(), evento1.getNombreEvento(), fecha1, repositorioEventos);
    }

    private List<Evento> listaEventos;

    public RepositorioEventos() {
        this.listaEventos = new ArrayList<>();
    }

    public List<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(List<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }

    @Override
    public String toString() {
        return "RepositorioEventos{" +
                "listaEventos=" + listaEventos +
                '}';
    }



    public void crearEvento(Evento evento, RepositorioEventos repositorioEventos, LocalDate fecha){
        System.out.println("CREANDO EVENTO");
        int resultado = evento.getFechaEvento().compareTo(fecha);
        if (resultado == -1){
            throw new ReservaException("La fecha de evento ya ha pasado");
        }
        else {
            repositorioEventos.listaEventos.add(evento);
            System.out.println("Evento añadido");
        }
    }

    public void devolverReserva(int idReserva, String nombreEvento, LocalDate fecha, RepositorioEventos repositorioEventos){
        System.out.println("DEVOLVIENDO RESERVA");
        Reserva devolver = null;
        for (Evento evento : repositorioEventos.listaEventos){
            if (evento.getNombreEvento().equals(nombreEvento)){
                for (Reserva reserva : evento.getListaReservas()){
                    if (reserva.getIdReserva() == idReserva && reserva.getFechaReserva().equals(fecha)){
                        devolver = reserva;
                    }
                    if (!devolver.equals(reserva)){
                        devolver = null;
                    }
                }
            }
        }
        System.out.println(devolver);
    }

    public void agregarReserva(String email, String nombreEvento, RepositorioEventos repositorioEventos, Reserva reserva){
        System.out.println("AGREGANDO RESERVA");
        int contador = 0;
        for (Evento evento : repositorioEventos.listaEventos){
            if (evento.getNombreEvento().equals(nombreEvento)){
                evento.getListaReservas().add(reserva);
                System.out.println("Reserva añadida");
                contador = 1;
            }
        }
        if (contador == 0){
            throw new ReservaException("No existe el evento");
        }

    }

    public void modificarReserva(int idReserva, String nombreEvento, LocalDate fechaEvento, Usuario usuario){
        
    }


}
