package Excepciones.EjerciciosExcepciones.Dos;

public class Main {
    static void main(String[] args) {

        NewFile m = new NewFile();
        m.m1();
        System.out.println("Detrás de mí");
        try {

        }
        catch (NullPointerException e){
            System.out.println("Genero NullPointer" + e.getMessage());
        }
        finally {
            System.out.println("Aquí entro siempre, soy un finally");
        }
        System.out.println("Estoy fuera del finally");


    }
}
