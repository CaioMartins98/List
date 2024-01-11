package br.com.caio.screenmatch.principal;

import br.com.caio.screenmatch.modelos.Filme;
import br.com.caio.screenmatch.modelos.Serie;
import br.com.caio.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("A fuga das Galinhas 2", 2023);
        Filme novoFilme = new Filme("Piratas do Caribe 1", 2000);
        Filme novoFilme2 = new Filme("Titanic", 1998);
        Serie serie = new Serie("The office", 2006);

        meuFilme.avalia(10);
        novoFilme.avalia(10);
        novoFilme2.avalia(7);
        serie.avalia(5);
        ArrayList<Titulo> titulosAssistidos = new ArrayList<>();

        titulosAssistidos.add(novoFilme2);
        titulosAssistidos.add(novoFilme);
        titulosAssistidos.add(meuFilme);
        titulosAssistidos.add(serie);

        for (Titulo item : titulosAssistidos) {
            System.out.println(item);
            // identificando tipo de objeto
            if (item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }
        //ordenação de lista através da comparação por nome (sobescrita no Titulo)
        Collections.sort(titulosAssistidos);
        System.out.println(titulosAssistidos);
        // ordenando a lista através da comparação por ano de lançamento
        titulosAssistidos.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println(titulosAssistidos);

        // interface List
        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Froid");
        buscaPorArtista.add("Djonga");
        buscaPorArtista.add("BK");
        buscaPorArtista.add("Leall");
        System.out.println(buscaPorArtista);
        //ordenação de lista através da comparação por nome (sobescrita no Titulo)
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);
    }
}
