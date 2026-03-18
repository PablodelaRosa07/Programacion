package Objetos.Anime;

public class Luffy extends PersonajeAnime{

    private String fruta;
    private boolean estaAgua;

    void reir(){
        System.out.println("Reir");
    }

    public Luffy(String nombre){
        super(nombre);
    }

    public boolean isEstaAgua() {
        return estaAgua;
    }

    public void setEstaAgua(boolean estaAgua) {
        this.estaAgua = estaAgua;
    }

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }
}
