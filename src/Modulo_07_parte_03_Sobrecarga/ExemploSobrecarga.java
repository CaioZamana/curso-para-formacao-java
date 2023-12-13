package Modulo_07_parte_03_Sobrecarga;

public class ExemploSobrecarga {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultadoInt = calculadora.somar(5, 3);            // Saída: 8
        double resultadoDouble = calculadora.somar(2.5, 3.5);  // Saída: 6.0

        System.out.println("Resultado Inteiro: " + resultadoInt);
        System.out.println("Resultado Double: " + resultadoDouble);

    }
}
