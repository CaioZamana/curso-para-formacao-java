package Modulo_06_parte_01_Tipos_de_classes;

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
