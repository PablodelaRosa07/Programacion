package Mapas.Prueba1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GestionaMapas {
    static void main(String[] args) {
        Map<Persona, Double> map = new HashMap<Persona, Double>();

        Persona persona1 = new Persona("12345678A");
        Persona persona2 = new Persona("87654321B");
        Persona persona3 = new Persona("01010101C");

        map.put(persona1, 1d);
        map.put(persona2, 2d);
        map.put(persona3, 3d);

        System.out.println(map.toString());
        System.out.println(map.size());

        Set<Persona> claves = map.keySet();
        System.out.println(claves);

        Collection<Double> valores = map.values();
        System.out.println(valores);


    }
}
