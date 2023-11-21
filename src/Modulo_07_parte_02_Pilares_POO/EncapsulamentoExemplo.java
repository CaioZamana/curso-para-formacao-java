package Modulo_07_parte_02_Pilares_POO;

public class EncapsulamentoExemplo {
    private static int idade = 25;

    public static void encapsulamentoDemo() {
        System.out.println("\nExemplo de Encapsulamento:");
        System.out.println("Idade: " + idade);

        // Tentativa de modificar a idade diretamente (comentado para evitar erro de compilação)
        // idade = 30;
        // System.out.println("Nova Idade: " + idade);
    }
}
