package Modulo_01_Tipos_e_Variaveis;

import Modulo_10_Collections.ExercicioCollectionPoo.Livro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploVariaveis {

    public static void main(String[] args) {
        // Tipos primitivos
        int numeroInteiro = 10;               // Exemplo de variável inteira
        long numeroLongo = 1000000000L;       // Exemplo de variável longa
        float numeroFloat = 3.14f;            // Exemplo de variável float
        double numeroDecimal = 3.14;          // Exemplo de variável double
        char caractere = 'A';                 // Exemplo de variável caractere
        boolean condicao = true;              // Exemplo de variável booleana

        // Tipos de referência (objetos)
        Livro livr1;
        Double numero = 2.0;
        String texto = "Olá, Jefferson!";        // Exemplo de variável String
        int[] arrayInteiros = {1, 2, 3, 4, 5}; // Exemplo de array de inteiros
        List<String> listaTextos = new ArrayList<>(Arrays.asList("Maçã", "Banana", "Pêra")); // Exemplo de lista de strings
        List<Livro> livro;

    }
}