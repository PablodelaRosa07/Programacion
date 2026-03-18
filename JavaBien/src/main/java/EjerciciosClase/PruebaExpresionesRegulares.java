package EjerciciosClase;

public class PruebaExpresionesRegulares {
    static void main(String[] args) {
        String frase = "12345678W";
        String patron = "\\d{8}[a-zA-Z]";

        if (frase.matches(patron)){
            System.out.println("DNI Válido");
        }

        else {
            System.out.println("DNI Inválido");
        }



        String matricula = "1234BCD";
        String patron2 = "\\d{4}[A-Z]{3}";

        if (matricula.matches(patron2)){
            System.out.println("Matrícula Válida");
        }

        else {
            System.out.println("Matrícula Inválida");
        }



        String email = "abc123@gmail.com";
        String patron3 = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        if (email.matches(patron3)){
            System.out.println("Email Válido");
        }

        else {
            System.out.println("Email Inválido");
        }
    }
}

