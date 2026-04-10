package modelos;

import java.util.Objects;

public class Creador {
	private String username;
	private String nombreCompleto;
	private String email;
	private int seguidores;

	public Creador(String username, String nombreCompleto, String email) {
		this.username = username;
		this.nombreCompleto = nombreCompleto;
		this.email = email;
		this.seguidores = 0;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(int seguidores) {
		this.seguidores = seguidores;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Creador))
			return false;
		Creador creador = (Creador) o;
		return username.equals(creador.username);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	@Override
	public String toString() {
		return "@" + username + " (" + nombreCompleto + ")";
	}
}
