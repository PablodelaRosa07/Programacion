package modelos;

import java.time.LocalDateTime;
import java.util.*;
import excepciones.ContenidoException;

public class Contenido implements Comparable<Contenido> {
	private String idContenido;
	private String titulo;
	private TipoContenido tipo;
	private LocalDateTime fechaPublicacion;
	private Creador creador;
	private EstadoContenido estado;
	private int visualizaciones;
	private TreeSet<Etiqueta> etiquetas;
	private Contenido contenido;
	//He usado TreeSet porque evita los elementos duplicados y porque pueder ordenar los elemantos utilizando compareTo

	public Contenido(Contenido contenido, Creador creador, EstadoContenido estado, TreeSet<Etiqueta> etiquetas, LocalDateTime fechaPublicacion, String idContenido, TipoContenido tipo, String titulo, int visualizaciones) {
		this.contenido = contenido;
		this.creador = creador;
		this.estado = estado;
		this.etiquetas = new TreeSet<>();
		this.fechaPublicacion = fechaPublicacion;
		this.idContenido = idContenido;
		this.tipo = tipo;
		this.titulo = titulo;
		this.visualizaciones = visualizaciones;
	}

	public Contenido(String vid003, String videoEliminado, TipoContenido tipoContenido, Creador creador1) {
	}


	public Contenido getContenido() {
		return contenido;
	}

	public void setContenido(Contenido contenido) {
		this.contenido = contenido;
	}

	public Creador getCreador() {
		return creador;
	}

	public void setCreador(Creador creador) {
		this.creador = creador;
	}

	public EstadoContenido getEstado() {
		return estado;
	}

	public void setEstado(EstadoContenido estado) {
		this.estado = estado;
	}

	public TreeSet<Etiqueta> getEtiquetas() {
		return etiquetas;
	}

	public void setEtiquetas(TreeSet<Etiqueta> etiquetas) {
		this.etiquetas = etiquetas;
	}

	public LocalDateTime getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getIdContenido() {
		return idContenido;
	}

	public void setIdContenido(String idContenido) {
		this.idContenido = idContenido;
	}

	public TipoContenido getTipo() {
		return tipo;
	}

	public void setTipo(TipoContenido tipo) {
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getVisualizaciones() {
		return visualizaciones;
	}

	public void setVisualizaciones(int visualizaciones) {
		this.visualizaciones = visualizaciones;
	}

	public List<Etiqueta> agregarEtiqueta(Etiqueta etiqueta, List etiquetas) throws ContenidoException{
		if (contenido.getEstado().equals(EstadoContenido.ELIMINADO) || contenido.getEstado().equals(EstadoContenido.ARCHIVADO)){
			throw new ContenidoException("No se puede añadir.");
		}
		else {
			etiquetas.add(etiqueta);
		}
		return etiquetas;
	}


	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Contenido contenido = (Contenido) o;
		return Objects.equals(idContenido, contenido.idContenido);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(idContenido);
	}

	@Override
	public String toString() {
		return "Contenido{" +
				"idContenido='" + idContenido + '\'' +
				", titulo='" + titulo + '\'' +
				", tipo=" + tipo +
				'}';
	}


	@Override
	public int compareTo(Contenido o) {
		return 0;
	}
}
