package Modulo_05_parte_01_Estruturas_de_Repetição_Java_5;

public class ForEachExemplo {
    public static void main(String[] args) {
        // Criando um array de strings
        String[] nomes = {"Alice", "Bob", "Charlie", "David", "Eva"};

        // Usando o loop for-each para iterar através do array
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}