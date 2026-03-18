package Objetos.Empresa.Models;

public class EmpleadoBase extends Empleado implements ActualizableSueldo{

    private Puesto puesto;

    public EmpleadoBase(String DNI, String nombre, int sueldo, Puesto puesto) {
        super(DNI, nombre, sueldo);
        this.puesto = puesto;
    }



    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public void fijarSueldo(){
        if (this.getPuesto().equals("ADMINISTRATIVO")){
            setSueldo(1150);
        }

        if (this.getPuesto().equals("OPERARIO")){
            setSueldo(1100);
        }

        if (this.getPuesto().equals("CONTABLE")){
            setSueldo(1350);
        }
    }

    @Override
    public void actualizarSueldo(double porcentaje) {
        this.setSueldo((int) (this.getSueldo()*1.025));
    }
}
