package Modulo_07_parte_01_Classes_em_POO.Classes;
public final class MinhaClasseFinal {
    public void metodoFinal() {
        System.out.println("Método em uma classe final.");
    }

    public static void main(String[] args) {
        MinhaClasseFinal instancia = new MinhaClasseFinal();
        instancia.metodoFinal();
    }
}
