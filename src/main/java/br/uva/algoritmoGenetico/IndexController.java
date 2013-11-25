package br.uva.algoritmoGenetico;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.uva.algoritmoGenetico.dominio.*;
import br.uva.algoritmoGenetico.util.Util;

import java.util.ArrayList;
import java.util.List;

@Resource
public class IndexController {

    private final Result result;
    private Util util;

    public IndexController(Result result, Util util) {
        this.result = result;
        this.util = util;
    }

    @Path("/")
    public void index() {
        result.include("", "VRaptor 3.5");
    }

    @Path("/maximizarFuncao")
    public void maximizarFuncao(short coefX, short coefY, String funcao ,short coefZ, Integer tamanhoPopulacao, Integer numeroGeracoes, float taxaCrossover){
        Equacao equacao = new Equacao(coefX,coefY,coefZ,funcao);
        Geracoes geracoes = new Geracoes();
        geracoes.setNumeroDeGeracoes(numeroGeracoes);

        //Cria classe para controlar crossover
        Crossover crossover = new Crossover(taxaCrossover);

        //Iniciar População aleatória
        IniciarPopulacao iniciarPopulacao = new IniciarPopulacao();
        iniciarPopulacao.iniciarPopulacao(tamanhoPopulacao);

        //População inicial
        List<Individuo> populacao = iniciarPopulacao.getPopulacao();


        for(int i=0;i<=geracoes.getNumeroDeGeracoes();i++){
            //Avaliação prévia
            Avaliacao.avaliacao(populacao,equacao);

            List<Individuo> novosDoCrossover = new ArrayList<Individuo>();
            //faz crossover
            for (Individuo individuo : populacao){
                if(crossover.fazCrossOver(individuo)){
                    Individuo selecionado = iniciarPopulacao.selecaoCrossOver();
                    novosDoCrossover.add(crossover.realizarCrossover(individuo, selecionado));
                }
            }

            //tem mutação

            //Avalia
            Avaliacao.avaliacao(populacao,equacao);

            //classifica e cria nova geração
            populacao = geracoes.reproducao(populacao);
        }

        result.include("resultado", "Maximizado!!!");
    }

}
