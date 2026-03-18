package Objetos.Vehiculo2;

public class Automovil extends Vehiculo {
    public Automovil(String matricula, String marca, String modelo, String distintivo) {
        super(matricula, marca, modelo, distintivo);
    }

    @Override
    public String getLicencias() {
        return "Permiso B";
    }
}


