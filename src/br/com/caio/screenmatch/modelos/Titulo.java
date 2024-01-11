package br.com.caio.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public void avalia(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    public double mediaAvaliacoes() {
        return somaAvaliacoes / totalAvaliacoes;
    }


    public void exibeFichaTecnica() {
        System.out.println("Nome: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoLancamento());
        System.out.println("Incluido no plano: " + (!isIncluidoNoPlano() ? "Não" : "Sim"));
        System.out.println("Duração: " + getDuracaoEmMinutos() + " minutos");
        System.out.println("Total de avaliações: " + getTotalAvaliacoes());
        System.out.printf("Média: " + "%.2f \n", mediaAvaliacoes());

    }

//sobescrevendo a função compareTo para que a ordenação seja por nome do titulo
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
