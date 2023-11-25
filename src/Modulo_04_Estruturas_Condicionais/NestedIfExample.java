package Modulo_04_Estruturas_Condicionais;

public class NestedIfExample {
    public static void main(String[] args) {
        int idade = 18;
        boolean temPermissao = true;

        if (idade >= 18) {
            if (temPermissao) {
                System.out.println("Pode entrar no evento.");
            } else {
                System.out.println("Não tem permissão para entrar.");
            }
        } else {
            System.out.println("Menor de idade, não pode entrar.");
        }
    }
}
