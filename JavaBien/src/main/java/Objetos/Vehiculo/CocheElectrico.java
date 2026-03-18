package Objetos.Vehiculo;

public class CocheElectrico extends Automovil {
    private String tipoBateria;

    public CocheElectrico(String matricula, String distintivo, String tipoBateria) {
        super(matricula, distintivo);
        setTipoBateria(tipoBateria);
    }

    public void setTipoBateria(String tipo) {
        if (tipo.equals("LFP") || tipo.equals("NCM")) {
            this.tipoBateria = tipo;
        } else {
            this.tipoBateria = "LFP";
        }
    }
}
