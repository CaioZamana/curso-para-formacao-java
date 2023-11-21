package Modulo_07_parte_01_Classes_em_POO;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Latido");
    }

    @Override
    public void mover() {
        System.out.println("Cachorro correndo");
    }
}
