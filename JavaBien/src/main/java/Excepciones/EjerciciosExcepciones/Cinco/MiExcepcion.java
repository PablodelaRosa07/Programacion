package Excepciones.EjerciciosExcepciones.Cinco;

import java.util.Random;

public class MiExcepcion extends Throwable {
    public MiExcepcion(String s) {
    }

    public void metodo1(){
        Random random = new Random(10);
        int num1 = random.nextInt();
        if (num1 % 2 == 1){
            throw new ArithmeticException("El número es impar");
        }
    }
}
