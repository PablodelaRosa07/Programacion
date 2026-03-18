package Colecciones.Listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GestionaListas {
    static void main(String[] args) {
        List<String> ciudades = new ArrayList<String>();
        ciudades.add("Madrid");
        ciudades.add("Barcelona");
        ciudades.add("Sevilla");
        ciudades.add("Huelva");

        for (String elemento : ciudades){
            System.out.println(elemento);
        }

        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println(ciudades.get(i));
        }

        Iterator <String> iterador = ciudades.iterator();
        while (iterador.hasNext()){
            System.out.println(iterador.next());
        }
    }
}
