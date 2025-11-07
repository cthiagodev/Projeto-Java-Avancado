import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private List<Playlist> playlists;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.playlists = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }

    public void criarPlaylist(String nome) {
        playlists.add(new Playlist(nome));
    }

    public Playlist getPlaylist(String nome) {
        for (Playlist p : playlists) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public void listarPlaylists() {
        System.out.println("Playlists de " + nome + ":");
        for (Playlist p : playlists) {
            System.out.println("- " + p.getNome());
        }
    }
}
