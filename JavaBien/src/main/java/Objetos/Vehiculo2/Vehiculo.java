package Objetos.Vehiculo2;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String distintivo; // ECO, B, C, etc.

    public Vehiculo(String matricula, String marca, String modelo, String distintivo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.distintivo = distintivo;
    }

    public String getDistintivo() {
        return distintivo;
    }

    public boolean tieneLimitacion(String ciudad) {
        if ((ciudad.equalsIgnoreCase("Madrid") || ciudad.equalsIgnoreCase("Barcelona"))
                && (distintivo.equalsIgnoreCase("B") || distintivo.equalsIgnoreCase("C"))) {
            return true;
        }
        if ((ciudad.equalsIgnoreCase("Valencia") || ciudad.equalsIgnoreCase("Sevilla"))
                && distintivo.equalsIgnoreCase("C")) {
            return true;
        }
        return false;
    }

    public String getLicencias(){
        return null;
    }


}