package SimulacroAgenda;

import SimulacroAgenda.Contacto;

import java.util.TreeSet;

public class Agenda {
    // El TreeSet mantiene los contactos ordenados automáticamente
    private TreeSet<Contacto> contactos;

    public Agenda() {
        this.contactos = new TreeSet<>();
    }

    public boolean agregarContacto(Contacto nuevo) {
        boolean validacion = true;
        if (contactos.add(nuevo)) {
            System.out.println("Contacto añadido correctamente.");
            validacion = true;
        } else {
            System.out.println("Error: El contacto ya existe en la agenda.");
            validacion = false;
        }
        return validacion;
    }

    public boolean eliminarContacto(String nombre, String apellidos) {
        // Creamos un contacto "temporal" para buscarlo/eliminarlo por nombre y apellidos
        boolean validacion = true;
        Contacto objetivo = new Contacto(nombre, apellidos, "", "", "");
        if (contactos.remove(objetivo)) {
            System.out.println("Contacto eliminado.");
            validacion = true;
        }
        System.out.println("No se encontró el contacto para eliminar.");
        validacion = false;

        return validacion;
    }

    public void buscarContacto(String nombre, String apellidos) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre) && contacto.getApellidos().equalsIgnoreCase(apellidos)) {
                System.out.println("Resultado: [Tel: " + contacto.getTelefono() + " | Email: " + contacto.getEmail() + "]");
            }
            else {
                System.out.println("Contacto no encontrado.");
            }
        }

    }

    // Funcionalidad: Mostrar todos en orden alfabético
    public void mostrarAgenda() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
        } else {
            System.out.println("--- Lista de Contactos ---");
            for (Contacto contacto : contactos) {
                System.out.println(contacto);
            }
        }
    }
}