package Modulo_04_Estruturas_Condicionais;
public class SwitchCaseExample {
    public static void main(String[] args) {
        int opcao = 2;

        switch (opcao) {
            case 1:
                System.out.println("Opção 1 selecionada");
                break;
            case 2:
                System.out.println("Opção 2 selecionada");
                break;
            default:
                System.out.println("Opção não reconhecida");
        }
    }
}
