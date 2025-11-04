import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private String usuario;
    private List<Midia> midias;

    public Playlist(String nome, String usuario) {
        this.nome = nome;
        this.midias = new ArrayList<>();
        this.usuario = usuario;
    }

    public void adicionarMidia(Midia m) {
        midias.add(m);
    }

    public void removerMidia(Midia m) {
        midias.remove(m);
    }

    public int calcularDuracaoTotal() {
        int total = 0;
        for (Midia m : midias) {
            total += m.getDuracao();
        }
        return total;
    }
    public void exibirPlaylist() {
        System.out.println("PlayList: " + nome);
        for (Midia m : midias) {
            System.out.println("--> " + m);
        }
        System.out.println("Duração Total: " + calcularDuracaoTotal()/60 + " minutos");
    }
}
