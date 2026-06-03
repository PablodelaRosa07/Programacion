package BoletinSimulaciones.Ejercicio1;

public class Usuario {

    private int id;
    private String nombreCompleto;
    private String email;

    public Usuario(String email, int id, String nombreCompleto) {
        this.email = email;
        this.id = id;
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", id=" + id +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                '}';
    }
}
