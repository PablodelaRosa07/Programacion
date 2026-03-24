package Colecciones.Clone.EmpresaCoches;

public class Motor implements Cloneable{

    private Combustible combustible;
    private int cv; //caballos de vapor
    private boolean enMarcha; //estado del motor

    public Motor(Combustible combustible, int cv, boolean enMarcha) {
        this.combustible = combustible;
        this.cv = cv;
        this.enMarcha = enMarcha;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }



    @Override
    public String toString() {
        return "Motor{" +
                "combustible=" + combustible +
                ", cv=" + cv +
                ", enMarcha=" + enMarcha +
                '}';
    }

    @Override
    public Motor clone() {
        try {
            Motor clone = (Motor) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
