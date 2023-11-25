package Modulo_09_parte_01_java.io_Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProdutoExamplo {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Laptop", 1500.0),
                new Produto("Mouse", 30.0),
                new Produto("Teclado", 50.0),
                new Produto("Monitor", 300.0)
        );

        // Filtrar produtos com preço superior a 100
        List<Produto> produtosCaros = produtos.stream()
                .filter(p -> p.getPreco() > 100)
                .collect(Collectors.toList());

        System.out.println("Produtos com preço superior a 100:");
        produtosCaros.forEach(System.out::println);

        // Mapear os nomes dos produtos
        List<String> nomesProdutos = produtos.stream()
                .map(Produto::getNome)
                .collect(Collectors.toList());

        System.out.println("\nNomes dos Produtos:");
        nomesProdutos.forEach(System.out::println);

        // Reduzir os preços dos produtos para um valor total
        double totalPreco = produtos.stream()
                .mapToDouble(Produto::getPreco)
                .sum();

        System.out.println("\nTotal de Preços: " + totalPreco);
    }
}
