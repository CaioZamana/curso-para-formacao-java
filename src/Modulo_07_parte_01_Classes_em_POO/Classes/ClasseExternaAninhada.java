package Modulo_07_parte_01_Classes_em_POO.Classes;

public class ClasseExternaAninhada {
    private String mensagemExterna = "Mensagem da classe externa.";

    public class ClasseAninhada {
        private String mensagemAninhada = "Mensagem da classe aninhada.";

        public void exibirMensagens() {
            System.out.println(mensagemExterna);
            System.out.println(mensagemAninhada);
        }
    }

    public static void main(String[] args) {
        ClasseExternaAninhada externa = new ClasseExternaAninhada();
        ClasseAninhada aninhada = externa.new ClasseAninhada();
        aninhada.exibirMensagens();
    }
}
