package Colecciones.Conjuntos;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPrueba {
    static void main(String[] args) {

        Set <Integer> numAleatorios = new TreeSet();

        while (numAleatorios.size() < 10){
            Random random = new Random();
            int entero = random.nextInt(0,10);
            System.out.println(entero);
            numAleatorios.add(entero);
        }
        System.out.println(numAleatorios);
    }
}
