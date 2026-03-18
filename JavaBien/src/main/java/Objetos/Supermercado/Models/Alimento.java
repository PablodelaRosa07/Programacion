package Objetos.Supermercado.Models;

import java.util.Date;

public interface Alimento {

    public void setCaducidad(Date fecha);
    public Date getCaducidad();
    public int getCalorias();
}
