package Excepciones.EjerciciosExcepciones.Cinco;

public class GestionaExcepcionesEjercicio5 {
    void metodo1(){
        try {
            throw new MiExcepcion("Lanzando mi Excepcion");
        }
        catch (MiExcepcion e){
            System.out.println(e.toString());
        }
    }

    static void main(String[] args) {
        GestionaExcepcionesEjercicio5 g = new GestionaExcepcionesEjercicio5();
        g.metodo1();
    }
}
