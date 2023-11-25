package Modulo_05_parte_01_Estruturas_de_Repetição_Java_5;

import java.util.Scanner;

public class ExercicioEstruturasRepeticao {

    public static void main(String[] args) {
        // Criando um objeto Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando um número ao usuário
        int limite;
        do {
            System.out.print("Digite um número inteiro não negativo: ");
            limite = scanner.nextInt();
            if (limite < 0) {
                System.out.println("Por favor, insira um número não negativo.");
            }
        } while (limite < 0);

        // Utilizando a estrutura de repetição 'for' para calcular a soma
        calcularSomaComFor(limite);

        // Utilizando a estrutura de repetição 'while' para calcular a soma
        calcularSomaComWhile(limite);

        // Utilizando a estrutura de repetição 'do-while' para calcular a soma
        calcularSomaComDoWhile(limite);

        // Fechando o Scanner para evitar vazamento de recursos
        scanner.close();
    }

    // Método para calcular a soma usando a estrutura de repetição 'for'
    private static void calcularSomaComFor(int limite) {
        int soma = 0;
        System.out.println("Calculando a soma usando a estrutura 'for':");
        for (int i = 1; i <= limite; i++) {
            soma += i;
            System.out.println("Soma parcial após adicionar " + i + ": " + soma);
        }
        System.out.println("A soma dos números de 1 a " + limite + " (usando for) é: " + soma);
        System.out.println();
    }

    // Método para calcular a soma usando a estrutura de repetição 'while'
    private static void calcularSomaComWhile(int limite) {
        int soma = 0;
        int i = 1;
        System.out.println("Calculando a soma usando a estrutura 'while':");
        while (i <= limite) {
            soma += i;
            System.out.println("Soma parcial após adicionar " + i + ": " + soma);
            i++;
        }
        System.out.println("A soma dos números de 1 a " + limite + " (usando while) é: " + soma);
        System.out.println();
    }

    // Método para calcular a soma usando a estrutura de repetição 'do-while'
    private static void calcularSomaComDoWhile(int limite) {
        int soma = 0;
        int i = 1;
        System.out.println("Calculando a soma usando a estrutura 'do-while':");
        do {
            soma += i;
            System.out.println("Soma parcial após adicionar " + i + ": " + soma);
            i++;
        } while (i <= limite);
        System.out.println("A soma dos números de 1 a " + limite + " (usando do-while) é: " + soma);
        System.out.println();
    }
}
