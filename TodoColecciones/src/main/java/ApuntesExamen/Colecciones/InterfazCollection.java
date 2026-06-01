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

     */


}
