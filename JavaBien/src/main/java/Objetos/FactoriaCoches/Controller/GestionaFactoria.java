package Objetos.FactoriaCoches.Controller;

import Objetos.FactoriaCoches.Models.*;

public class GestionaFactoria {
    public static void main(String[] args) {

        Robot[] inventarioRobots = new Robot[20];
        int numeroRobot =0;

        inventarioRobots[0] = new RobotSoldador("Robot1", 50, Estado.ENCENDIDO, "Soldador", 1250.0, "3");
        numeroRobot = numeroRobot+1;
        inventarioRobots[1] = new RobotPintor("Robot2", 5, Estado.ALERTA, "Pintor");
        numeroRobot = numeroRobot+1;
        inventarioRobots[2] = new RobotEnsamblador("Robot3", 80, Estado.APAGADO, "Ensamblador");
        numeroRobot = numeroRobot+1;

        System.out.println("LISTADO DE INVENTARIO");
        for (int i = 0; i < numeroRobot; i++) {
            System.out.println(inventarioRobots[i].toString());
            System.out.println("Tarea: " + inventarioRobots[i].ejecutarTarea());
            System.out.print("Intento de recarga: ");
            inventarioRobots[i].recargar();

            if (inventarioRobots[i] instanceof DispositivoWIFI) {
                ((DispositivoWIFI) inventarioRobots[i]).conectarWIFI();
            }
            System.out.println("---------------------------------------");
        }



        }
    }
