package Objetos.Vehiculo2;

public class CocheElectrico extends Automovil {
    private String tipoBateria;

    public CocheElectrico(String matricula, String marca, String modelo, String distintivo, String tipoBateria) {
        super(matricula, marca, modelo, distintivo);
        if (tipoBateria.equals("LFP") || tipoBateria.equals("NCM")) {
            this.tipoBateria = tipoBateria;
        } else {
            this.tipoBateria = "Desconocido";
        }
    }
}
