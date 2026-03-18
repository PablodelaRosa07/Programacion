package Objetos.Vehiculo;

public class Vehiculo {
    private String matricula;
    private String distintivoAmbiental; // ECO, B, C, etc.

    public Vehiculo(String matricula, String distintivoAmbiental) {
        this.matricula = matricula;
        this.distintivoAmbiental = distintivoAmbiental;
    }

    public boolean tieneLimitacionParaCircular(String ciudad) {
        String d = distintivoAmbiental.toUpperCase();
        String c = ciudad.toLowerCase();

        if ((c.equals("madrid") || c.equals("barcelona")) && (d.equals("B") || d.equals("C"))) {
            return true;
        }
        if ((c.equals("valencia") || c.equals("sevilla")) && d.equals("C")) {
            return true;
        }
        return false;
    }

    public String getLicencias() {
        return "Licencia genérica";
    }
}
