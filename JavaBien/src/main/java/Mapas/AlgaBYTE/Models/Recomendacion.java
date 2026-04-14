package Mapas.AlgaBYTE.Models;

import Mapas.AlgaBYTE.Exception.UserMemoryException;

import java.time.LocalDate;
import java.util.Map;

public class Recomendacion extends Mensajes{


    public Recomendacion(String contenido, LocalDate fechaCreacion, Usuario usuario, Map valoraciones) {
        super(contenido, fechaCreacion, usuario, valoraciones);
    }

    @Override
    public Map<Usuario, Mensajes> subirContenido(Usuario usuario, Mensajes mensajes, Map almacenamiento) throws UserMemoryException {
        if (mensajes.getContenido().length() <= 200 && mensajes.getContenido().length() >= 100){
            almacenamiento.put(usuario, mensajes);
        }
        else {
            throw new UserMemoryException("Recomendación: tienen un mínimo de 100 y máximo de 200 caracteres");
        }
        return almacenamiento;
    }
}