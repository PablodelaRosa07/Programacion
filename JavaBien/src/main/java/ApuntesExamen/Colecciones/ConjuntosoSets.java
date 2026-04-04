package ApuntesExamen.Colecciones;

public class ConjuntosoSets {

    /*
    Hasta ahora hemos visto las listas. Las listas, por defecto, nos permitían añadir elementos repetidos y
    los elementos no se insertan considerando ningún tipo de orden.
    Hemos visto cómo podíamos ordenar una lista o cualquier otra colección con el metodo Collection.sort(coleccionAOrdenar).
    Java dispone de estructuras de datos que no permite elementos duplicados e, incluso,
    que pueden insertar los elementos de manera que se mantienen ordenados.
    Estas estructuras son los conjuntos implementados por la interfaz Set.

    La interfaz Set trata los datos como un conjunto matemático eliminando elementos repetidos
    Al intentar agregar un elemento repetido (ya sea con el metodo add o el metodo addAll),
    no se producirá ninguna excepción, no se agrega y se devolverá false.
    Como inconveniente, la interfaz Set no dispone de métodos para acceso a una posición en concreta aunque sí se pueden usar iteradores.


    add(element)
    Este metodo se utiliza para añadir un elemento específico al conjunto.
    La función añade el elemento sólo si el elemento especificado no está ya presente en el conjunto,
    de lo contrario la función devuelve False si el elemento ya está presente en el Set.

    addAll(collection)
    Este metodo se utiliza para añadir un elemento específico al conjunto.
    Este metodo se utiliza para añadir todos los elementos de la colección mencionada al conjunto existente.
    Los elementos se añaden aleatoriamente sin seguir ningún orden específico.

    clear()
    Este metodo se utiliza para eliminar todos los elementos del conjunto, pero no lo borra.
    La referencia del conjunto sigue existiendo.

    contains(element)
    Este metodo se utiliza para comprobar si un elemento específico está presente en el Set o no.

    containsAll(collection)
    Este metodo se utiliza para comprobar si el conjunto contiene todos los elementos presentes en la colección dada o no.
    Este metodo devuelve verdadero si el conjunto contiene todos los elementos y devuelve falso si falta alguno.

    isEmpty()
    Este metodo se utiliza para comprobar si el conjunto está vacío o no.

    iterator()
    Este metodo se utiliza para devolver el iterador del conjunto. Los elementos del conjunto se devuelven en un orden aleatorio.

    remove(element)
    Este metodo se utiliza para eliminar el elemento dado del conjunto.
    Este metodo devuelve True si el elemento especificado está presente en el conjunto, de lo contrario devuelve False.

    removeAll(collection)
    Este metodo se utiliza para eliminar todos los elementos de la colección que están presentes en el conjunto.
    Este metodo devuelve true si este conjunto cambió como resultado de la llamada.

    retainAll(collection)
    Este metodo se utiliza para retener todos los elementos del conjunto que se mencionan en la colección dada.
    Este metodo devuelve true si este conjunto cambió como resultado de la llamada.

    size()
    Este metodo se utiliza para obtener el tamaño del conjunto. Devuelve un valor entero que significa el número de elementos.

    toArray()
    Este metodo se utiliza para formar una matriz con los mismos elementos que la del Set.


    HashSet
    La clase HashSet crea una colección que utiliza una tabla hash para el almacenamiento.
    Hashset sólo contiene elementos únicos y hereda la clase AbstractSet e implementa la interfaz Set.
    Además, utiliza un mecanismo de hashing para almacenar los elementos.
    Sintaxis:
    Set<String> conjunto = new HashSet<String>();
    Tiene buen rendimiento en recorridos aunque no garantiza ningún orden en la inserción.


    LinkedHashSet
    Es una implementación de tabla Hash y LinkedIn de la interfaz de conjunto.
    Contiene sólo elementos únicos como HashSet.
    LinkedHashSet también proporciona todas las operaciones de conjuntos opcionales y mantiene el orden de inserción
    Sintaxis:
    Set<String> conjunto = new LinkedHashSet<String>();
    La clase LinkedHashSet de Java contiene elementos únicos solo como HashSet.
    Orden de inserción (inserta por el final)
    Su rendimiento es peor que el anterior en recorridos.


    TreeSet:
    Es una implementación de la interfaz SortedSet y Contiene sólo elementos únicos y sus elementos están ordenados
    Sintaxis:
    Set<T> conjunto = new TreeSet<T>();
    ¿Cómo se ordena? El criterio de ordenación por defecto es el proporcionado por el metodo compareTo() de la interfaz Comparable
    Usa un árbol para el almacenamiento de manera que los datos se insertan ordenados.
    Ventajas: El tiempo de búsqueda de un elemento es más rápida, ya que los elementos están ordenados.
    Desventajas: Las inserciones y recorridos tienen peor rendimiento.


    TreeSet:
    Metodo                         Descripción
    boolean addAll(Collection c)   Agrega todos los elementos del set
    boolean contains(Object o)     Obtiene true si un elemento pertenece al set
    boolean isEmpty()              Obtiene true si un set está vacío
    boolean remove(Object o)       Elimina un elemento del set
    void add(Object o)             Agrega todos los elementos del set
    void clear()                   Elimina todos los elementos del set
    Object clone()                 Clona el set
    Object first()                 Obtiene el primer elemento del set estan ordenados
    Object last()                  Obtiene el ultimo elemento del set estan ordenados
    int size()                     Obtiene el tamaño del set




     */
}
