package Modulo_04_Estruturas_Condicionais;

import java.util.Scanner;

public class ExercicioEstruturasCondicionais {

    public static void main(String[] args) {
        // Criando um objeto Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando um número ao usuário
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verificando diversas condições usando métodos específicos
        verificarSinal(numero);
        verificarParidade(numero);
        verificarNumeroEspecial(numero);
        verificarMultiploDeCinco(numero);
        verificarIntervalo(numero);
        verificarQuadradoPerfeito(numero);

        // Fechando o Scanner para evitar vazamento de recursos
        scanner.close();
    }

    // Método para verificar se o número é positivo, negativo ou zero
    private static void verificarSinal(int numero) {
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }

    // Método para verificar se o número é par ou ímpar

    //% verifica se o resto da divisão do número por 2 é igual a zero
    private static void verificarParidade(int numero) {
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }

    // Método para verificar se o número é 1, 2 ou 3 usando switch
    private static void verificarNumeroEspecial(int numero) {
        switch (numero) {
            case 1:
                System.out.println("O número é um.");
                break;
            case 2:
                System.out.println("O número é dois.");
                break;
            case 3:
                System.out.println("O número é três.");
                break;
            default:
                System.out.println("O número não é um, dois ou três.");
        }
    }

    // Método para verificar se o número é múltiplo de 5
    private static void verificarMultiploDeCinco(int numero) {
        if (numero % 5 == 0) {
            System.out.println("O número é múltiplo de 5.");
        } else {
            System.out.println("O número não é múltiplo de 5.");
        }
    }

    // Método para verificar se o número está no intervalo de 0 a 100 (exclusive)
    private static void verificarIntervalo(int numero) {
        if (numero > 0 && numero < 100) {
            System.out.println("O número está no intervalo de 0 a 100.");
        } else {
            System.out.println("O número está fora do intervalo de 0 a 100.");
        }
    }

    // Método para verificar se o número é um quadrado perfeito
    private static void verificarQuadradoPerfeito(int numero) {
        int raizQuadrada = (int) Math.sqrt(numero);
        if (raizQuadrada * raizQuadrada == numero) {
            System.out.println("O número é um quadrado perfeito.");
        } else {
            System.out.println("O número não é um quadrado perfeito.");
        }
    }
}
