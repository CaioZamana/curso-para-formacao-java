package Modulo_07_parte_01_Classes_em_POO.Classes;

public class TesteClasseEnum {
    public static void main(String[] args) {
        for (ClasseEnumDiasDaSemana dia : ClasseEnumDiasDaSemana.values()) {
            System.out.println(dia);
        }
    }
}
