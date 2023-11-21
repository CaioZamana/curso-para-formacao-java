package Modulo_07_parte_01_Classes_em_POO;



public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void emitirSom();

    public void mover() {
        System.out.println("Animal movendo-se");
    }
}
