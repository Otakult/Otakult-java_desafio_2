package Classes_Interfaces;

public class Audio {
    private String nome;
    private String Autor;
    private int totalReproducoes=0;
    private int totalCurtidas=0;
    private int duracao;
    private double classficacao;
    public void curtir(){
        this.totalCurtidas++;
    }
    public void reprodizir(){
        this.totalReproducoes++;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getClassficacao() {
        return classficacao;
    }

}
