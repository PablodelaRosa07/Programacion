package EjerciciosClase;

import java.util.Random;
import java.util.Scanner;

public class ExamenPokemon {
    static void main(String[] args) {
        String[] listaPokemon = new String[15];
        int[] listaNiveles = new int[15];
        int contador = 0;
        ExamenPokemon referencia = new ExamenPokemon();


        boolean finalizado = false;
        while (finalizado == false){

            System.out.println("Elige una opción entre:");
            System.out.println("1. Capturar Pokemon");
            System.out.println("2. Realizar Batalla");
            System.out.println("3. Mostrar Pokedex");
            System.out.println("4. Finalizar");

            Scanner input = new Scanner(System.in);
            System.out.println("Elige 1, 2, 3, 4: ");
            int opcion = input.nextInt();

            if (opcion == 1){
                System.out.println("Capturando Pokemon");
                referencia.capturarPokemon(listaPokemon, listaNiveles, contador);

                contador=contador+1;

            }

            if (opcion == 2){
                System.out.println("Realizando Batalla");
                referencia.realizarBatalla(contador, listaPokemon, listaNiveles);
            }

            if (opcion == 3){
                System.out.println("Mostrando Pokedex");
                referencia.mostrarPokedex(listaPokemon, listaNiveles, contador);
            }

            if (opcion == 4){
                System.out.println("Finalizando");
                finalizado = true;
            }

            else {
                finalizado = false;
            }
        }

    }
    public int capturarPokemon(String[] listaPokemon, int[] listaNiveles, int contador){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce nombre del pokemon: ");
        String nombrePokemon = input.nextLine();
        System.out.println("Introduce su nivel: ");
        int nivelPokemon = input.nextInt();

        listaPokemon[contador] = nombrePokemon;
        listaNiveles[contador] = nivelPokemon;
        return nivelPokemon;
    }

    public int mostrarPokedex(String[] listaPokemon, int[] listaNiveles, int contador){
        int contador2 = 0;
        for (int i = 0; i < contador; i++) {
            System.out.println(contador2+1+". Nombre:"+listaPokemon[contador2]+"  "+ "Nivel:"+listaNiveles[contador2]);
            contador2 = contador2+1;
        }

        return contador2;
    }


    public void realizarBatalla(int contador, String[] listaPokemon, int[] listaNiveles){
        Random randomNumeros = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce posición del pokemon: ");
        int posicionPokemon = input.nextInt();

        int random = randomNumeros.nextInt(contador);
        while (random == posicionPokemon){
            random = randomNumeros.nextInt(contador);
        }

        if (listaNiveles[posicionPokemon] > listaNiveles[random]){
            System.out.println("Has ganado, "+listaPokemon[posicionPokemon]+" ha subido 1 nivel.");
            listaNiveles[posicionPokemon] = listaNiveles[posicionPokemon]+1;
        }
        if (listaNiveles[posicionPokemon] == listaNiveles[random]){
            System.out.println("Empate, no pasa nada.");
        }
        if (listaNiveles[posicionPokemon] < listaNiveles[random]){
            System.out.println("Has perdido la batalla");
        }



    }



    }

