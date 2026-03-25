package Programame.Padel;

import java.util.Scanner;

public class Padel {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuántas casos vas a procesar?: ");
        int numCasos = sc.nextInt();

        for (int i = 0; i < 4; i++) {
            System.out.println("Cuántas casos vas a procesar?: ");
            int culpaCompañero = sc.nextInt();
            while (culpaCompañero < 0 || culpaCompañero > 90){
                System.out.println("ERROR, Cuántas casos vas a procesar?: ");
                culpaCompañero = sc.nextInt();
            }
        }
    }
}
