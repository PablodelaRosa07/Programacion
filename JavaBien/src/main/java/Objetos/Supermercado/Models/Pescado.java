package Objetos.Supermercado.Models;

import java.util.Date;

enum TipoPescado {
    BLANCO, AZUL, MARISCO;
}

public class Pescado extends Producto implements Alimento{

    private String origen;
    private int peso;
    private int tiempoDuracion;
    private String TipoPescado;

    public Pescado(String descripcion, String identificador, double IVAaplicable, String nombre, int peso, double precioCompra, double precioVenta, String origen, int peso1, int tiempoDuracion, String tipoPescado) {
        super(descripcion, identificador, IVAaplicable, nombre, peso, precioCompra, precioVenta);
        this.origen = origen;
        this.peso = peso1;
        this.tiempoDuracion = tiempoDuracion;
        TipoPescado = tipoPescado;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(int tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    }

    public String getTipoPescado() {
        return TipoPescado;
    }

    public void setTipoPescado(String tipoPescado) {
        TipoPescado = tipoPescado;
    }

    @Override
    public void setCaducidad(Date fecha) {

    }

    @Override
    public Date getCaducidad() {
        return null;
    }

    @Override
    public int getCalorias() {
        int multiplicador = 0;

        if (this.getTipoPescado().equals("AZUL")){
            multiplicador = 3;
        }

        if (this.getTipoPescado().equals("BLANCO")){
            multiplicador = 2;
        }

        if (this.getTipoPescado().equals("MARISCO")){
            multiplicador = 1;
        }
        int caloriasTotales = this.getPeso()*multiplicador;

        return caloriasTotales;
    }

    @Override
    public double calcularIVA(){
        double precioNeto = getPrecioVenta()-getPrecioVenta()*0.21;
        System.out.println("El precio neto es: "+precioNeto);
        return precioNeto;
    }

    @Override
    public String toString() {
        return "Pescado{" +
                "origen='" + origen + '\'' +
                ", peso=" + peso +
                ", tiempoDuracion=" + tiempoDuracion +
                ", TipoPescado='" + TipoPescado + '\'' +
                '}' + "Calorías: " + getCalorias();
    }
}
