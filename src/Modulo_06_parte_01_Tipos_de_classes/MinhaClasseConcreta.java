package Modulo_06_parte_01_Tipos_de_classes;

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
