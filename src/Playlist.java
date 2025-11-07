import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Midia> midias;

    public Playlist(String nome) {
        this.nome = nome;
        this.midias = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public List<Midia> getMidias() { return midias; }

    public void adicionarMidia(Midia midia) {
        midias.add(midia);
    }

    public void removerMidia(Midia midia) {
        midias.remove(midia);
    }

    public double calcularDuracaoTotal() {
        double total = 0;
        for (Midia m : midias) {
            total += m.getDuracao();
        }
        return total;
    }

    public void listarMidias() {
        System.out.println("Playlist: " + nome);
        for (Midia m : midias) {
            System.out.println("  - " + m);
        }
        System.out.println("Duração total: " + calcularDuracaoTotal() + " minutos");
    }
}
