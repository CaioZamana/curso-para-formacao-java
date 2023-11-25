package Modulo_10_Collections.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
* Exercício da semana:
Utilizando a collection set, fazer o seguinte programa:
1 - Crie um laço que solicite que o usuário digite um número. Tente adicionar o número digitado na collection. Se o número não existir na collection, exiba a mensagem “Número adicionado com sucesso”. Se o número já existir, exiba a mensagem “Número não adicionado, pois ele já existe”. Pare de solicitar números se o usuário digitar o número -1

2 - Exiba a quantidade de números existentes na collection e todos os números que foram inseridos na collection, linha a linha

3 - Crie outro laço e solicite que o usuário digite um número. Tente remover o número digitado da collection. Se o número existir na collection, exiba a mensagem “Número removido com sucesso”. Se o número não existir, exiba a mensagem “Número não removido, pois ele não existe”. Pare de solicitar números se o usuário digitar o número -1

4 - Exiba a quantidade de números existentes na collection  e todos os números que sobraram na collection, linha a linha
*
* */

public class NumberCollectionProgram2 {

    public static void main(String[] args) {
        Set<Integer> listaNumerosSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um numero para adicionar a coleção");
            int digito = scanner.nextInt();

            if ( digito == 10) {
                System.out.println("Pular amarelinha");
            } else {
                System.out.println("Soltar Pipa");
            }
        }
    }
}
