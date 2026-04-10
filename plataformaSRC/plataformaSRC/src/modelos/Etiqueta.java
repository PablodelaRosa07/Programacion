package modelos;

import java.util.Objects;

public class Etiqueta implements Comparable<Etiqueta> {
	private String nombre;
	private CategoriaEtiqueta categoria;

	public Etiqueta(String nombre, CategoriaEtiqueta categoria) {
		this.nombre = nombre;
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CategoriaEtiqueta getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaEtiqueta categoria) {
		this.categoria = categoria;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Etiqueta))
			return false;
		Etiqueta etiqueta = (Etiqueta) o;
		// Dos etiquetas son iguales si tienen el mismo nombre Y la misma categoría
		return nombre.equals(etiqueta.nombre) && categoria == etiqueta.categoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, categoria);
	}

	@Override
	public String toString() {
		return "#" + nombre + " [" + categoria + "]";
	}


	@Override
	public int compareTo(Etiqueta o) {
		return 0;
	}
}
