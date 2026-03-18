package Objetos.Vehiculo;

public class Automovil extends Vehiculo {
    public Automovil(String matricula, String distintivo) {
        super(matricula, distintivo);
    }

    @Override
    public String getLicencias() {
        return "Permiso B";
    }
}
