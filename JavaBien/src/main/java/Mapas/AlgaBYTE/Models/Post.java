package Mapas.AlgaBYTE.Models;

import Mapas.AlgaBYTE.Exception.UserMemoryException;

import java.time.LocalDate;
import java.util.Map;

public class Post extends Mensajes{


    public Post(String contenido, LocalDate fechaCreacion, Usuario usuario, Map valoraciones) {
        super(contenido, fechaCreacion, usuario, valoraciones);
    }

    @Override
    public Map<Usuario, Mensajes> subirContenido(Usuario usuario, Mensajes mensajes, Map almacenamiento) throws UserMemoryException {
        if (mensajes.getContenido().equals("")){
            throw new UserMemoryException("Post: no tienen límite de caracteres, pero no puede estar en blanco.");
        }
        else {
            almacenamiento.put(usuario, mensajes);
        }
        return almacenamiento;
    }
}