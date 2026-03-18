package Objetos.NominaEmpresa.Controller;

import Objetos.NominaEmpresa.Models.Desarrollador;
import Objetos.NominaEmpresa.Models.JefeProyecto;

public class GestionaEmpleados {
    public static void main(String[] args) {
        Desarrollador prog = new Desarrollador("P001", "Ana García", 2000, true, 3, 2, "Tarde");

        JefeProyecto jefe = new JefeProyecto("J001", "Carlos Pérez", 3500, false, 2, true);

        System.out.println("--- DATOS EMPLEADOS ---");
        System.out.println(prog);
        prog.imprimeHorario();
        System.out.println("Funciones: " + prog.devuelveFunciones());

        System.out.println("\n-----------------------");

        System.out.println(jefe);
        jefe.imprimeHorario();
        System.out.println("Funciones: " + jefe.devuelveFunciones());

        Desarrollador progClon = new Desarrollador("P001", "Ana Duplicada", 1000, false, 0, 0, "Mañana");
        System.out.println("\n¿Es el programador original igual al clon por ID?: " + prog.equals(progClon));
    }
}
