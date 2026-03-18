package Objetos.PruebaHerencia;

public class Empleado extends Persona{

    public Empleado(String dni) {
        super(dni);
    }

    @Override
    protected void comer() {
        System.out.println("Comiendo empleado");
    }
}
