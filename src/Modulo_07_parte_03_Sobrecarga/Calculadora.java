package Modulo_07_parte_03_Sobrecarga;

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public String concatenar(String a, String b) {
        return a + b;
    }
}
