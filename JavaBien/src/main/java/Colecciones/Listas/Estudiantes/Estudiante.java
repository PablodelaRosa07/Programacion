package Colecciones.Listas.Estudiantes;

import java.util.ArrayList;
import java.util.List;

class Estudiante {
    String nombre;
    String id;
    List<Double> notas = new ArrayList<>();

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public double obtenerPromedio() {
        double promedio = 0;
        if (notas.size() > 0) {
            double suma = 0;
            for (double n : notas) {
                suma = n+suma;
            }
            promedio = suma / notas.size();
        }
        return promedio;
    }
}