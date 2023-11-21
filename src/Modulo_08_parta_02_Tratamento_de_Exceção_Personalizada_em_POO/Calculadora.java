package Modulo_08_parta_02_Tratamento_de_Exceção_Personalizada_em_POO;
public class Calculadora {
    public double dividir(double numerador, double denominador) throws DivisaoPorZeroException {
        if (denominador == 0) {
            throw new DivisaoPorZeroException("Erro: Divisão por zero.");
        }
        return numerador / denominador;
    }
}
