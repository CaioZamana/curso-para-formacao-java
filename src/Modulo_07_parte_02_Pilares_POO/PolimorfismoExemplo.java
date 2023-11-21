package Modulo_07_parte_02_Pilares_POO;


import Modulo_07_parte_01_Classes_em_POO.Animal;
import Modulo_07_parte_01_Classes_em_POO.Cachorro;


public class PolimorfismoExemplo {
    public static void polimorfismoDemo() {
        System.out.println("\nExemplo de Polimorfismo:");

        // Criando instância de Cachorro
        Animal animal = new Cachorro("Rex");

        // Demonstração de polimorfismo
        System.out.println("Nome do Animal: " + animal.getNome());
        animal.emitirSom(); // Latido
    }
}
