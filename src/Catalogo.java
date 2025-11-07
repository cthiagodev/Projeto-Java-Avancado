import java.util.*;

public class Catalogo {
    private List<Midia> midias;

    public Catalogo() {
        midias = new ArrayList<>();
    }

    public void adicionarMidia(Midia midia) {
        midias.add(midia);
    }

    public List<Midia> buscarPorTitulo(String titulo) throws MidiaExc {
        List<Midia> resultado = new ArrayList<>();
        for (Midia m : midias) {
            if (m.getTitulo().equalsIgnoreCase(titulo)) {
                resultado.add(m);
            }
        }
        if (resultado.isEmpty()) {
            throw new MidiaExc("Nenhuma mídia encontrada com o título: " + titulo);
        }
        return resultado;
    }

    public List<Midia> buscarPorArtista(String artista) throws MidiaExc {
        List<Midia> resultado = new ArrayList<>();
        for (Midia m : midias) {
            if (m.getArtista().equalsIgnoreCase(artista)) {
                resultado.add(m);
            }
        }
        if (resultado.isEmpty()) {
            throw new MidiaExc("Nenhuma mídia encontrada do artista: " + artista);
        }
        return resultado;
    }

    public List<Midia> buscarPorGenero(Genero genero) throws MidiaExc {
        List<Midia> resultado = new ArrayList<>();
        for (Midia m : midias) {
            if (m.getGenero() == genero) {
                resultado.add(m);
            }
        }
        if (resultado.isEmpty()) {
            throw new MidiaExc("Nenhuma mídia encontrada do gênero: " + genero);
        }
        return resultado;
    }

    public void listarTodas() {
        System.out.println("=== Catálogo de Músicas ===");
        for (Midia m : midias) {
            System.out.println(m);
        }
    }
}

