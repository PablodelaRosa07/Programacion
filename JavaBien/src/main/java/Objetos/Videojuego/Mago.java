package Objetos.Videojuego;

class Mago extends Personaje {
    public Mago(String nombre) { super(nombre, 1, 60); }

    @Override
    public String getArma(){
        return "Hechizo";
    }

    @Override
    public boolean esAtacado(Personaje a){
        return false;
    }

    @Override
    public boolean esAtacado(Personaje a, int d){
        return false;
    }
}

