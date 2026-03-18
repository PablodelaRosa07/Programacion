package Objetos.Persona;

public class Persona {

    //Constructores
    int edad;
    String nombre;
    String lugarNacimiento;
    String deporteFavorito;
    String peliFav;

    public Persona(int edad, String nombre, String lugarNacimiento, String deporteFavorito, String peliFav) {
        this.edad = edad; // con this te estás refiriendo a los atributos de dentro de las clases
        this.nombre = nombre;
        this.lugarNacimiento = lugarNacimiento;
        this.deporteFavorito = deporteFavorito;
        this.peliFav = peliFav;
    }

    //Metodos
    void hablar(){
        System.out.println("Hablando: " + nombre);
    }
    boolean heRobado(){
        return false;
    }
    void comer(){
        System.out.println("Comiendo: " + nombre);
    }


    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", lugarNacimiento='" + lugarNacimiento + '\'' +
                ", deporteFavorito='" + deporteFavorito + '\'' +
                ", peliFav='" + peliFav + '\'' +
                '}';
    }


}
