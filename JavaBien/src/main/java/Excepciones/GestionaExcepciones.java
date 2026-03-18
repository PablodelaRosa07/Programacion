package Excepciones;

public class GestionaExcepciones {
    static void main(String[] args) {

        try {
            GrupoAlumnos grupo = new GrupoAlumnos(new String[18], new String[8]);
        }
        catch (ClassNotFoundException e) {
            System.out.println("Ha ocurrido una excepción"+ e.getMessage());
        }
        finally {
            System.out.println("Aquí entro siempre, soy un finally");
        }
        System.out.println("Sigo con mi tarea");
    }

    //throws: Propaga la excepción
    //try, catch: Gestiona la excepción


}
