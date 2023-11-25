package Modulo_10_Collections.Set;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);

Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25

Resolucao, passo a passo:

Crie uma nova classe chamada "Serie", que terá três atributos privados: nome (String), genero (String) e tempoEpisodio (int).

Crie um construtor público para a classe "Serie" que recebe os valores dos três atributos como parâmetros e inicializa os atributos.

Implemente os métodos getters para os três atributos.

Sobrescreva os métodos equals e hashCode na classe "Serie", usando o método Objects.hash.

Implemente a interface Comparable<Serie> na classe "Serie", sobrescrevendo o método compareTo, que comparará as séries pelo tempo de episódio e, se o tempo for o mesmo, pelo gênero.

Crie uma nova classe chamada "ComparatorNomeGeneroTempoEpisodio", que implementa a interface Comparator<Serie>.

Sobrescreva o método compare na classe "ComparatorNomeGeneroTempoEpisodio", que comparará as séries primeiro pelo nome, depois pelo gênero e, em seguida, pelo tempo de episódio.

Crie uma nova classe chamada "ExemploOrdenacaoSet".

No método main da classe "ExemploOrdenacaoSet", crie um objeto do tipo Set<Serie> chamado "minhasSeries" usando a implementação HashSet.

Adicione três objetos da classe "Serie" ao conjunto "minhasSeries" usando o método add.

Use um loop for-each para imprimir as informações das séries no conjunto "minhasSeries" na ordem em que foram adicionadas ao conjunto.

Crie um novo objeto do tipo Set<Serie> chamado "minhasSeries1" usando a implementação LinkedHashSet.

Adicione os mesmos três objetos da classe "Serie" ao conjunto "minhasSeries1" usando o método add.

Use um loop for-each para imprimir as informações das séries no conjunto "minhasSeries1" na ordem em que foram adicionadas ao conjunto.

Crie um novo objeto do tipo Set<Serie> chamado "minhasSeries2" usando a implementação TreeSet e passe o conjunto "minhasSeries1" como parâmetro.

Use um loop for-each para imprimir as informações das séries no conjunto "minhasSeries2" na ordem natural (pelo tempo de episódio).

Crie um novo objeto do tipo Set<Serie> chamado "minhasSeries3" usando a implementação TreeSet e passe uma instância do objeto "ComparatorNomeGeneroTempoEpisodio" como parâmetro.

Adicione os mesmos três objetos da classe "Serie" ao conjunto "minhasSeries3" usando o método add.

Use um loop for-each para imprimir as informações das séries no conjunto "minhasSeries3" na ordem definida pelo objeto "ComparatorNomeGeneroTempoEpisodio".

Implemente novos objetos do tipo Set<Serie> e use a implementação TreeSet com novos comparadores para ordenar o conjunto por gênero e tempo de episódio. Adicione as informações das séries nos conjuntos e imprima na tela em cada ordenação.
*/

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 40));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("got", "fantasia", 40));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());


//Pra você
/*        System.out.println("--\tOrdem gênero\t--");

          System.out.println("--\tOrdem Tempo Episódio\t--");
 */

    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareTo(serie.getGenero());
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }

    public class ComparatorGenero implements Comparator<Serie>{

        @Override
        public int compare(Serie s1, Serie s2) {
            int genero = s1.getGenero().compareTo(s2.getGenero());
            if (genero != 0) return genero;
            int nome = s1.getNome().compareTo(s2.getNome());
            if (nome != 0) return nome;


            return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
        }
}}