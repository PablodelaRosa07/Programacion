package Examen1Java;

import java.util.Arrays;
import java.util.Scanner;

public class GestionaPlataforma {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionaPlataforma referencia = new GestionaPlataforma();
        boolean encontrado = false;

        String cadena = "alex{netflix23};bea{hbo_pass};carlos{prime99};dani{disneyPlus1};elena{movistar22};fran{sky_77};laur\n" +
                "a{atresPlayer};pablo{filmin88};sofia{stream2024};admin{root};";
        String[] usuarios = new String[10];
        String[] contraseñas = new String[10];

        referencia.extraerNombres(cadena, sc, usuarios, contraseñas);
        referencia.buscaUsuario(usuarios, sc, encontrado, contraseñas);
        referencia.usuariosRegistrados(usuarios);

    }

    void extraerNombres(String cadena, Scanner sc, String[] usuarios, String[] contraseñas){
        String cadena2 = Arrays.toString(cadena.split(";"));
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el usuario: ");
            String nombre = sc.nextLine();
            usuarios[i] = nombre;

            System.out.println("Introduce la contraseña: ");
            String contraseña = sc.nextLine();
            contraseñas[i] = contraseña;
            // no he conseguido hacerlo de la forma que pide el enunciado así que lo hago de esta forma para poder seguir con el ejercicio, no me ha dado tiempo a hacerlo con "@", de esta forma sí hubiera podido hacerlo
        }
    }

    void buscaUsuario(String[] usuarios, Scanner sc, boolean encontrado, String[] contraseñas){
        System.out.println("Introduce nombre de usuario para buscarlo: ");
        String buscarUsuario = sc.nextLine();
        int posicion = -1;

        for (int i = 0; i < usuarios.length; i++) {
            if (buscarUsuario.equals(usuarios[i])){
                System.out.println("Está en la posición " +i);
                encontrado = true;
                posicion = i;

                System.out.println("Introduce la contraseña: ");
                String contraseñaCorrecta = sc.nextLine();
                if (contraseñaCorrecta.equals(contraseñas[i])){
                    System.out.println("true");
                }
                else {
                    System.out.println("false");
                }
            }
    }
        if (encontrado == false){
            System.out.println("-1");
            System.out.println("false: el usuario no está registrado");
        }
    }

    void usuariosRegistrados(String[] usuarios){
        for (int i = 0; i < usuarios.length; i++) {
            System.out.println(usuarios[i]);
        }
    }








}
