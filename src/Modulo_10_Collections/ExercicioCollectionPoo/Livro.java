package Modulo_10_Collections.ExercicioCollectionPoo;

public class Livro {

    private String titulo;
    private String autor;
    private Double pontuacao;


    public Livro(String pTitulo, String pAutor, Double pPontuacao) {
        this.titulo = pTitulo;
        this.autor = pAutor;
        this.pontuacao = pPontuacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public Double getPontuacao(){
        return pontuacao;
    }
}