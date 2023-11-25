package Modulo_04_Estruturas_Condicionais;

public class TernaryOperatorExample {
    public static void main(String[] args) {
        int numero = 10;

        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.println("O número é " + resultado);
    }
}
