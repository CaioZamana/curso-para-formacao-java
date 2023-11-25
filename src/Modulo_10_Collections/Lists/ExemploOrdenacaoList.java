package Modulo_10_Collections.Lists;
/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);

Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo

Resolução:
Inicie criando uma classe "Gato" com os atributos "nome", "idade" e "cor", e um construtor que recebe esses valores como parâmetros. Adicione também os métodos getters para cada atributo.
Faça a classe "Gato" implementar a interface "Comparable", para permitir a ordenação da lista de gatos.
Crie uma classe "ComparatorIdade" que implementa a interface "Comparator" e defina o método "compare" para comparar a idade dos gatos.
Crie uma classe "ComparatorCor" que implementa a interface "Comparator" e defina o método "compare" para comparar a cor dos gatos.
Crie uma classe "ComparatorNomeCorIdade" que implementa a interface "Comparator" e defina o método "compare" para comparar o nome, cor e idade dos gatos, nessa ordem.
Na classe principal "ExemploOrdenacaoList", crie uma lista de gatos "meusGatos" e adicione três instâncias de gato à lista, com nome, idade e cor diferentes.
Chame o método "sort" da lista "meusGatos", passando como parâmetro a função "Comparator.comparing(Gato::getNome)" para ordenar a lista pelo nome dos gatos.
Imprima a lista de gatos ordenada por ordem de inserção, usando o método "println" da classe "System.out".
Em seguida, embaralhe a lista usando o método "shuffle" da classe "Collections" e imprima novamente a lista.
Ordene a lista naturalmente pelo nome dos gatos, usando o método "sort" da classe "Collections" e imprima novamente a lista.
Ordene a lista pela idade dos gatos, usando o método "sort" da lista "meusGatos" e o "ComparatorIdade" criado anteriormente. Imprima novamente a lista.
Ordene a lista pela cor dos gatos, usando o método "sort" da lista "meusGatos" e o "ComparatorCor" criado anteriormente. Imprima novamente a lista.
Ordene a lista pelo nome, cor e idade dos gatos, usando o método "sort" da lista "meusGatos" e o "ComparatorNomeCorIdade" criado anteriormente. Imprima novamente a lista.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<Gato>(){{
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "amarelo"));
        }};
        meusGatos.sort(Comparator.comparing(Gato::getNome));


        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Idade\t---");
//        Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem cor\t---");
//        Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
//        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor !=0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());

    }
}