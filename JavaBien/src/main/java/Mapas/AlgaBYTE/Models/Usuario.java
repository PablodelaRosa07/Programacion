package Mapas.AlgaBYTE.Models;

import java.util.Objects;

public class Usuario implements Comparable<Usuario>{

    private String nombreUsuario;
    private String password;

    public Usuario(String nombreUsuario, String password) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombreUsuario, usuario.nombreUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombreUsuario);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "NombreUsuario='" + nombreUsuario + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public int compareTo(Usuario otroUsuario) {
        int resultado = nombreUsuario.compareTo(otroUsuario.nombreUsuario);
        return resultado;
    }
}
