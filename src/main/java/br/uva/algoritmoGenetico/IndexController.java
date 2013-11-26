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
    private Individuo max;

    public IndexController(Result result, Util util) {
        this.result = result;
        this.util = util;
    }

    @Path("/")
    public void index() {
        result.include("", "VRaptor 3.5");
    }

    @Path("/maximizarFuncao")
    public void maximizarFuncao(Float coefX, Float coefY, String funcao ,Float coefZ, Integer tamanhoPopulacao, Integer numeroGeracoes, float taxaCrossover, float taxaMutacao){
        coefX = coefX == null ? 1 : coefX;
        coefY = coefY == null ? 1 : coefY;
        coefZ = coefZ == null ? 1 : coefZ;

        Equacao equacao = new Equacao(coefX,coefY,coefZ,funcao);
        Geracoes geracoes = new Geracoes();
        geracoes.setNumeroDeGeracoes(numeroGeracoes);

        //Cria classe para controlar crossover
        Crossover crossover = new Crossover(taxaCrossover);

        //cria classe para fazer mutação
        Mutacao mutacao = new Mutacao(taxaMutacao);

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
            for (Individuo individuo : populacao){
                if(mutacao.fazMutacao(individuo)){
                    populacao.set(populacao.indexOf(individuo),mutacao.realizaMutacao(individuo));
                }
            }

            //Avalia
            Avaliacao.avaliacao(populacao,equacao);
            Avaliacao.avaliacao(novosDoCrossover,equacao);

            //classifica e cria nova geração
            populacao = geracoes.reproducao(populacao, novosDoCrossover);
        }

        max = populacao.get(0);

        result.include("x",max.getX());
        result.include("y",max.getY());
        result.include("z",max.getZ());
    }

}
