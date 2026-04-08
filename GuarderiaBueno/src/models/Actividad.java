package models;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Objects;


import exceptions.GuarderiaException;

public class Actividad {
    private String nombre;
    private Lugar lugar;
    private LocalDate fecha;
    private int edadRecomendada;
    private int maxAlumnos;
    private Maestro maestro;

    private Collection <Alumno> alumnos; //TODO Decide qué estructura de datos

    public Actividad(String nombre, Lugar lugar, int edadRecomendada, int maxAlumnos,  Maestro maestro, LocalDate fecha) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.edadRecomendada = edadRecomendada;
        this.maxAlumnos = maxAlumnos;
        this.maestro = maestro;

       // this.alumnos = new H
    }

	public Actividad(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public boolean agregarAlumno(Alumno alumno) throws GuarderiaException{
       boolean agregado = false;
       if (this.maxAlumnos > this.alumnos.size() && alumno.getEdad() >= this.edadRecomendada){
		   alumnos.add(alumno);
		   agregado = true;
	   }
	   else {
		   throw new GuarderiaException("El alumno no ha podido ser agregado");
	   }
       return agregado;
    }
    
    public List<Alumno> getAlumnadoConAlergias()
    {
    	List<Alumno> alumnadoAlergia= null;
    	
    	return alumnadoAlergia;
    }
    
    public boolean participaAlumnoEnActividad()
    {
    	boolean participa = false;
    	//TODO
    	return participa;
    }
    


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Lugar getLugar() {
		return lugar;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getEdadRecomendada() {
		return edadRecomendada;
	}

	public void setEdadRecomendada(int edadRecomendada) {
		this.edadRecomendada = edadRecomendada;
	}

	public int getMaxAlumnos() {
		return maxAlumnos;
	}

	public void setMaxAlumnos(int maxAlumnos) {
		this.maxAlumnos = maxAlumnos;
	}

	public Maestro getMaestro() {
		return maestro;
	}

	public void setMaestro(Maestro maestro) {
		this.maestro = maestro;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Actividad actividad = (Actividad) o;
		return Objects.equals(nombre, actividad.nombre) && Objects.equals(fecha, actividad.fecha);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, fecha);
	}
}



























