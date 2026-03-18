package Objetos.FactoriaCoches.Models;

public class RobotEnsamblador extends Robot {
    public RobotEnsamblador(String modelo, int bateria, Estado estado, String desc) {
        super(modelo, bateria, estado, "Gasolina", desc);
    }

    @Override
    public String ejecutarTarea() {
        return "Ensamblando.";
    }

    @Override
    public boolean recargar() {
        if (this.getEstado() == Estado.APAGADO) {
            System.out.println("Recargando por gasolina");
            return true;
        }
        System.out.println("Estoy encendido y no puedo recargar");
        return false;
    }
}