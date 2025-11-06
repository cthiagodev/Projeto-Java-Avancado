import java.util.List;
import java.util.Scanner;

public class Main {

    private static Catalogo catalogo = new Catalogo();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarMidia();
                    break;
                case 2:
                    listarMidias();
                    break;
                case 3:
                    buscarPorTitulo();
                    break;
                case 4:
                    buscarPorArtista();
                    break;
                case 5:
                    buscarPorGenero();
                    break;
                case 6:
                    System.out.println("Saindo, Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 6);
    }

    private static void exibirMenu() {
        System.out.println("\n MENU ");
        System.out.println("1 - Adicionar mídia");
        System.out.println("2 - Listar mídias");
        System.out.println("3 - Buscar por título");
        System.out.println("4 - Buscar por artista");
        System.out.println("5 - Buscar por gênero");
        System.out.println("6 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarMidia() {
        System.out.print("Digite o título: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o artista: ");
        String artista = scanner.nextLine();

        System.out.print("Digite o gênero: ");
        String genero = scanner.nextLine();

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        Midias midia = new Midias(titulo, artista, genero, ano);
        catalogo.adicionarMidias(midia);

        System.out.println("Mídia adicionada com sucesso!");
    }

    private static void listarMidias() {
        System.out.println("\n Lista de Mídia ");
        catalogo.listarMidias();
    }

    private static void buscarPorTitulo() {
        System.out.print("Digite o título para buscar: ");
        String titulo = scanner.nextLine();

        Midias resultado = catalogo.buscarPorTitulo(titulo);

        if (resultado != null) {
            System.out.println("Encontrado:");
            System.out.println(resultado);
        } else {
            System.out.println("Nenhuma mídia encontrada com esse título.");
        }
    }

    private static void buscarPorArtista() {
        System.out.print("Digite o artista para buscar: ");
        String artista = scanner.nextLine();

        List<Midias> resultados = catalogo.buscarPorArtista(artista);

        if (resultados.isEmpty()) {
            System.out.println("Nenhuma mídia encontrada para esse artista.");
        } else {
            System.out.println("Mídias encontradas:");
            for (Midias m : resultados) {
                System.out.println(m);
            }
        }
    }

    private static void buscarPorGenero() {
        System.out.print("Digite o gênero para buscar: ");
        String genero = scanner.nextLine();

        List<Midias> resultados = catalogo.buscarPorGenero(genero);

        if (resultados.isEmpty()) {
            System.out.println("Nenhuma mídia encontrada para esse gênero.");
        } else {
            System.out.println("Mídias encontradas:");
            for (Midias m : resultados) {
                System.out.println(m);
            }
        }
    }
}
