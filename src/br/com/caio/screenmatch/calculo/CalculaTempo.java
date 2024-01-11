package br.com.caio.screenmatch.calculo;

import br.com.caio.screenmatch.modelos.Titulo;

public class CalculaTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    CTRL + / para comentar

//    Para evitar duplicação de código, passar a super classe como parâmetro (polimorfismo)
    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
