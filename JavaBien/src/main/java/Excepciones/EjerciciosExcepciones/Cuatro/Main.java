package Excepciones.EjerciciosExcepciones.Cuatro;

public class Main {
    static void main(String[] args) {
        try {
            Integer[] lista = new Integer[20];
            NumerosRandom numerosRandom = new NumerosRandom();
            System.out.println("Antes de la comprobación.");
        }
        catch (ArithmeticException e){
            System.out.println("No se puede dividir por 0");
        }
        catch (ArrayIndexOutOfBoundsException i){
            System.out.println(i.getMessage());
        }
        finally {
            System.out.println("Llego si o si");
        }
        System.out.println("Sigo");

    }


}
