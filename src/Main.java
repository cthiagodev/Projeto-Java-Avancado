public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();


        catalogo.adicionarMidia(new Musica("Morango do Nordeste", "Lairton", 3.5, Genero.FORRO));
        catalogo.adicionarMidia(new Musica("Show das Poderosas", "Anitta", 3.0, Genero.FUNK));
        catalogo.adicionarMidia(new Musica("Ta Rocheda", "Os Barões da Pisadinha", 2.8, Genero.BREGA));


        System.out.println("=== CATÁLOGO DE MÚSICAS ===");
        catalogo.listarTodas();


        Playlist playlist = new Playlist("Minhas Favoritas");

        try {
            playlist.adicionarMidia(catalogo.buscarPorTitulo("Morango do Nordeste").get(0));
            playlist.adicionarMidia(catalogo.buscarPorArtista("Anitta").get(0));

            System.out.println("\n=== MINHA PLAYLIST ===");
            playlist.listarMidias();

            playlist.removerMidia(catalogo.buscarPorTitulo("Morango do Nordeste").get(0));

            System.out.println("\n=== PLAYLIST APÓS REMOVER UMA MÚSICA ===");
            playlist.listarMidias();

        } catch (MidiaExc e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
