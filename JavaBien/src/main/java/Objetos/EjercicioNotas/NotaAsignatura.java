package Objetos.EjercicioNotas;

public class NotaAsignatura {
    String nombreAsignatura;
    double notaPrimerTrimestre;
    double notaSegundoTrimestre;
    double notaTercerTrimestre;

    public NotaAsignatura(String nombreAsignatura, double notaPrimerTrimestre, double notaSegundoTrimestre, double notaTercerTrimestre) {
        this.nombreAsignatura = nombreAsignatura;
        this.notaPrimerTrimestre = notaPrimerTrimestre;
        this.notaSegundoTrimestre = notaSegundoTrimestre;
        this.notaTercerTrimestre = notaTercerTrimestre;
    }

    public void calculaTrimestresAprobados(){
        int contador = 0;
        if (notaPrimerTrimestre >= 5){
            contador = contador+1;
        }
        if (notaSegundoTrimestre >= 5){
            contador = contador+1;
        }
        if (notaTercerTrimestre >= 5){
            contador = contador+1;
        }
        System.out.println("Ha aprobado " +contador+ " trimestres.");
    }

    public double calculaNotaMediaFinal(){
        return (notaPrimerTrimestre+notaSegundoTrimestre+notaTercerTrimestre)/3;

    }



}
