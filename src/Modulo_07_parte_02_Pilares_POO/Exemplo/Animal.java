package Modulo_07_parte_02_Pilares_POO.Exemplo;



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
