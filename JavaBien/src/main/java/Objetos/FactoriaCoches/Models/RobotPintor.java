package Objetos.FactoriaCoches.Models;

public class RobotPintor extends Robot implements DispositivoWIFI {
    public RobotPintor(String modelo, int bateria, Estado estado, String desc) {
        super(modelo, bateria, estado, "Electricidad", desc);
    }

    @Override
    public String ejecutarTarea() {
        return "Aplicando pintura.";
    }

    @Override
    public boolean recargar() {
        System.out.println("Recargando por electricidad");
        return true;
    }

    @Override
    public void conectarWIFI() {
        System.out.println("Pintor conectado.");
    }
    @Override
    public void desconectarWIFI() {
        System.out.println("Pintor desconectado.");
    }
}