package Mapas.AlgaBYTE.Models;

import Mapas.AlgaBYTE.Exception.UserMemoryException;

import java.util.Map;
import java.util.TreeMap;

public class MemoryStorage{ //repositorio
    String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";
    Map<Usuario, Mensajes> almacenamiento;

    public MemoryStorage(Map<Usuario, String> almacenamiento) {
        this.almacenamiento = new TreeMap<>();
    }

    public Map<Usuario, Mensajes> agregarUsuarios(Usuario usuario){
        if (usuario.getPassword().length() <= 6){
            throw new UserMemoryException("Usuario no es correcto");
        }
        if (usuario.getPassword().matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$" ) && usuario.getPassword().length() >= 8){
            almacenamiento.put(usuario, null);
        }
        if (!usuario.getPassword().matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$" ) || usuario.getPassword().length() <= 7){
            throw new UserMemoryException("La clave no cumple alguno de estos requisitos: contiene mayúsuculas, minúsculas y números y tiene 8 o más caracteres");
        }
        return almacenamiento;
    }

    public Map<Usuario, Mensajes> subirContenido(Usuario usuario, Mensajes mensajes){
        if (usuario == null){
            throw new UserMemoryException("No se puede subir, el usuario no existe");
        }
        else {
            almacenamiento.put(usuario, mensajes);
        }
        return almacenamiento;
    }


}
