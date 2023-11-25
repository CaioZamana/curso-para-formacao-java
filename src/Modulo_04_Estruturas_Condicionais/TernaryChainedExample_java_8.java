package Modulo_04_Estruturas_Condicionais;

//If-Else Ternário Encadeado (Java 8 em diante):
public class TernaryChainedExample_java_8 {
    public static void main(String[] args) {
        int numero = 10;

        String resultado = (numero > 0) ? "Positivo"
                : (numero < 0) ? "Negativo"
                : "Zero";

        System.out.println("O número é " + resultado);
    }
}
