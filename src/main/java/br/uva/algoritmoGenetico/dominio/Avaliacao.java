package br.uva.algoritmoGenetico.dominio;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: leoneves
 * Date: 11/25/13
 * Time: 12:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class Avaliacao {

    public static void avaliacao(List<Individuo> populacao, Equacao equacao){
        for(Individuo individuo : populacao){
            individuo.avaliaIndividuo(equacao);
        }

    }

}
