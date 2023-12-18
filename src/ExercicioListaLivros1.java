import Modulo_10_Collections.ExercicioCollectionPoo.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioListaLivros1 {

    public static void exibirLivro(Livro livro) {
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Pontuação: " + livro.getPontuacao());
        System.out.println();
    }

    public static void exibirLivros(List<Livro> livros) {
        for (Livro livro : livros) {
            exibirLivro(livro);
        }
    }

    public static Livro buscarLivroPorTitulo(List<Livro> livros, String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Livro> listaLivros = new ArrayList<>();

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1: Adicionar novo livro");
            System.out.println("2: Exibir lista de livros");
            System.out.println("3: Buscar livro por título");
            System.out.println("0: Sair do programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String novoTitulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String novoAutor = scanner.nextLine();
                    System.out.print("Digite a pontuação do livro: ");
                    double novaPontuacao = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha

                    Livro novoLivro = new Livro(novoTitulo, novoAutor, novaPontuacao);
                    listaLivros.add(novoLivro);
                    System.out.println("Livro adicionado com sucesso!\n");
                    break;
                case 2:
                    if (listaLivros.isEmpty()) {
                        System.out.println("Lista de livros está vazia.\n");
                    } else {
                        exibirLivros(listaLivros);
                    }
                    break;
                case 3:
                    System.out.print("Digite o título do livro a ser buscado: ");
                    String tituloBusca = scanner.nextLine();
                    Livro livroEncontrado = buscarLivroPorTitulo(listaLivros, tituloBusca);
                    if (livroEncontrado != null) {
                        exibirLivro(livroEncontrado);
                    } else {
                        System.out.println("Livro não encontrado.\n");
                    }
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
        } while (opcao != 0);

        scanner.close();
    }

}