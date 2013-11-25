package br.uva.algoritmoGenetico;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.uva.algoritmoGenetico.dominio.*;
import br.uva.algoritmoGenetico.util.Util;

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
    public void maximizarFuncao(long coefX, long coefY, String funcao ,long coefZ, Integer tamanhoPopulacao){
        Equacao equacao = new Equacao(coefX,coefY,coefZ,funcao);
        Geracoes geracoes = new Geracoes();

        //Iniciar População aleatória
        IniciarPopulacao iniciarPopulacao = new IniciarPopulacao();
        iniciarPopulacao.iniciarPopulacao(tamanhoPopulacao);

        //População inicial
        List<Individuo> populacao = iniciarPopulacao.getPopulacao();


        for(int i=0;i<=geracoes.getNumeroDeGeracoes();i++){
            //faz crossover

            //tem mutação

            //Avalia
            Avaliacao.avaliacao(populacao,equacao);

            //classifica e cria nova geração
            populacao = geracoes.reproducao(populacao);
        }

        result.include("resultado", "Maximizado!!!");
    }

}
