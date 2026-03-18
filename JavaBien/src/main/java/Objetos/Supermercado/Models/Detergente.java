package Objetos.Supermercado.Models;

enum TipoDetergente{
    MAQUINA, MANO, COMBINADO;
}

enum TipoRopa{
    BLANCA, COLOR;
}

public class Detergente extends Producto implements Descuento, Liquido{

    private String marca;
    private String TipoDetergente;
    private String TipoRopa;

    public Detergente(String descripcion, String identificador, double IVAaplicable, String nombre, int peso, double precioCompra, double precioVenta, String marca, String tipoDetergente, String tipoRopa) {
        super(descripcion, identificador, IVAaplicable, nombre, peso, precioCompra, precioVenta);
        this.marca = marca;
        TipoDetergente = tipoDetergente;
        TipoRopa = tipoRopa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoDetergente() {
        return TipoDetergente;
    }

    public void setTipoDetergente(String tipoDetergente) {
        TipoDetergente = tipoDetergente;
    }

    public String getTipoRopa() {
        return TipoRopa;
    }

    public void setTipoRopa(String tipoRopa) {
        TipoRopa = tipoRopa;
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

    @Override
    public double calcularIVA(){
        double precioNeto = getPrecioVenta()-getPrecioVenta()*0.21;
        return precioNeto;
    }

    @Override
    public String toString() {
        return "Detergente{" +
                "marca='" + marca + '\'' +
                ", TipoDetergente='" + TipoDetergente + '\'' +
                ", TipoRopa='" + TipoRopa + '\'' +
                '}' + "Precio neto: " +calcularIVA();
    }
}
