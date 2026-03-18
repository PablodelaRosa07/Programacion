package Objetos.FactoriaCoches.Models;

public class RobotSoldador extends Robot implements DispositivoWIFI {
    private double temperatura;
    private String especificacionSeguridad;

    public RobotSoldador(String modelo, int bateria, Estado estado, String desc, double temp, String seg) {
        super(modelo, bateria, estado, "Electricidad", desc);
        this.temperatura = temp;
        this.especificacionSeguridad = seg;
    }

    @Override
    public String ejecutarTarea() { return "Realizando soldaduras."; }

    @Override
    public boolean recargar() {
        if (this.getEstado() == Estado.APAGADO) {
            System.out.println("Recargando por electricidad");
            return true;
        }
        System.out.println("Estoy encendido y no puedo recargar");
        return false;
    }

    @Override
    public void conectarWIFI() {
        System.out.println("Soldador conectado.");
    }
    @Override
    public void desconectarWIFI() {
        System.out.println("Soldador fuera de línea.");
    }
}