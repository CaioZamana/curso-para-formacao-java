package Modulo_02_Operadores;

public class ExemploOperadores {

    public static void main(String[] args) {
        // Operadores Aritméticos
        int a = 10;
        int b = 5;

        System.out.println("Operadores Aritméticos:");
        System.out.println("Soma (a + b): " + (a + b));
        System.out.println("Subtração (a - b): " + (a - b));
        System.out.println("Multiplicação (a * b): " + (a * b));
        System.out.println("Divisão (a / b): " + (a / b));
        System.out.println("Módulo (a % b): " + (a % b));

        // Operadores Relacionais
        System.out.println("\nOperadores Relacionais:");
        System.out.println("Igual a (a == b): " + (a == b));
        System.out.println("Diferente de (a != b): " + (a != b));
        System.out.println("Maior que (a > b): " + (a > b));
        System.out.println("Menor que (a < b): " + (a < b));
        System.out.println("Maior ou igual a (a >= b): " + (a >= b));
        System.out.println("Menor ou igual a (a <= b): " + (a <= b));

        // Operadores Lógicos
        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println("\nOperadores Lógicos:");
        System.out.println("AND (verdadeiro && falso): " + (verdadeiro && falso));
        System.out.println("OR (verdadeiro || falso): " + (verdadeiro || falso));
        System.out.println("NOT (!verdadeiro): " + (!verdadeiro));

        // Operadores Unários
        int numero = 5;

        System.out.println("\nOperadores Unários:");
        System.out.println("Incremento (numero++): " + (numero++)); // pós-incremento
        System.out.println("Novo valor de numero após pós-incremento: " + numero);
        System.out.println("Incremento (++numero): " + (++numero)); // pré-incremento
        System.out.println("Decremento (numero--): " + (numero--)); // pós-decremento
        System.out.println("Novo valor de numero após pós-decremento: " + numero);
        System.out.println("Decremento (--numero): " + (--numero)); // pré-decremento

        // Operadores Bit a Bit
        int x = 5;
        int y = 3;

        System.out.println("\nOperadores Bit a Bit:");
        System.out.println("AND bit a bit (x & y): " + (x & y));
        System.out.println("OR bit a bit (x | y): " + (x | y));
        System.out.println("XOR bit a bit (x ^ y): " + (x ^ y));
        System.out.println("Deslocamento à esquerda (x << 1): " + (x << 1));
        System.out.println("Deslocamento à direita (x >> 1): " + (x >> 1));

        // Operadores de Atribuição
        int c = 8;

        System.out.println("\nOperadores de Atribuição:");
        c += 3; // Equivalente a c = c + 3;
        System.out.println("Atribuição com adição (c += 3): " + c);
        c -= 2; // Equivalente a c = c - 2;
        System.out.println("Atribuição com subtração (c -= 2): " + c);
        c *= 4; // Equivalente a c = c * 4;
        System.out.println("Atribuição com multiplicação (c *= 4): " + c);
        c /= 2; // Equivalente a c = c / 2;
        System.out.println("Atribuição com divisão (c /= 2): " + c);
        c %= 3; // Equivalente a c = c % 3;
        System.out.println("Atribuição com módulo (c %= 3): " + c);
    }
}
