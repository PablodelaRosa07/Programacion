package Objetos.CadenaAlimenticia.Controller;

import Objetos.CadenaAlimenticia.Models.*;

public class GestionaCadenaAlimenticia {
    private Animal[] tabla = new Animal[4];

    public void cargarAnimales() {
        tabla[0] = new Serpiente("Cobra", "Jungla");
        tabla[1] = new Rapaz("Halcon", "Acantilados");
        tabla[2] = new Roedor("Conejo", "Bosque");
        tabla[3] = new Leon("Leon", "Sabana");
    }

    public Animal buscarAnimal(String nombre) {
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] != null && tabla[i].getEspecie().equalsIgnoreCase(nombre)) {
                return tabla[i];
            }
        }
        return null;
    }

    public void imprimirDepredadorDe(Animal a) {
        if (a == null) return;
        System.out.println(a.getEspecie() + " es depredador de: ");
        boolean encontro = false;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] != null && a.atacar(tabla[i])) {
                System.out.println(tabla[i].getEspecie());
                encontro = true;
            }
        }
        if (!encontro) System.out.println("No depreda a nadie.");
    }

    public void imprimirEsPresaDe(Animal a) {
        if (a == null) return;
        System.out.println(a.getEspecie() + " es presa de: ");
        boolean encontro = false;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] != null && tabla[i].atacar(a)) {
                System.out.println("- " + tabla[i].getEspecie());
                encontro = true;
            }
        }
        if (!encontro) System.out.println("No tiene depredadores.");
    }

    public void imprimirPuedeHuirDe(Animal a) {
        if (a == null) return;
        System.out.println(a.getEspecie() + " puede huir de: ");
        boolean encontro = false;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] != null && tabla[i].atacar(a) && a.huir(tabla[i])) {
                System.out.println("- " + tabla[i].getEspecie());
                encontro = true;
            }
        }
        if (!encontro) System.out.println("No puede huir de nadie.");
    }

    public static void main(String[] args) {
        GestionaCadenaAlimenticia gestor = new GestionaCadenaAlimenticia();
        gestor.cargarAnimales();

        Animal cobra = gestor.buscarAnimal("Cobra");
        gestor.imprimirDepredadorDe(cobra);
        gestor.imprimirEsPresaDe(cobra);
        gestor.imprimirPuedeHuirDe(cobra);

        Animal conejo = gestor.buscarAnimal("Conejo");
        gestor.imprimirDepredadorDe(conejo);
        gestor.imprimirEsPresaDe(conejo);
        gestor.imprimirPuedeHuirDe(conejo);

        Animal leon = gestor.buscarAnimal("Leon ");
        gestor.imprimirDepredadorDe(leon);
        gestor.imprimirEsPresaDe(leon);
        gestor.imprimirPuedeHuirDe(leon);
    }
}

