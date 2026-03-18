package Excepciones.EjerciciosExcepciones.Traductor;

import Excepciones.EjerciciosExcepciones.Cinco.MiExcepcion;
import Excepciones.EjerciciosExcepciones.ExceptionPersona.PersonaException;

public class Main extends MiExcepcion {
    public Main(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return "Main{}";
    }
}

