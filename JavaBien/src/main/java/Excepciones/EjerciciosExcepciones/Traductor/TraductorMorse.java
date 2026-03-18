package Excepciones.EjerciciosExcepciones.Traductor;

import Excepciones.EjerciciosExcepciones.Cinco.MiExcepcion;

import java.util.Scanner;


public class TraductorMorse {
    boolean traducir(String texto) throws Exception {
        boolean invalido = false;
        String validaLetras = "^[\\p{L}\\s.,;:!?'\"\\-]+$";
        System.out.println(texto + " " + texto.matches(validaLetras));
        if (!texto.matches(validaLetras)) {
            invalido = true;
            throw new Exception("Cadena con caracteres especiales: " + texto);
        } else {
            invalido = false;
        }
        return invalido;
    }

    static void main(String[] args) throws Exception, MiExcepcion {
        TraductorMorse morse = new TraductorMorse();
        System.out.println("Dame un texto: ");
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        while (!texto.equals("fin")) {
            boolean valido = false;
            try {
                valido = morse.traducir(texto);
            } finally {
                System.out.println("Dame un texto: ");
                texto = sc.nextLine();
                System.out.println(valido);
            }
        }
    }
}
