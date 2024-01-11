package br.com.caio.screenmatch.calculo;


public class FiltroRecomendacao {

    public void filtra(Classificacao classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Mais avaliados");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Bem avaliados");
        } else {
            System.out.println("Menos avaliados");
        }
    }
}
