package Objetos.Dron;

public class Dron {

    private String identificador;
    private String estado;
    private int porcentajeBateria;
    private int cargaMaxima;
    private String ruta;

    public Dron(int cargaMaxima, String estado, String identificador, int porcentajeBateria, String ruta) {
        this.cargaMaxima = cargaMaxima;
        this.estado = estado;
        this.identificador = identificador;
        this.porcentajeBateria = porcentajeBateria;
        this.ruta = ruta;
    }

    int contador = 0;
    public void asignarRuta(Ruta ruta1, Ruta ruta2){
        if (estado.equals("EN_REPOSO") && contador == 0){
            ruta = ruta1.toString();
        }
        if (estado.equals("EN_REPOSO") && contador == 1){
            ruta = ruta2.toString();
        }
        contador = 1;
    }


}
