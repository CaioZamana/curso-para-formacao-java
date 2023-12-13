package Modulo_05_parte_02_Estruturas_de_Repetição_Java_8;

import java.util.Arrays;
import java.util.List;

public class ParallelForEachWithStreamsExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        numeros.parallelStream().forEach(num -> {
            // Código a ser repetido em paralelo
            System.out.println("Valor do número (paralelo): " + num);
        }
        );
    }
}
