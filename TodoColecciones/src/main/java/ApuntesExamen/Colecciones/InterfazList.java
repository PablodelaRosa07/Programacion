package ApuntesExamen.Colecciones;

public class InterfazList {

    /*
    La interfaz List es una colección que cumple:
        Puede contener elementos repetidos.
        El orden de inserción es relevante.
        No sería la colección adecuada si deseamos controlar que no hay elementos repetidos.


    Se añaden métodos adicionales a los de Collection:
        · add(Object o): Añade un objeto al final de la lista.
        . add(int indice, Object o): Añade un objeto a la lista en la posición indicada.
        · get(int indice): Devuelve el objeto de la lista de la posición indicada
        (el primero el 0)
        . set(int indice, Object nuevo): Reemplaza el objeto que se encuentra en la
        posición i por el nuevo elemento devolviendo el objeto que ha sido reemplazado.
        · remove(int indice): Elimina el objeto de la lista pasado por parámetro.
        · indexOf(Object o): Devuelve la posición de la primera vez que un elemento
        coincida con el objeto pasado por parámetro. Si el elemento no se encuentra
        devuelve -1.
        . lastindexOf(Object o): Devuelve la posición de la última vez que un elemento
        coincida con el objeto pasado por parámetro. Si el elemento no se encuentra
        devuelve -1.


    ArrayList
    En esta estructura los datos se almacenan de manera consecutiva como en los arrays.
    Sin embargo, ArrayList es expansible (su tamaño varía).
        Se define de la siguiente forma:
        List<Tipo>  nombre = new ArrayList <Tipo>();
        Ventaja: rápido acceso
        Desventaja: No es adecuada si deseamos eliminar o agregar elementos en el medio.
        Ya que supone mover todos los consecutivos para generar o eliminar el hueco que se genera.


    LinkedList
    Los elementos en una LinkedList o lista enlazada no se guardan consecutivamente sino
    que cada elemento contiene la referencia a su anterior y a su siguiente.  Cada nodo está enlazado con sus consecutivos.
        List<Tipo>  nombre = new LinkedList <Tipo>();
        La ventaja es que la inserción o eliminación de elementos es mucho más rápida
        porque no supone desplazar el resto, tan sólo supone cambiar las referencias a su anterior y/o posterior.
        Como inconveniente, el acceso a un elemento. Es por ello que debe recorrerse mediante iteradores.
        for(int i = 0 ; i < lista.size(); i++) {
        System.out.println( lista.get(i));
        }
        Esto es muy lento. NO acceder ni así ni con forEach, usar iteradores

    List<String> ciudades = new LinkedList<String>();
        ciudades.add("Madrid");
        ciudades.add("Barcelona");
        ciudades.add("Sevilla");
        ciudades.add("Madrid"); //repetido

        //Iteramos sobre el conjunto
        Iterator<String> itr = ciudades.iterator();
        while(itr.hasNext())
             System.out.println(itr.next());


        Recorrer un ArrayList
        public class EjemploIterator {
            public static void main(String[] args) {
                List<String> lista = new ArrayList<>();
                lista.add("Manzana");
                lista.add("Banana");
                lista.add("Naranja");

                // Obtener el iterador
                Iterator<String> it = lista.iterator();

                // Recorrer la lista
                while (it.hasNext()) {
                    String fruta = it.next();
                    System.out.println(fruta);
                }
            }
        }


        Eliminar Elementos de Forma Segura
        public class EliminarConIterator {
            public static void main(String[] args) {
                List<Integer> numeros = new ArrayList<>();
                for (int i = 1; i <= 5; i++) numeros.add(i);

                Iterator<Integer> it = numeros.iterator();
                while (it.hasNext()) {
                    Integer num = it.next();
                    if (num % 2 == 0) {
                        it.remove(); // Elimina el elemento par de forma segura
                    }
                }
                System.out.println(numeros); // Salida: [1, 3, 5]
            }
        }


        Métodos Clave de Iterator
        hasNext(): Booleano, comprueba si hay más elementos.
        next(): Devuelve el siguiente objeto.
        remove(): Elimina el último elemento devuelto por next()



     */
}
