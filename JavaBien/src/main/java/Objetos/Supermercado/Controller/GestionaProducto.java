package Objetos.Supermercado.Controller;

import Objetos.Supermercado.Models.Detergente;
import Objetos.Supermercado.Models.Pescado;
import Objetos.Supermercado.Models.Producto;
import Objetos.Supermercado.Models.Vino;

public class GestionaProducto {
    static void main(String[] args) {

        Producto producto1 = new Detergente("Limpia todo", "1234A", 21, "ArielUltra", 5, 32, 45, "Ariel", "MAQUINA", "COLOR");
        Producto producto2 = new Pescado("Salmoncito Bueno", "4321Z", 7, "Salmon Noruega", 7, 19, 26, "Noruega", 3, 7, "BLANCO");
        Producto producto3 = new Vino("Vino alcohol", "1212R", 0, "Vino y se fue", 2, 45, 76,"VinoBueno",13, 76, "BLANCO");


        System.out.println(producto1);
        System.out.println("---------------------------------------");
        System.out.println(producto2);
        System.out.println("---------------------------------------");
        System.out.println(producto3);
    }

}
