package repositorio;

import java.time.LocalDateTime;
import java.util.*;

import excepciones.ContenidoException;
import modelos.*;

public class RepositorioContenidos{

	private TreeSet<Contenido> coleccionContenido;//He usado TreeSet porque evita los elementos duplicados y porque pueder ordenar los elemantos utilizando compareTo

	public RepositorioContenidos(TreeSet<Contenido> coleccionContenido) {
		this.coleccionContenido = new TreeSet<>();
	}
	public RepositorioContenidos() {
		this.coleccionContenido = new TreeSet<>();
	}

	public TreeSet<Contenido> getColeccionContenido() {
		return coleccionContenido;
	}

	public void setColeccionContenido(TreeSet<Contenido> coleccionContenido) {
		this.coleccionContenido = coleccionContenido;
	}



	public TreeSet<Contenido> agregarContenido(Contenido cont) {
		TreeSet<Contenido> coleccionContenido = new TreeSet<>();
		coleccionContenido.add(cont);
		if (coleccionContenido.contains(cont)){
			coleccionContenido.add(cont);
		}
		return coleccionContenido;
	}

	// TODO: Completa este método para agregar una etiqueta a un contenido
	// Debe buscar el contenido por su ID y llamar a su método agregarEtiqueta()
	// Si el contenido no existe, lanza ContenidoException
	// Si el contenido está ELIMINADO o ARCHIVADO, la excepción la lanzará el método del Contenido
	public TreeSet<Contenido> agregarEtiqueta(String idContenido, Etiqueta etiqueta) throws ContenidoException {
		if (coleccionContenido.contains(idContenido)){
			System.out.println(idContenido);
		}
		else {
			throw new ContenidoException("No se encuentra idContenido");
		}
		return coleccionContenido;
	}


	public Contenido buscarContenido(String idContenido) throws ContenidoException{
		Contenido contenido2 = null;
		for (Contenido contenido : coleccionContenido){
			if (contenido.getIdContenido().equals(idContenido)){
				System.out.println(contenido.getContenido());
				contenido2 = contenido;
			}
		}
		return contenido2;
	}


	public void publicarContenido(String idContenido) throws ContenidoException {
		for (Contenido contenido : coleccionContenido){
			if (contenido.getIdContenido().equals(idContenido)){
				contenido.setEstado(EstadoContenido.PUBLICADO);
				contenido.setFechaPublicacion(LocalDateTime.now());
			}
			if (!contenido.getEstado().equals(EstadoContenido.BORRADOR)){
				throw new ContenidoException("Es un borrador");
			}
		}
	}

	// TODO: Completa este método que devuelve una lista con todas las etiquetas
	// del contenido ordenadas primero por categoría y luego por nombre
	// Si el contenido no existe, devuelve lista vacía
	public List<Etiqueta> obtenerEtiquetasOrdenadas(String idContenido) {
		List<Etiqueta> listaEtiquetas = new ArrayList<>();
		listaEtiquetas.stream().sorted().toList();
		if (listaEtiquetas.isEmpty()) {
			System.out.println("No hay registros de etiquetas.");
		}
		else {
			for (int i = 0; i < listaEtiquetas.size(); i++) {
				System.out.println(listaEtiquetas.get(i));
			}
		}
		return listaEtiquetas;
	}

	// TODO: Completa este método que devuelve una lista ordenada de contenidos
	// por número de visualizaciones (de mayor a menor)
	// Solo debe incluir contenidos en estado PUBLICADO
	// Usa Collections.sort() o stream().sorted() para la ordenación
	public TreeSet<Contenido> obtenerContenidosMasVistos() {
		coleccionContenido.stream().sorted();
		if (coleccionContenido.isEmpty()) {
			System.out.println("No hay registros de contenido.");
		}
		else {
			for (int i = 0; i < coleccionContenido.size(); i++) {
				System.out.println(coleccionContenido.toArray()[i]);
			}
		}
		return coleccionContenido;
	}
}
