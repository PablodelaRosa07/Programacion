package Objetos.Refactoriza.Models;

class PersonaRefactoriza {
    private String nombre;
    private IRol[] roles = new IRol[5]; // Espacio para 5 roles máximo
    private int contadorRoles = 0;    // Índice para saber cuántos hay ocupados

    public PersonaRefactoriza(String nombre) {
        this.nombre = nombre;
    }

    public void añadirRol(IRol r) {
        if (contadorRoles < roles.length) {
            roles[contadorRoles] = r;
            contadorRoles++;
        } else {
            System.out.println("Error: " + nombre + " no puede tener más roles.");
        }
    }

    public void realizarActividades() {
        System.out.print(nombre + " está: ");
        if (contadorRoles == 0) {
            System.out.print("descansando.");
        } else {
            // Recorremos solo hasta donde hay roles guardados
            for (int i = 0; i < contadorRoles; i++) {
                roles[i].ejecutar();
            }
        }
        System.out.println();
    }
}

