package Modulo_06_parte_02_Fundamentos_POO;

public class ExemploOOP {
    public static void main(String[] args) {
        // Criação de objetos e demonstração de conceitos OOP
        Pessoa pessoa1 = new Pessoa("João", 25);
        Pessoa pessoa2 = new Pessoa("Maria", 30);

        // Utilização de métodos da classe Pessoa
        System.out.println("Nome da pessoa1: " + pessoa1.getNome());
        System.out.println("Idade da pessoa1: " + pessoa1.getIdade());

        pessoa1.fazerAniversario(); // Método para incrementar a idade
        System.out.println("Nova idade da pessoa1: " + pessoa1.getIdade());

        // Demonstração de encapsulamento
        pessoa2.setNome("Ana");
        System.out.println("Novo nome da pessoa2: " + pessoa2.getNome());
    }
}
