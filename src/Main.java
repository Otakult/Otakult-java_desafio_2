import Classes_Interfaces.*;
public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setNome("Comfortably Numb");
        minhaMusica.setAlbum("The Wall");
        minhaMusica.setAutor("Pink Floyd");

        for (int i = 1; i <= 250000000; i++) {
            minhaMusica.reprodizir();
        }
        for (int i = 1; i <= 10000000; i++) {
            minhaMusica.reprodizir();
        }
        Podcast meuPodCast = new Podcast();
        meuPodCast.setNome("D&D EP1");
        meuPodCast.setAutor("Pitaco Cast");
        meuPodCast.setDescricao("Primeiro epísódio da nova série em que jogamos RPG de mesa");
        for (int i = 1; i <= 300000; i++) {
            meuPodCast.reprodizir();
        }
        for (int i = 1; i <= 6000; i++) {
            meuPodCast.reprodizir();
        }
    }
}