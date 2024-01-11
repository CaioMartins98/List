package br.com.caio.screenmatch.principal;

import br.com.caio.screenmatch.calculo.CalculaTempo;
import br.com.caio.screenmatch.calculo.FiltroRecomendacao;
import br.com.caio.screenmatch.modelos.Episodio;
import br.com.caio.screenmatch.modelos.Filme;
import br.com.caio.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        System.out.println("\n*************************************");
        Filme meuFilme = new Filme("A fuga das Galinhas 2", 2023);
        meuFilme.setDuracaoEmMinutos(90);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDiretor("Meu Pai");
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.mediaAvaliacoes();
        meuFilme.exibeFichaTecnica();
        System.out.println("Diretor: " + meuFilme.getDiretor());
        filtro.filtra(meuFilme);

        System.out.println("\n*************************************");
        Filme novoFilme = new Filme("Piratas do Caribe 1", 2000);
        novoFilme.setDuracaoEmMinutos(180);
        novoFilme.setIncluidoNoPlano(true);
        novoFilme.avalia(10);
        novoFilme.avalia(5);
        novoFilme.avalia(10);
        novoFilme.avalia(10);
        novoFilme.mediaAvaliacoes();
        novoFilme.exibeFichaTecnica();
        filtro.filtra(novoFilme);
        System.out.println("\n*************************************");
        System.out.println("\n*************************************");
        Filme novoFilme2 = new Filme("Titanic", 1998);
        novoFilme2.setDuracaoEmMinutos(210);
        novoFilme2.setIncluidoNoPlano(true);
        novoFilme2.setAnoLancamento(1998);
        novoFilme2.avalia(10);
        novoFilme2.avalia(5);
        novoFilme2.mediaAvaliacoes();
        novoFilme2.exibeFichaTecnica();
        filtro.filtra(novoFilme2);
        System.out.println("\n*************************************");

        Serie serie = new Serie("The office", 2006);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(false);
        serie.setEpPorTemporada(13);
        serie.setTemporadas(10);
        serie.setMinutosPorEp(25);
        serie.avalia(10);
        serie.avalia(10);
        serie.avalia(10);
        serie.mediaAvaliacoes();
        serie.exibeFichaTecnica();
        System.out.println("Episódios por temporada: " + serie.getEpPorTemporada());
        System.out.println("Quantidade de temporadas: " + serie.getTemporadas());
        System.out.println("Min. por episódio: " + serie.getMinutosPorEp());

        System.out.println("Ativa: " + (serie.isAtiva() ? "Sim" : "Não"));

        CalculaTempo calcudora = new CalculaTempo();
        calcudora.inclui(meuFilme);
        calcudora.inclui(novoFilme);
        calcudora.inclui(serie);
        System.out.println("Tempo estimado: " + calcudora.getTempoTotal());

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setSerie(serie);
        ep.setTotalVisualizacoes(99);

        filtro.filtra(ep);
        System.out.println("*************************************");

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(novoFilme2);
        listaDeFilmes.add(novoFilme);
        listaDeFilmes.add(meuFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.getFirst().getNome());
        System.out.println(listaDeFilmes);


    }
}
