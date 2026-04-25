package ApuntesExamen.Colecciones;

public class InterfazComparator {

    /*
    Para ordenar por un criterio en concreto, diferente al definido como natural, usamos el metodo estático:
    Collection.sort(lista, objetoComparador)
    El objetoComparador debe implementar la clase Comparator y su metodo  public int compare(Persona o1, Persona o2)
    De nuevo, el metodo compare devuelve un entero:
    o1 < o2	un número menor a cero
    o1 == o2	cero
    o1 > o2	un mayor menor a cero

    A continuación puedes ver cómo se crearía un comparador por el indentificador de persona:
    class ComparadorPorNombre implements Comparator<Persona> {
       @Override
       public int compare(Persona o1, Persona o2) {
           return o1.getNombre().compareTo(o2.getNombre());
       }}
    Uso para ordenador por identificador en lugar de por el criterio definido en compareTo
    Collections.sort(listaPersonas, new ComparadorPorNombre ());


    Resumen ordenaciones:
    El objeto a ordenar debe implementar interfaz Comparable (compareTo) para definir un orden natural
    Este orden natural se tendrá en cuenta en:
        En la inserción  si usamos TreeSet (Comparable)
        Para el resto de estructuras de almacenamiento, se tendrá en cuenta al presentar los datos ordenados mediante la llamada:
        Collections.sort(lista);
        // Esta llamada usará el criterio del metodo compareTo
    Para presentar los datos ordenados por otro criterio, debemos crear una clase que implemente
    la interfaz Comparator y su metodo compare. Collections.sort(lista, new Comparador1())
    Importante: no es posible usar el Collection.sort con TreeSet ya que ya son estructuras ordenadas.



    public class Estudiante implements Comparable<Estudiante> {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Sobreescribimos compareTo para ordenar por nombre alfabéticamente
    @Override
    public int compareTo(Estudiante otroEstudiante) {
        // Utilizamos el metodo compareTo de la clase String
        return this.nombre.compareTo(otroEstudiante.getNombre());
    }
    }
    ¿Cómo funciona el resultado?
    El metodo devuelve un número entero que le indica a Java cómo ordenar los elementos:

    Resultado negativo (< 0): El objeto actual (el de la izquierda) debe ir antes que el objeto con el que se compara.

    Resultado cero (0): Ambos nombres son idénticos.

    Resultado positivo (> 0): El objeto actual debe ir después que el objeto con el que se compara.

    ¿Cómo se usa en la práctica?
    Una vez que implementas la interfaz, puedes usar herramientas nativas de Java para ordenar colecciones automáticamente:

    Java
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;

    public class Main {
        public static void main(String[] args) {
            List<Estudiante> clase = new ArrayList<>();
            clase.add(new Estudiante("Zaira"));
            clase.add(new Estudiante("Alejandro"));
            clase.add(new Estudiante("Beatriz"));

            // Ordenar la lista (usando el compareTo que definimos)
            Collections.sort(clase);

            for (Estudiante e : clase) {
                System.out.println(e.getNombre());
            }
            // Resultado: Alejandro, Beatriz, Zaira
        }
    }
     */
}
