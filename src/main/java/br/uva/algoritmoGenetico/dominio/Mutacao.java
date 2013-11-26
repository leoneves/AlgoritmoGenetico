package br.uva.algoritmoGenetico.dominio;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: leoneves
 * Date: 11/25/13
 * Time: 10:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Mutacao {

    private Float taxa;

    public Mutacao(Float taxa) {
        this.taxa = taxa;
    }

    public boolean fazMutacao(Individuo individuo){
        Float fazMutacao = new Random().nextFloat();
        if(fazMutacao <= taxa)
            return true;
        else
            return false;
    }

    public Individuo realizaMutacao(Individuo individuo){
        Integer bit = new Random().nextInt(48);
        boolean valotBit = individuo.getCromossomo().getCromossomo().get(bit);
        if (valotBit)
            individuo.getCromossomo().getCromossomo().set(bit,false);
        else
            individuo.getCromossomo().getCromossomo().set(bit,true);
        individuo.setX(individuo.getX());
        individuo.setY(individuo.getY());
        individuo.setZ(individuo.getZ());
        return individuo;
    }

    public Float getTaxa() {
        return taxa;
    }

    public void setTaxa(Float taxa) {
        this.taxa = taxa;
    }
}
