package BoletinOrdenaciones.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        Agenda agenda = new Agenda();

        Contacto contacto1 = new Contacto("Pablo", "de la Rosa", "abc@gmail.com", "Calle hola, 12", 123456789);
        Contacto contacto2 = new Contacto("Anabel", "Lopez", "def@gmail.com", "Calle 13", 987654321);

        System.out.println("Elige opcion: 1 - Agregar contacto. 2 - Eliminar contacto. 3 - Buscar contacto. 4 - Mostrar agenda. 5 - Salir");
        int opcion = sc.nextInt();

        while (!salir){
            if (opcion == 1){
                main.agregarContacto(contacto1, agenda);
                System.out.println("Elige opcion: 1 - Agregar contacto. 2 - Eliminar contacto. 3 - Buscar contacto. 4 - Mostrar agenda. 5 - Salir");
                opcion = sc.nextInt();
            }
            if (opcion == 2){
                main.eliminarContacto(contacto1, agenda);
                System.out.println("Elige opcion: 1 - Agregar contacto. 2 - Eliminar contacto. 3 - Buscar contacto. 4 - Mostrar agenda. 5 - Salir");
                opcion = sc.nextInt();
            }
            if (opcion == 3){
                main.buscarContacto(contacto2, agenda);
                System.out.println("Elige opcion: 1 - Agregar contacto. 2 - Eliminar contacto. 3 - Buscar contacto. 4 - Mostrar agenda. 5 - Salir");
                opcion = sc.nextInt();
            }
            if (opcion == 4){
                main.mostrarLista(agenda);
                System.out.println("Elige opcion: 1 - Agregar contacto. 2 - Eliminar contacto. 3 - Buscar contacto. 4 - Mostrar agenda. 5 - Salir");
                opcion = sc.nextInt();
            }
            if (opcion == 5){
                salir = true;
            }
            if (opcion < 1 || opcion > 5){
                System.out.println("Elige opcion: 1 - Agregar contacto. 2 - Eliminar contacto. 3 - Buscar contacto. 4 - Mostrar agenda. 5 - Salir");
                opcion = sc.nextInt();
            }

        }

    }

    public void agregarContacto(Contacto contacto, Agenda agenda){
        System.out.println("AÑADIENDO CONTACTO");
        if (agenda.getListaContactos().contains(contacto)){
            System.out.println("No se ha añadido porque ya estaba en la agenda");
        }
        else {
            agenda.getListaContactos().add(contacto);
            System.out.println(contacto.getNombre()+ " añadido");
        }
    }

    public void eliminarContacto(Contacto contacto, Agenda agenda){
        System.out.println("ELIMINANDO CONTACTO");
        if (!agenda.getListaContactos().contains(contacto)){
            System.out.println("No se ha eliminado porque no estaba en la agenda");
        }
        else {
            agenda.getListaContactos().remove(contacto);
            System.out.println(contacto.getNombre()+ " eliminado");
        }
    }

    public void buscarContacto(Contacto contacto, Agenda agenda){
        System.out.println("BUSCANDO CONTACTO");
        if (agenda.getListaContactos().contains(contacto)){
            System.out.println("Num de Telefono: "+contacto.getNumTelefono()+ " | Email: "+contacto.getEmail());
        }
        else {
            System.out.println("No se ha encontrado el contacto");
        }
    }

    public void mostrarLista(Agenda agenda){
        System.out.println("MOSTRANDO AGENDA");
        System.out.println(agenda.getListaContactos());
    }

    public void buscarTelefono(Contacto contacto, Agenda agenda, Scanner sc){
        System.out.println("BUSCANDO TELEFONO");
        List<String> listaMostrar = new ArrayList<>();
        System.out.println("Introduce telefono: ");
        int resultado = sc.nextInt();
        for (int i = 0; i < agenda.getListaContactos().size(); i++) {
            if (resultado == agenda.getListaContactos().get(i).getNumTelefono()){
                listaMostrar.add(agenda.getListaContactos().get(i).getNombre());
            }
        }
        System.out.println("MOSTRANDO LISTA DE CONTACTOS CON ESE NUMERO");
        System.out.println(listaMostrar);
    }

    // No tendria sentido, se haria con el equals and hashcode

}
