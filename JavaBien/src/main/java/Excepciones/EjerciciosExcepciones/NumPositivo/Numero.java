package Excepciones.EjerciciosExcepciones.NumPositivo;

import Excepciones.EjerciciosExcepciones.Dos.NewFile;

import java.util.Scanner;

public class Numero {
    static void main(String[] args) {
        Numero numero = new Numero();
        numero.metodo1();
    }

    void metodo1(){
        boolean entra = true;
        try {
            while (entra){
                comprobarNumPositivo();
            }

        }
        catch (MiExcepcion excepcion){
            System.out.println(excepcion.toString());
        }
        finally {
            System.out.println("Terminando código, excepción");
        }
    }

    public void comprobarNumPositivo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce número:");
        int num1 = sc.nextInt();

        if (num1 > 0){
            throw new ArithmeticException("El número es positivo");
        }
    }
}
