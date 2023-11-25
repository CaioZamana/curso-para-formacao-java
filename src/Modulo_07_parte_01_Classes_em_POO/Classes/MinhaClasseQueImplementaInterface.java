package Modulo_07_parte_01_Classes_em_POO.Classes;

public class MinhaClasseQueImplementaInterface implements MinhaInterface {
    @Override
    public void metodoDaInterface() {
        System.out.println("Método da interface implementado na classe.");
    }

    public static void main(String[] args) {
        MinhaClasseQueImplementaInterface instancia = new MinhaClasseQueImplementaInterface();
        instancia.metodoDaInterface();
    }
}
