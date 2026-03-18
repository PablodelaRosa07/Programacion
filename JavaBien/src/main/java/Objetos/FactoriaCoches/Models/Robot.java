package Objetos.FactoriaCoches.Models;

public abstract class Robot {
    private static int contadorId = 1;
    private int id;
    private String modelo;
    private int bateria;
    private Estado estado;
    private String combustible;
    private String descripcion;

    public Robot(String modelo, int bateria, Estado estado, String combustible, String descripcion) {
        this.id = contadorId++;
        this.modelo = modelo;
        this.bateria = bateria;
        this.estado = estado;
        this.combustible = combustible;
        this.descripcion = descripcion;
    }

    public boolean tieneBateriaSuficiente() {
        return this.bateria > 10;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Robot robot = (Robot) obj;
        return id == robot.id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + modelo + ", Estado: " + estado + ", Batería: " + bateria + "%";
    }

    public abstract String ejecutarTarea();
    public abstract boolean recargar();

    public Estado getEstado() {
        return estado;
    }
}
