package Excepciones.EjerciciosExcepciones.Tres;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        try {
            Integer[] misNumeros = {1,2,3,4,5,6,7};
            Numeros numeros = new Numeros();
            numeros.comprobarLista(misNumeros);
            System.out.println("Estoy en try");
        }
        catch (ArithmeticException e){
            System.out.println("Capturando la excepción");
        }

        System.out.println("Programa finalizado");
    }
}
