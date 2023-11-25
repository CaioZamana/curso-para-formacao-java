package Modulo_04_Estruturas_Condicionais;
public class GuardClauseExample {
    public static void main(String[] args) {
        GuardClauseExample exemplo = new GuardClauseExample();
        exemplo.meuMetodo(5);
    }

    public void meuMetodo(int valor) {
        if (valor < 0) {
            System.out.println("Valor não pode ser negativo.");
            return;
        }

        // Restante do código
        System.out.println("Valor: " + valor);
    }
}
