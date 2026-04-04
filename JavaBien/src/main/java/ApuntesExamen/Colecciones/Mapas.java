package ApuntesExamen.Colecciones;

public class Mapas {

    /*
    Los mapas o diccionarios son estructuras dinámicas de datos donde la información se guarda por pares (clave/valor)
    La clave representa a un valor único que identifica al par.
    La interfaz Map NO implemetan de Collection y contiene tres implementaciones.


    HashMap: Los datos se guardan sin ningún tipo de orden.  Sin embargo, es la más eficiente.
    LinkedHashMap:  Se guardan en el orden en el que se han insertado, al igual que ocurre con LinkedHashSet.
    Es eficiente en las operaciones de inserción y eliminación pero no tanto en las búsqueda.
    TreeMap: Semejante a TreeSet. Los datos se guardan ordenados según el orden natural
    definido de su clave (Comparable o Comparator) Si la clave es de una clase propia, deberá implementar Comparable


    Declaración e inicialización:
    Map <K, V> mapa = new HashMap<>();
    Map <String, Integer> mapa = new HashMap<>();
    Agregar elementos V put(K clave, V valor);
    Agrega / modifica y devuelve:
    nulo, si no existía un par con esa clave
    Si existe la clave, modifica el valor con el nuevo y lo devuelve
    mapa.put(“María”, 3);
    mapa.put(“Pedro”, 5);
    mapa.put(“María”, 6);


    Convertir en Cadena La interfaz Map tiene sobreescrito el metodo toString
    mapa.toString(); → Devolvería {María= 6, Pedro= 5}
    Los mapas se delimitan por {} en lugar de por [] (colecciones)
    Devolver un valor asociado a una clave:  V get(Object clave);
    Devuelve el valor asociado a una clave si existe esa clave o nulo si el mapa no contiene un par con esa clave.
    mapa.get(“Pedro”) → Devuelve 5
    mapa.get(“Amparo”) → Devuelve nulo


    Eliminar elementos  V remove(Object clave);
    Elimina la entrada con esa clave y devuelve
    Si existe la clave, devuelve esa clave
    Devuelve nulo si en el mapa no hay ningún par con esa clave
    mapa.remove(“María”);
    Eliminar todas las entradas   void clear();
    Verificar si contiene una clave:
    boolean containsKey(Object clave);
    mapa.containsKey(“Pedro”);
    Verificar si contiene un valor:
    boolean containsValue(Object clave);
    containsValue(5);


    Devolver todas las claves de un mapa Set<K> keySet();
    Set<String> claves = mapa.keySet();
    Devolver todos los valores de un mapa
    Collection<V> values();
    Collection<String> valores = mapa.values();


    Los mapas no son iterables (ni con iterator ni con foreach). Es por ello que necesitamos de la siguiente operación
    Obtener vistas de entradas. Devuelve una vista conjunto de las entradas de los objetos tipo Map.Entry  (interfaz)
    Set<Map.Entry <K,V>> entradas = m.entrySet();
    Set<Map.Entry <String, Integer>> entradas = mapa.entrySet();
    System.out.println(entradas);
    → [María= 6, Pedro= 5]
    Importante: La vista es una referencia al mapa inicial,
    por lo que cualquier cambio en la vista supondrá un cambio también en el mapa


    Al pasar a Set disponemos de los métodos de Collection: iterator, remove, removeAll, retainAll, etc.
    Ejemplo:
            Map<String, Double> notasAlumnado = new HashMap<>();
            notasAlumnado.put("Rosa", 3.9);
            notasAlumnado.put("Lourdes", 9.0);
            notasAlumnado.put("Rosa", 5.0);
            System.out.println(notasAlumnado);
            Set<Map.Entry <String, Double>> entradas = notasAlumnado.entrySet();
            Entry <String, Double> elemento;
    Iterator it = entradas.iterator();
            while(it.hasNext())
            {
                elemento = (Entry<String, Double>) it.next();
                System.out.println(elemento);
                System.out.println(elemento.getKey());
                System.out.println(elemento.getValue());
                elemento.setValue(6.0);
            }
            System.out.println(notasAlumnado);
        …



    HashMap
    Map<Integer, String> map = new HashMap<Integer, String>();
    map.put(1, "Casillas");		map.put(15, "Ramos");
    map.put(3, "Pique");		map.put(5, "Puyol");
    map.put(11, "Capdevila");	map.put(14, "Xabi Alonso");
    map.put(16, "Busquets");	map.put(8, "Xavi Hernandez");
    map.put(18, "Pedrito");		map.put(6, "Iniesta");
    map.put(7, "Villa");

    // Imprimimos el Map con un Iterador
    Iterator it = map.keySet().iterator();
    while(it.hasNext()){
      Integer key = it.next();
      System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
    }
    //El resultado son los datos sin ningún tipo de ordenación: ni inserción ni natural


    LinkedHashMap
    Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
    linkedHashMap.put(1, "Casillas");	linkedHashMap.put(15, "Ramos");
    linkedHashMap.put(3, "Pique");		linkedHashMap.put(5, "Puyol");
    linkedHashMap.put(11, "Capdevila");	linkedHashMap.put(14, "Xabi Alonso");
    linkedHashMap.put(16, "Busquets");	linkedHashMap.put(8, "Xavi Hernandez");
    linkedHashMap.put(18, "Pedrito");	linkedHashMap.put(6, "Iniesta");
    linkedHashMap.put(7, "Villa");

    // Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
    it = linkedHashMap.keySet().iterator();
    while(it.hasNext()){
      Integer key = it.next();
      System.out.println("Clave: " + key + " -> Valor: " + linkedHashMap.get(key));
    }
    // Se imprimirá por orden de inserción


    TreeMap
    Map<Integer, String> treeMap = new TreeMap<Integer, String>();
    treeMap.put(1, "Casillas");	treeMap.put(15, "Ramos");
    treeMap.put(3, "Pique");	treeMap.put(5, "Puyol");
    treeMap.put(11, "Capdevila");	treeMap.put(14, "Xabi Alonso");
    treeMap.put(16, "Busquets");	treeMap.put(8, "Xavi Hernandez");
    treeMap.put(18, "Pedrito");	treeMap.put(6, "Iniesta");
    treeMap.put(7, "Villa");

    // Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
    it = treeMap.keySet().iterator();
    while(it.hasNext()){
      Integer key = it.next();
      System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));
    }
    // Se imprimirá por orden  natural: numérico ascendente










     */
}
