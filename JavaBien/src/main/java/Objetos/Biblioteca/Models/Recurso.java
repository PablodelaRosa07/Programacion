package Objetos.Biblioteca.Models;

public abstract class Recurso implements IPrestable {
    private String id;
    private String ubicacion;
    protected int unidadesTotales;
    protected int unidadesPrestadas;

    public Recurso(String id, String ubicacion, int unidadesTotales) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.unidadesTotales = unidadesTotales;
        this.unidadesPrestadas = 0;
    }

    @Override
    public boolean estaDisponible() {
        return unidadesPrestadas < unidadesTotales;
    }

    public void prestar() {
        if (estaDisponible()) {
            unidadesPrestadas++;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
