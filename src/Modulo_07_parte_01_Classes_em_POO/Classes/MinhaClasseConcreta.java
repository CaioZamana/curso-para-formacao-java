package Modulo_07_parte_01_Classes_em_POO.Classes;

public class MinhaClasseConcreta extends ClasseAbstrata {
    @Override
    public void metodoAbstrato() {
        System.out.println("Implementação do método abstrato.");
    }

    public static void main(String[] args) {
        MinhaClasseConcreta instancia = new MinhaClasseConcreta();
        instancia.metodoAbstrato();
        instancia.metodoConcreto();
    }
}
