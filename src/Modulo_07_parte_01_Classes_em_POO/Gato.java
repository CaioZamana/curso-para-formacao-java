package Modulo_07_parte_01_Classes_em_POO;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miado");
    }

    @Override
    public void mover() {
        System.out.println("Gato correndo");
    }
}
