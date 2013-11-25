package br.uva.algoritmoGenetico.dominio;

import java.util.BitSet;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: leonardoneves
 * Date: 11/25/13
 * Time: 2:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Crossover {

    private Float taxa;

    public Crossover(Float taxa) {
        this.taxa = taxa;
    }

    public boolean fazCrossOver(Individuo individuo){
        Float fazCross = new Random().nextFloat();
        if(fazCross <= taxa)
            return true;
        else
            return false;
    }

    public Individuo realizarCrossover(Individuo individuo, Individuo individuoSelecionado){
        Individuo novo = new Individuo();
        BitSet novoCromossomo = new BitSet(48);
        for (int i=0;i<=47;i++){
            for(int j=i;j<=i+7;j++){
                novoCromossomo.set(j, individuo.getCromossomo().getCromossomo().get(j));
            }
            i += 8;
            for(int j=i;j<=i+7;j++){
                novoCromossomo.set(j,individuoSelecionado.getCromossomo().getCromossomo().get(j));
            }
            i += 8;
        }
        Cromossomo cromossomo = new Cromossomo();
        cromossomo.setCromossomo(novoCromossomo);
        novo.setCromossomo(cromossomo);
        novo.setX(cromossomo.retornaX());
        novo.setY(cromossomo.retornaY());
        novo.setZ(cromossomo.retornaZ());
        return novo;
    }

    public Float getTaxa() {
        return taxa;
    }

    public void setTaxa(Float taxa) {
        this.taxa = taxa;
    }
}
