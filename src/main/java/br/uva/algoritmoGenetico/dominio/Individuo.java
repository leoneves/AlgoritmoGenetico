package br.uva.algoritmoGenetico.dominio;

/**
 * Created with IntelliJ IDEA.
 * User: leoneves
 * Date: 11/24/13
 * Time: 11:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class Individuo {

    private Cromossomo cromossomo;
    private long x;
    private long y;
    private long z;
    private long valorAvaliacao;

    public Individuo() {
        this.cromossomo = new Cromossomo();
    }

    public void avaliaIndividuo(Equacao equacao){
        long primeira = this.getX() * equacao.getCoeficienteX();
        long segunda =  this.getY() * equacao.getCoeficienteY();
        long terceira = this.getZ() * equacao.getCoeficienteZ();
        valorAvaliacao = primeira + segunda + terceira;
    }

    public Cromossomo getCromossomo() {
        return cromossomo;
    }

    public void setCromossomo(Cromossomo cromossomo) {
        this.cromossomo = cromossomo;
    }

    public long getX() {
        return cromossomo.retornaX();
    }

    public void setX(long x) {
        this.x = x;
        cromossomo.setDecimalCromossomoX(x);
    }

    public long getY() {
        return cromossomo.retornaY();
    }

    public void setY(long y) {
        this.y = y;
        cromossomo.setDecimalCromossomoY(y);
    }

    public long getZ() {
        return cromossomo.retornaZ();
    }

    public void setZ(long z) {
        this.z = z;
        cromossomo.setDecimalCromossomoZ(z);
    }

    public long getValorAvaliacao() {
        return valorAvaliacao;
    }

    public void setValorAvaliacao(long valorAvaliacao) {
        this.valorAvaliacao = valorAvaliacao;
    }
}
