import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Midias> midias;

    public Catalogo() {
        this.midias = new ArrayList<>();
    }

    public void adicionarMidias(Midias midias) {
        midias.add(midias);
    }

    public Midias buscarPorTitulo(String titulo) {
        for (Midias midias : midias) {
            if (midias.getTitulo().equalsIgnoreCase(titulo)) {
                return midias;
            }
        }
        return null;
    }
    public List<Midias> buscarPorArtista(String artista) {
        List<Midias> resultado = new ArrayList<>();
        for (Midias midias : midias) {
            if (midias.getArtista().equalsIgnoreCase(artista)){
                resultado.add(midias);
            }
        }
        return resultado;
    }

    public List<Midias> buscarPorGenero(String genero) {
        List<Midias> resultado = new ArrayList<>();
        for (Midias midias : midias){
            if (midias.getGenero().equalsIgnoreCase(genero)){
                resultado.add(midias);
            }
        }
        return resultado;
    }
    public void listarMidias(){
        if (midias.isEmpty()){
            System.out.println(("Não possui música cadastrada."));
            return;
        }
        for (Midias midias : midias ){
            System.out.println(midias);
        }
    }
}

