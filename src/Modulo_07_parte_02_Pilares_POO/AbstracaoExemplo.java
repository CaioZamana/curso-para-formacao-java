package Modulo_07_parte_02_Pilares_POO;
import Modulo_07_parte_01_Classes_em_POO.Animal;
import Modulo_07_parte_01_Classes_em_POO.Cachorro;

public class AbstracaoExemplo {
    public static void abstracaoDemo() {
        System.out.println("\nExemplo de Abstração:");

        // Criando instância de Cachorro
        Animal cachorro = new Cachorro("Max");

        // Demonstração de abstração
        System.out.println("Nome do Animal: " + cachorro.getNome());
        cachorro.mover(); // Correr
    }
}
