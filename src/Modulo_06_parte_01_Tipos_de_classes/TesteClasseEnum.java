package Modulo_06_parte_01_Tipos_de_classes;

public class TesteClasseEnum {
    public static void main(String[] args) {
        for (ClasseEnumDiasDaSemana dia : ClasseEnumDiasDaSemana.values()) {
            System.out.println(dia);
        }
    }
}
