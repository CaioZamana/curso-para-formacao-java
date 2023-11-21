package Modulo_08_parta_02_Tratamento_de_Exceção_Personalizada_em_POO;

public class DivisaoPorZeroException extends Exception {
    public DivisaoPorZeroException(String mensagem) {
        super(mensagem);
    }
}
