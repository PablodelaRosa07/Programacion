package Objetos.EjercicioNotas;

public class Alumno{

    String nombre;
    String apellidos;
    String email;
    NotaAsignatura notaProg;
    NotaAsignatura notaBBDD;

    public Alumno(String apellidos, String email, String nombre, Objetos.EjercicioNotas.NotaAsignatura notaBBDD, Objetos.EjercicioNotas.NotaAsignatura notaProg) {
        this.apellidos = apellidos;
        this.email = email;
        this.nombre = nombre;
        this.notaBBDD = notaBBDD;
        this.notaProg = notaProg;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "apellidos='" + apellidos + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", notaProg=" + notaProg +
                ", notaBBDD=" + notaBBDD +
                '}';
    }


}
