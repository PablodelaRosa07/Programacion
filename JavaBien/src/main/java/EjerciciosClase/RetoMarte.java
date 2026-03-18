package EjerciciosClase;

import java.util.Arrays;
import java.util.Scanner;

public class RetoMarte {
    static void main(String[] args) {

        String [] recursos = new String[4];
        int [] cantidad = new int[100];
        int [] limites_alerta = new int[100];

        recursos[0] = "Oxígeno";
        recursos[1] = "Agua";
        recursos[2] = "Comida";
        recursos[3] = "Combustible";

        cantidad[0] = 100;
        cantidad[1] = 50;
        cantidad[2] = 30;
        cantidad[3] = 10;

        limites_alerta[0] = 20;
        limites_alerta[1] = 50;
        limites_alerta[2] = 5;
        limites_alerta[3] = 2;



        Scanner input2 = new Scanner(System.in);
        System.out.println("¿Cuántos recursos quieres añadir?:");
        int veces = input2.nextInt();

        for (int i = 0; i < veces; i++) {
            Scanner input = new Scanner(System.in);

            System.out.println("Añade un recurso");
            String respuesta1 = input.nextLine();
            recursos[i+4] = respuesta1;

            System.out.println("Añade su cantidad");
            int respuesta2 = input.nextInt();
            cantidad[i+4] = respuesta2;

            System.out.println("Añade su límite");
            int respuesta3 = input.nextInt();
            limites_alerta[i+4] = respuesta3;

        }

        System.out.println("¿Qué desea buscar?:");
        String nombreRecurso = input2.next();

        int contador = 0;
        String cadena = "";
        for (String elemento : recursos){
            nombreRecurso = elemento;
            if (elemento.equals(recursos[contador])){
                cadena = "ERR_Sistema::[ " + recursos[contador] + " ] ::[ " + limites_alerta[contador] + " ] ++FIN";
            }

            contador = contador++;
        }
        System.out.println(cadena);

    }

}
