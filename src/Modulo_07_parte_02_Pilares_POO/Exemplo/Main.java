package Modulo_07_parte_02_Pilares_POO.Exemplo;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Cachorro("Freddy");
        Cachorro animal2 = new Cachorro("Dolly");
        Animal animal3 = new Gato("Laika");

        animal1.emitirSom();

        animal2.emitirSom();

        animal3.emitirSom();

        animal2.mover();
        animal1.mover();
    }
}
