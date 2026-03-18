package Excepciones;

public class GrupoAlumnos {

    private String[] nombre;
    private String[] apellidos;

    public GrupoAlumnos(String[] apellidos, String[] nombre) throws ClassNotFoundException {
        this.setApellidos(apellidos);
        this.setNombre(nombre);
    }

    public GrupoAlumnos(){
        nombre = new String[20];
        apellidos = new String[20];
    }

    public String[] getApellidos() {
        return apellidos;
    }

    public void setApellidos(String[] apellidos) {
        if (apellidos.length > 20){
            throw new NullPointerException("Llegan más de 20 apellidos");
        }
        System.out.println("Llego a asignación de apellidos");
        this.apellidos = apellidos;
    }

    public String[] getNombre() {
        return nombre;
    }

    /*public void setNombre(String[] nombre) {
        if (nombre.length > 20){
            throw new NullPointerException("Llegan más de 20 nombres");
        }
        this.nombre = nombre;
    }*/

    public void setNombre(String[] nombre) throws ClassNotFoundException {
        if (nombre.length > 20){
            throw new ClassNotFoundException("Llegan más de 20 nombres");
        }
        this.nombre = nombre;
    }
}
