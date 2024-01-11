package br.com.caio.screenmatch.modelos;

import br.com.caio.screenmatch.calculo.Classificacao;

public class Serie extends Titulo  {
    private int minutosPorEp;
    private int temporadas;
    private int epPorTemporada;
    private boolean ativa;

    //Construtores - São utilizados para popular um objeto (é mais um recurso para encapsular objetos)
    public Serie(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    @Override
    public int getDuracaoEmMinutos() {
        return (temporadas * epPorTemporada * minutosPorEp);
    }

    public int getMinutosPorEp() {
        return minutosPorEp;
    }

    public void setMinutosPorEp(int minutosPorEp) {
        this.minutosPorEp = minutosPorEp;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpPorTemporada() {
        return epPorTemporada;
    }

    public void setEpPorTemporada(int epPorTemporada) {
        this.epPorTemporada = epPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    //sobescrevendo a função toString() para q seja mostrado a string do return escolhido
    @Override
    public String toString() {
        return "Série: " + this.getNome() + "(" + this.getAnoLancamento() + ")" ;
    }
}
