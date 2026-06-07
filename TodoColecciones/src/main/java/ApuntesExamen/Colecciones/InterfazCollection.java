package ApuntesExamen.Colecciones;

public class InterfazCollection {

    /*
    La interfaz Collection proporciona métodos para:
        Añadir elementos: boolean add(E e)
        Añadir una colección a otra colección:  boolean addAll(Collection c)
        Eliminar elementos: boolean remove(E e)
        Eliminar una colección a otra colección:  boolean removeAll(Collection c)
        Saber su tamaño:  int  size()
        Saber si está vacío:  boolean isEmpty()
        Y convertir a tabla:  Object[]  toArray()


    Recorrer una Collection
        List <String> lista = new ArrayList <String> ();
        lista.add("Pedro");
        lista.add("David");
        lista.add("Miguel");
        lista.add("Antonio");
        lista.add("Pedro");
        for (String cadena: lista)
        {
            System.out.println(cadena);
        }


    Iterator
    A su vez la interfaz Collection implementa la interfaz Iterator.
        Un iterador es un elemento para recorrer o modificar la colección de elementos
        Collection dispone de un metodo Iterator<E> iterator()
        Sobre este objeto iterator podremos invocar a los siguientes métodos:
        hasNext(): Devuelve cierto si quedan elementos
        next(): Devuelve el siguiente elemento
        remove(): Borra el último elemento devuelto por next()





    public class RepositorioActividades {

    private Set<Actividad> actividades = new HashSet<>();

    // ... (resto de métodos anteriores)


    Ejemplo de Iterator: Recorre las actividades y elimina
    aquellas que ya hayan pasado (anteriores a la fecha dada).

    public void eliminarActividadesCaducadas(LocalDate fechaLimite) {
        // 1. Obtenemos el iterador del conjunto de actividades
        Iterator<Actividad> iterador = actividades.iterator();

        // 2. El bucle se ejecuta mientras queden elementos por revisar
        while (iterador.hasNext()) {

            // 3. Saltamos al siguiente elemento y lo guardamos
            Actividad unaActividad = iterador.next();

            // 4. Aplicamos la lógica de filtrado
            if (unaActividad.getFecha().isBefore(fechaLimite)) {
                System.out.println("Eliminando actividad obsoleta: " + unaActividad.getNombre());

                // 5. Eliminamos el elemento de forma segura usando el iterador
                iterador.remove();
            }
        }
    }
}
     */





}
