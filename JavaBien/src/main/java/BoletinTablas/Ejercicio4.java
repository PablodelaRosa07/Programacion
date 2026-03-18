package BoletinTablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};

        Ejercicio4 referencia = new Ejercicio4();
        int numeroBuscado = referencia.dameNumeroABuscar();

        Ejercicio4 referencia2 = new Ejercicio4();
        int posicionNumero = referencia2.encontrarPosicion(numeroBuscado, numeros);
        System.out.println(posicionNumero);

    }

        public int dameNumeroABuscar(){
            Scanner input = new Scanner(System.in);
            System.out.println("Busca número: ");
            int veces = input.nextInt();

            return veces;
        }

        public int encontrarPosicion(int veces, int[] numeros) {
        boolean encontrado = false;
        int indice = 0;

        while (indice < 5 && !encontrado){
            if (numeros[indice] == veces) {
                encontrado = true;
            }
            indice = indice+1;
        }

        if (encontrado){
            System.out.println("Encontrado en la posición: " + indice);
        }
        else {
            System.out.println("No encontrado");
            indice = -1;
        }
        return indice;

    }
}
