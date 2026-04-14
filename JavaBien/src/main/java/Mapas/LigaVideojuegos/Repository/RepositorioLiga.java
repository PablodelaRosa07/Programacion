package Mapas.LigaVideojuegos.Repository;

import Mapas.LigaVideojuegos.Exception.LigaException;
import Mapas.LigaVideojuegos.Models.Equipo;
import Mapas.LigaVideojuegos.Models.Partida;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepositorioLiga {
    /* JUSTIFICACIÓN: Uso un HashMap porque la clave será el "código del equipo".
     Esto impide que haya dos códigos iguales y hace que buscar un equipo para
     añadirle una partida sea súper rápido. */

    private Map<String, Equipo> listaEquipos = new HashMap<>();

    public void registrarEquipo(Equipo equipo) throws Exception {
        if (listaEquipos.containsKey(equipo.getCodigo())) {
            throw new Exception("Ya existe un equipo con el código: " + equipo.getCodigo());
        }
        listaEquipos.put(equipo.getCodigo(), equipo);
    }

    public void añadirPartida(String codigo, Partida partida) throws Exception {
        if (!listaEquipos.containsKey(codigo)) {
            throw new Exception("El equipo " + codigo + " no existe.");
        }
        listaEquipos.get(codigo).getPartidas().add(partida);
    }
}