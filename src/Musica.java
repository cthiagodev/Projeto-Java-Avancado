public class Musica extends Midia {
    public Musica(String titulo, String artista, double duracao, Genero genero) {
        super(titulo, artista, duracao, genero);
    }

    @Override
    public void reproduzir() {
        System.out.println("Tocando música: " + getTitulo() + " de " + getArtista());
    }
}
