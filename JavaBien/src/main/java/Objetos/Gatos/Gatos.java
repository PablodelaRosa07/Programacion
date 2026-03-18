package Objetos.Gatos;

public class Gatos {

    String color;
    int edad;
    String raza;
    String sexo;
    int peso;

    public Gatos(String color, int edad, int peso, String raza, String sexo) {
        this.color = color;
        this.edad = edad;
        this.peso = peso;
        this.raza = raza;
        this.sexo = sexo;
    }

    public void ronronea(){
        System.out.println("Rrrrrr");
    }

    public void maulla(){
        System.out.println("Miauu");
    }

    public void come(String comida){
        if (comida.equals("P")){
            System.out.println("Yummy Yummy");
        }
        if (comida.equals("O")){
            System.out.println("Buahhh, mejor no");
        }
    }

    public void pelear(Gatos enemigo){
        if (enemigo.sexo.equals(this.sexo)){
            System.out.println("Ven aquí que te vas a enterar");
        }
        else {
            System.out.println("La violencia nunca es la solución");
        }
    }


}
