//Parte de Vidal
public class Midias {
    private String titulo;
    private String artista;
    private String genero;
    private int ano;

    public Midias(String titulo, String artista, String genero, int ano) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }
    public String getGenero() {
        return genero;
    }
    public int getAno(){
        return ano;
    }
    public String toString(){
        return "Título: " + titulo + "| Artista: " + artista + " | Gênero: " + genero + " | Duração: " + ano + "s";
    }

    public void add(Midias midias) {
    }
}

