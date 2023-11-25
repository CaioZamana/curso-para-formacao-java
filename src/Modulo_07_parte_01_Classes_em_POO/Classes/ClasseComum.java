package Modulo_07_parte_01_Classes_em_POO.Classes;

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
