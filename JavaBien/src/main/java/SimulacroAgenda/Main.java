package SimulacroAgenda;

public class Main {
    public static void main(String[] args) {
        Agenda miAgenda = new Agenda();

        // Agregamos contactos en desorden
        miAgenda.agregarContacto(new Contacto("Zaira", "López", "zaira@mail.com", "Calle A", "111"));
        miAgenda.agregarContacto(new Contacto("Alberto", "García", "alberto@mail.com", "Calle B", "222"));
        miAgenda.agregarContacto(new Contacto("Alberto", "Anaya", "anaya@mail.com", "Calle C", "333"));

        // Intentar agregar duplicado
        miAgenda.agregarContacto(new Contacto("Zaira", "López", "otra@mail.com", "Calle D", "444"));

        // Mostrar lista (Debe salir: Alberto Anaya, Alberto García, Zaira López)
        miAgenda.mostrarAgenda();

        // Buscar
        miAgenda.buscarContacto("Alberto", "García");

        // Eliminar y mostrar de nuevo
        miAgenda.eliminarContacto("Alberto", "García");
        miAgenda.mostrarAgenda();
    }
}
