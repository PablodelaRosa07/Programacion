package EjerciciosClase;

import java.util.Scanner;

public class ControlAforoCine {
    static void main(String[] args) {
        boolean[][] salaCine = new boolean[3][4];
        ControlAforoCine referencia = new ControlAforoCine();

        referencia.registrarEspectadores(salaCine);
        referencia.TotalPersonasPorFIlas(salaCine);
    }

    int registrarEspectadores(boolean[][] salaCine){
        int numeroEspectadores = 0;
        for (int i = 0; i < salaCine.length; i++) {
            for (int j = 0; j < salaCine.length; j++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Hay persona?: ");
                boolean veces = sc.nextBoolean();

                if (veces == true){
                    numeroEspectadores = numeroEspectadores+1;
                }
            }
        }
        return numeroEspectadores;
    }

    void TotalPersonasPorFIlas(boolean[][] salaCine){
        int contadorTrue = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce fila: ");
        int fila = sc.nextInt();
        for (int i = 0; i < salaCine.length; i++) {
            if (salaCine[fila][i] == true){
                contadorTrue = contadorTrue+1;
            }
        }
        System.out.println("Hay " + contadorTrue + " personas");
    }
}
