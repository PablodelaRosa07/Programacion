package Mapas.AlgaBYTE.Models;

import java.time.LocalDate;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public abstract class Mensajes {

    private String contenido;
    private LocalDate fechaCreacion;
    private Usuario usuario;
    private static int id = 0;
    private Map<Mensajes, Integer> valoraciones;

    public Mensajes(String contenido, LocalDate fechaCreacion, Usuario usuario, Map valoraciones) {
        this.contenido = contenido;
        this.fechaCreacion = fechaCreacion;
        this.usuario = usuario;
        id = id+1;
        this.valoraciones = new TreeMap<>();
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Map<Mensajes, Integer> getValoraciones() {
        return valoraciones;
    }

    public void setValoraciones(Map<Mensajes, Integer> valoraciones) {
        this.valoraciones = valoraciones;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mensajes mensajes = (Mensajes) o;
        return Objects.equals(contenido, mensajes.contenido) && Objects.equals(fechaCreacion, mensajes.fechaCreacion) && Objects.equals(usuario, mensajes.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contenido, fechaCreacion, usuario);
    }

    @Override
    public String toString() {
        return "Mensajes{" +
                "contenido='" + contenido + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", usuario=" + usuario +
                '}';
    }

    public abstract Map<Usuario, Mensajes> subirContenido(Usuario usuario, Mensajes mensajes, Map almacenamiento);



}
