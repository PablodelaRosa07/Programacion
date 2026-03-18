package Excepciones.EjerciciosExcepciones.Cuatro;

import java.util.Random;

public class NumerosRandom {
    public void numeroRandom(Integer[] lista){
        for (int i = 0; i < 20; i++) {
            Random random = new Random(10);

            int num1 = random.nextInt();
            int num2 = random.nextInt();

            if (num2 == 0){
                throw new ArithmeticException("No se puede dividir por 0");
            }
            if (i == 10){
                throw new ArrayIndexOutOfBoundsException("Intentado guardar en la posición: " +i);
            }
            if (num2 != 0 && i != 10){
                lista[i] = num1/num2;
            }
        }

    }
}
