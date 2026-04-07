package Excepciones.EjerciciosExcepciones.NumAleatorios;

import Excepciones.EjerciciosExcepciones.NumPositivo.MiExcepcion;

import java.util.Random;

public class NumAleatorios {
    static void main(String[] args) {
        NumAleatorios numAleatorios = new NumAleatorios();
        int[] numAleatoriosTabla = new int[20];

        numAleatorios.metodo1(numAleatoriosTabla);
    }

    public void metodo1(int [] numAleatoriosTabla){
        int contador = 0;
        try {
            while (numAleatoriosTabla.length <= 20){
                Random random = new Random(10);
                int num1 = random.nextInt();
                int num2 = random.nextInt();

                comprobarYMeter(num1, num2, numAleatoriosTabla, contador);
                contador++;
            }
        }
        catch (ArithmeticException e){
            System.out.println("No se puede dividir por 0");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Intentando guardar en la posición 10");
        }
        finally {
            System.out.println("Saliendo");
        }
    }



    public void comprobarYMeter(int num1, int num2, int[] numAleatoriosTabla, int contador){
        if (num2 == 0 && contador != 10){
            throw new ArithmeticException();
        }
        if (contador == 10){
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            numAleatoriosTabla[contador] = num1/num2;

        }
    }
}
