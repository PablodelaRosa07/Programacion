package Excepciones.EjerciciosExcepciones.Tres;

import java.util.Scanner;

public class Numeros {
    public void comprobarLista(Integer[] lista){
        for (Integer num : lista){
            if (num > 0 && num != null){
                throw new ArithmeticException("Número positivo detectado" + num);
            }
        }
        System.out.println("Todos los números son negativos o cero");
    }
}
