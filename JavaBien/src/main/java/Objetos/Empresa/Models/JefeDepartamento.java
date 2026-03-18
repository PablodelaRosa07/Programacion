package Objetos.Empresa.Models;

public class JefeDepartamento extends Empleado implements ActualizableSueldo{

    private int antigüedadEmpresa;

    public JefeDepartamento(String DNI, String nombre, int sueldo, int antigüedadEmpresa) {
        super(DNI, nombre, sueldo);
        this.antigüedadEmpresa = antigüedadEmpresa;
    }

    public int getAntigüedadEmpresa() {
        return antigüedadEmpresa;
    }

    public void setAntigüedadEmpresa(int antigüedadEmpresa) {
        this.antigüedadEmpresa = antigüedadEmpresa;
    }


    @Override
    public void actualizarSueldo(double porcentaje) {
        porcentaje = 10;
        this.setSueldo((int) (this.getSueldo()*(1+(porcentaje/100))));
    }
}
