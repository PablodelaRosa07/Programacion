package Objetos.Anime;

public class GestionaPersonajesAnime {
    static void main(String[] args) {
        SerieAnime onePiece = new SerieAnime("One Piece", "Bertin",30, 29);
        Luffy luffy = new Luffy("Luffy");
        luffy.setSerie(onePiece);
        System.out.println(luffy);
    }
}


        //      //
       //      //
      //////  //////
         //      //
        //      //