package BoletinListas.Ejercicio1;

public class Horario {

    private String[] lunes;
    private String[] martes;
    private String[] miercoles;
    private String[] jueves;
    private String[] viernes;

    public Horario(String[] jueves, String[] lunes, String[] martes, String[] miercoles, String[] viernes) {
        this.jueves = new String[6];
        this.lunes = new String[6];
        this.martes = new String[6];
        this.miercoles = new String[6];
        this.viernes = new String[6];
    }

    public String[] getJueves() {
        return jueves;
    }

    public void setJueves(String[] jueves) {
        this.jueves = jueves;
    }

    public String[] getLunes() {
        return lunes;
    }

    public void setLunes(String[] lunes) {
        this.lunes = lunes;
    }

    public String[] getMartes() {
        return martes;
    }

    public void setMartes(String[] martes) {
        this.martes = martes;
    }

    public String[] getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(String[] miercoles) {
        this.miercoles = miercoles;
    }

    public String[] getViernes() {
        return viernes;
    }

    public void setViernes(String[] viernes) {
        this.viernes = viernes;
    }


}
