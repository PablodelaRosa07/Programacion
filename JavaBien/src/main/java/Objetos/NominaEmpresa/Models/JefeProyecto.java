package Objetos.NominaEmpresa.Models;

public class JefeProyecto extends AEmpleado {
    private int numCertificaciones;
    private boolean hablaIngles;

    public JefeProyecto(String id, String nombre, double salario, boolean reduccion,
                        int numCertificaciones, boolean hablaIngles) {
        super(id, nombre, salario, reduccion);
        this.numCertificaciones = numCertificaciones;
        this.hablaIngles = hablaIngles;
    }

    @Override
    public void imprimeHorario() {
        String horario = isTieneReduccion() ? "08:00 a 16:00 (Reducida)" : "08:00 a 19:00";
        System.out.println("Horario Jefe Proyecto: " + horario);
    }

    @Override
    public String devuelveFunciones() {
        return "Planificar, asegurar calidad y plazos, reporting y elaboración de ofertas.";
    }

    @Override
    public double calcularNomina() {
        double plus = (numCertificaciones * 0.05) + (hablaIngles ? 0.3 : 0.0);
        return getSalarioBase() * (1 + plus);
    }
}
