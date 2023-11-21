package Modulo_08_parta_01_Tratamento_de_Exceção;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTratamentoExcecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            double numero = scanner.nextDouble();

            double resultado = calcularRaizQuadrada(numero);
            System.out.println("A raiz quadrada de " + numero + " é: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um número válido.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível calcular a raiz quadrada de um número negativo.");
        } finally {
            // O bloco "finally" é opcional e será sempre executado, independentemente de ocorrer uma exceção ou não.
            scanner.close();
        }
    }

    private static double calcularRaizQuadrada(double numero) {
        if (numero < 0) {
            throw new ArithmeticException("Não é possível calcular a raiz quadrada de um número negativo.");
        }
        return Math.sqrt(numero);
    }
}
