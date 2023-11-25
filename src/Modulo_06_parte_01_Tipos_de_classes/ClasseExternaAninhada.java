package Modulo_06_parte_01_Tipos_de_classes;

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
