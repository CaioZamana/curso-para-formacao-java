package Modulo_06_parte_01_Tipos_de_classes;
public final class MinhaClasseFinal {
    public void metodoFinal() {
        System.out.println("Método em uma classe final.");
    }

    public static void main(String[] args) {
        MinhaClasseFinal instancia = new MinhaClasseFinal();
        instancia.metodoFinal();
    }
}
