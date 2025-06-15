package Modulo_10_Collections.ExercicioCollectionPoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        ExercicioListaLivros exercicioListaLivros = new ExercicioListaLivros();
        Scanner scanner = new Scanner(System.in);
        List<Livro> listaDeLivros = new ArrayList<>();


        int digito;

        do {
            System.out.println("\nMenu de opções: ");
            System.out.println("1: Adicionar novo Livro");
            System.out.println("2: Exibir lista de Livros");
            System.out.println("3: Buscar Livro por Título");
            System.out.println("0: Sair do programa");
            System.out.println("Digite o número que deseja: ");

            digito = scanner.nextInt();

            scanner.nextLine(); //consumir linha

            switch (digito) {
                case 1:
                    System.out.println("Digite o título do livro");
                    String novoTitulo = scanner.nextLine();
                    System.out.println("Digite o autor do livro");
                    String novoAutor = scanner.nextLine();
                    System.out.println("Digite a pontuação do livro");
                    Double novaPontuacao = scanner.nextDouble();
                    Livro novoLivro = new Livro(novoTitulo, novoAutor, novaPontuacao);
                    listaDeLivros.add(novoLivro);
                    break;

                case 2:
                    if (listaDeLivros.isEmpty()) {
                        System.out.println("A lista está vazia.\n");
                    } else {
                        exercicioListaLivros.exibirLivros(listaDeLivros);
                    }
                    break;

                case 3:
                    System.out.print("Digite o título que deseja buscar: ");
                    String tituloBusca = scanner.nextLine();
                    Livro livroEncontrado = exercicioListaLivros.buscarLivroPorTitulo(listaDeLivros, tituloBusca);

                    if (livroEncontrado != null) {
                        exercicioListaLivros.exibirLivro(livroEncontrado);
                    } else {
                        System.out.println("Livro não encontrado\n");
                    }
                    break;

                case 0:
                    System.out.println("O programa está sendo encerrado \n");
                    break;

                default:
                    System.err.println("Opção inválida.\n");
            }
        } while (digito != 0);

        scanner.close();

    }
}