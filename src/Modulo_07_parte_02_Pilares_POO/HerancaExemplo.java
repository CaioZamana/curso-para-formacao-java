package Modulo_07_parte_02_Pilares_POO;

import Modulo_07_parte_02_Pilares_POO.Exemplo.Animal;
import Modulo_07_parte_02_Pilares_POO.Exemplo.Cachorro;
import Modulo_07_parte_02_Pilares_POO.Exemplo.Gato;

public class HerancaExemplo {
    public static void herancaDemo() {
        System.out.println("\nExemplo de Herança e Polimorfismo:");

        // Criando instâncias
        Animal cachorro = new Cachorro("Bob");
        Animal gato = new Gato("Whiskers");

        // Demonstração de herança e polimorfismo
        System.out.println("\nCachorro:");
        cachorro.emitirSom(); // Latido
        cachorro.mover(); // Cachorro correndo

        System.out.println("\nGato:");
        gato.emitirSom(); // Miado
        gato.mover(); // Gato correndo
    }
}