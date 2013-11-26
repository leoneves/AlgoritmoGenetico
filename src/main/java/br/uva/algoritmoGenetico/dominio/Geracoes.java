package br.uva.algoritmoGenetico.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: leoneves
 * Date: 11/25/13
 * Time: 12:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class Geracoes {

    private Integer numeroDeGeracoes;

    public List<Individuo> reproducao(List<Individuo> populacaoAtual, List<Individuo> novos){
        Collections.sort(populacaoAtual);
        Collections.sort(novos);
        for (int i=0;i < novos.size()-1; i++){
            populacaoAtual.set((populacaoAtual.size()-1)-i, novos.get(i));
        }
        return populacaoAtual;
    }

    public List<Individuo> classificaIndividuos(List<Individuo> populacao){
        //reorganiza na ordem de maior valorAvaliacao
        return populacao;
    }

    public Integer getNumeroDeGeracoes() {
        return numeroDeGeracoes;
    }

    public void setNumeroDeGeracoes(Integer numeroDeGeracoes) {
        this.numeroDeGeracoes = numeroDeGeracoes;
    }
}
