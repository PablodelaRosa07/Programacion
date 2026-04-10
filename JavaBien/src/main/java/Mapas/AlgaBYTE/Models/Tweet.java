package Mapas.AlgaBYTE.Models;

import Mapas.AlgaBYTE.Exception.UserMemoryException;

import java.time.LocalDate;
import java.util.Map;

public class Tweet extends Mensajes{

    public Tweet(String contenido, LocalDate fechaCreacion, Usuario usuario, Map valoraciones) {
        super(contenido, fechaCreacion, usuario, valoraciones);
    }

    @Override
    public Map<Usuario, Mensajes> subirContenido(Usuario usuario, Mensajes mensajes, Map almacenamiento) throws UserMemoryException{
        if (mensajes.getContenido().length() <= 50){
            almacenamiento.put(usuario, mensajes);
        }
        else {
            throw new UserMemoryException("Tweet: tienen un máximo de 50 caracteres.");
        }
        return almacenamiento;
    }

    public void calcularValoracion(Tweet tweet){
        if (Valoracion.SUPERBUENA){

        }
    }
}
