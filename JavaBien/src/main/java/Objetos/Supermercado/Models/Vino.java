package Objetos.Supermercado.Models;

import java.util.Date;

enum TipoVino{
    BLANCO, TINTO, ROSADO
}

public class Vino extends Producto implements Alimento, Liquido, Descuento{

    private String marca;
    private int gradosAlcohol;
    private double precio;
    private String TipoVino;

    public Vino(String descripcion, String identificador, double IVAaplicable, String nombre, int peso, double precioCompra, double precioVenta, String marca, int gradosAlcohol, double precio, String tipoVino) {
        super(descripcion, identificador, IVAaplicable, nombre, peso, precioCompra, precioVenta);
        this.marca = marca;
        this.gradosAlcohol = gradosAlcohol;
        this.precio = precio;
        TipoVino = tipoVino;
    }

    @Override
    public void setCaducidad(Date fecha) {

    }

    @Override
    public Date getCaducidad() {
        return null;
    }

    @Override
    public void setDescuento(double des) {

    }

    @Override
    public double getDescuento() {
        return 0;
    }

    @Override
    public double getPrecioDescuento() {
        return 0;
    }

    @Override
    public void setVolumen(double v) {

    }

    @Override
    public double getVolumen() {
        return 0;
    }

    @Override
    public void setTipoEnvase(String env) {

    }

    @Override
    public String getTipoEnvase() {
        return "";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(int gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoVino() {
        return TipoVino;
    }

    public void setTipoVino(String tipoVino) {
        TipoVino = tipoVino;
    }

    @Override
    public int getCalorias() {
        int multiplicador = 10;

        if (this.getTipoVino().equals("BLANCO")){
            setGradosAlcohol(10);
        }

        if (this.getTipoVino().equals("TINTO")){
            setGradosAlcohol(15);
        }

        if (this.getTipoVino().equals("ROSADO")){
            setGradosAlcohol(12);        }
        int caloriasTotales = getGradosAlcohol()*multiplicador;

        return caloriasTotales;
    }

    @Override
    public String toString() {
        return "Vino{" +
                "marca='" + marca + '\'' +
                ", gradosAlcohol=" + gradosAlcohol +
                ", precio=" + precio +
                ", TipoVino='" + TipoVino + '\'' +
                '}' + "Calorías: "+getCalorias();
    }
}
