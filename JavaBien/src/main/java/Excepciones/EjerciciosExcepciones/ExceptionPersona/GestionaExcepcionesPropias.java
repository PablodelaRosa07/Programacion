package Excepciones.EjerciciosExcepciones.ExceptionPersona;

public class GestionaExcepcionesPropias {
    static void main(String[] args) {
        try {
            throw new PersonaException("Lanzo excepción en el main");
        }
        catch (PersonaException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Continúo mi main");
    }
}
