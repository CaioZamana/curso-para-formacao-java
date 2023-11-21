package Modulo_08_parta_02_Tratamento_de_Exceção_Personalizada_em_POO;

import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o numerador: ");
            double numerador = scanner.nextDouble();

            System.out.print("Digite o denominador: ");
            double denominador = scanner.nextDouble();

            Calculadora calculadora = new Calculadora();
            double resultado = calculadora.dividir(numerador, denominador);

            System.out.println("Resultado da divisão: " + resultado);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            // O bloco "finally" é opcional e será sempre executado, independentemente de ocorrer uma exceção ou não.
            scanner.close();
        }
    }
}
