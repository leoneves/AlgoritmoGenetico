package br.uva.algoritmoGenetico.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: leoneves
 * Date: 11/24/13
 * Time: 11:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class IniciarPopulacao {

    private Integer tamanhoPopulacao;
    private List<Individuo> populacao;


    public void iniciarPopulacao(Integer tamanhoPopulacao){
        this.tamanhoPopulacao = tamanhoPopulacao;
        populacao = new ArrayList<Individuo>();
        for(int i=1;i <= this.tamanhoPopulacao;i++){
            Individuo individuo = new Individuo();
            individuo.setX(new Random().nextInt(1 << 15));
            individuo.setY(new Random().nextInt(1 << 15));
            individuo.setZ(new Random().nextInt(1 << 15));
            populacao.add(individuo);
        }
    }

    public Integer getTamanhoPopulacao() {
        return tamanhoPopulacao;
    }

    public void setTamanhoPopulacao(Integer tamanhoPopulacao) {
        this.tamanhoPopulacao = tamanhoPopulacao;
    }

    public List<Individuo> getPopulacao() {
        return populacao;
    }

    public void setPopulacao(List<Individuo> populacao) {
        this.populacao = populacao;
    }
}
