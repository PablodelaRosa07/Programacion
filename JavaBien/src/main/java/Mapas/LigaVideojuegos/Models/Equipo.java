package Mapas.LigaVideojuegos.Models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {
    private String codigo;
    private String nombre;
    private String pais;
    private LocalDate fechaFundacion;
    private List<Partida> partidas;

    public Equipo(String codigo, String nombre, String pais, LocalDate fechaFundacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.pais = pais;
        this.fechaFundacion = fechaFundacion;
        this.partidas = new ArrayList<>();
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public List<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(List<Partida> partidas) {
        this.partidas = partidas;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", fechaFundacion=" + fechaFundacion +
                ", partidas=" + partidas +
                '}';
    }

    public int calcularPuntosTotales() {
        int total = 0;
        for (Partida partida : partidas) {
            total = total+partida.getPuntos();
        }
        return total;
    }
}



