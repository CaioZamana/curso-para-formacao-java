package Modulo_04_Estruturas_Condicionais;

public class ElseIfExample {
    public static void main(String[] args) {
        int nota = 75;

        if (nota >= 90) {
            System.out.println("A");
        } else if (nota >= 80) {
            System.out.println("B");
        } else if (nota >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
