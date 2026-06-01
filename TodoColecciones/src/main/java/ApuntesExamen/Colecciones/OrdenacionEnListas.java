package ApuntesExamen.Colecciones;

public class OrdenacionEnListas {

    /*
    Imagina que tenemos una lista de objetos de una clase llamada Clase1.
    La interfaz Collection tiene el metodo: Collection.sort(lista)
    Pero debes considerar que para poder ordenar los elementos de la lista (en la clase Clase1)
    hay que  implementar la interfaz Comparable, lo que significa programar el metodo compareTo.
    public int compareTo(object obj)
    El metodo devuelve:
        0 si los objetos son iguales
        1 si el objeto es actual es mayor que el otro
        -1 si el objeto actual es menor que el otro


   public class Persona implements Comparable<Persona> {
       private String nombre;
       private String dni;

       public Persona(String nombre, String dni) {
           this.nombre = nombre;
           this.dni = dni;
       }
       @Override
       public int compareTo(Persona otraPersona) {
           // Comparamos por dni
           return Integer.compare(this.dni, otraPersona.getDni());
       }
       @Override
       public String toString() {
           return nombre + " - con dni" + dni ;
   }
   …}

     */
}
