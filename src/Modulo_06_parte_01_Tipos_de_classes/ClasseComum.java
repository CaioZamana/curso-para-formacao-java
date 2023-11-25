package Modulo_06_parte_01_Tipos_de_classes;

public class ClasseComum {
    private String mensagem;

    public ClasseComum(String mensagem) {
        this.mensagem = mensagem;
    }

    public void exibirMensagem() {
        System.out.println(mensagem);
    }

    public static void main(String[] args) {
        ClasseComum minhaInstancia = new ClasseComum("Olá, Mundo!");
        minhaInstancia.exibirMensagem();
    }
}
