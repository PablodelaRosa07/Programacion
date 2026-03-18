package Objetos.NominaEmpresa.Models;

public class Desarrollador extends AEmpleado {
    private int numTecnologias;
    private int numFrameworks;
    private String turno; // "Mañana" o "Tarde"

    public Desarrollador(String id, String nombre, double salario, boolean reduccion,
                         int numTecnologias, int numFrameworks, String turno) {
        super(id, nombre, salario, reduccion);
        this.numTecnologias = numTecnologias;
        this.numFrameworks = numFrameworks;
        this.turno = turno;
    }

    @Override
    public void imprimeHorario() {
        String horario;
        if (turno.equalsIgnoreCase("Mañana")) {
            horario = isTieneReduccion() ? "08:00 a 14:00 (Reducida)" : "08:00 a 16:00";
        } else {
            horario = isTieneReduccion() ? "16:00 a 22:00 (Reducida)" : "16:00 a 00:00";
        }
        System.out.println("Horario Desarrollador: " + horario);
    }

    @Override
    public String devuelveFunciones() {
        return "Codificar, diseñar planes de pruebas y ejecutarlos.";
    }

    @Override
    public double calcularNomina() {
        double plus = (numTecnologias * 0.01) + (numFrameworks * 0.03);
        return getSalarioBase() * (1 + plus);
    }
}
