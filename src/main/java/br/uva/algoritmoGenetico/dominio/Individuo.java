package br.uva.algoritmoGenetico.dominio;

/**
 * Created with IntelliJ IDEA.
 * User: leoneves
 * Date: 11/24/13
 * Time: 11:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class Individuo implements Comparable<Individuo> {

    private Cromossomo cromossomo;
    private short x;
    private short y;
    private short z;
    private double valorAvaliacao;
    private double probabilidadeselecaoCrossover;
    private static double avaliacaoTotal;

    public Individuo() {
        this.cromossomo = new Cromossomo();
    }

    @Override
    public int compareTo(Individuo o) {
        return this.getValorAvaliacao() > o.getValorAvaliacao() ? -1 : (this.getValorAvaliacao() < o.getValorAvaliacao() ? 1 : 0);
    }

    public void avaliaIndividuo(Equacao equacao){
        float primeira = this.getX() * equacao.getCoeficienteX();
        float segunda =  this.getY() * equacao.getCoeficienteY();
        float terceira = this.getZ() * equacao.getCoeficienteZ();
        terceira = equacao.aplicaFuncao(terceira);
        valorAvaliacao = primeira + segunda + terceira;
    }

    public double getProbabilidadeselecaoCrossover() {
        this.setProbabilidadeselecaoCrossover( valorAvaliacao/avaliacaoTotal);
        return valorAvaliacao/avaliacaoTotal;
    }

    public void setProbabilidadeselecaoCrossover(double probabilidadeselecaoCrossover) {
        this.probabilidadeselecaoCrossover = probabilidadeselecaoCrossover;
    }

    public Cromossomo getCromossomo() {
        return cromossomo;
    }

    public void setCromossomo(Cromossomo cromossomo) {
        this.cromossomo = cromossomo;
    }

    public short getX() {
        return cromossomo.retornaX();
    }

    public void setX(short x) {
        this.x = x;
        cromossomo.setDecimalCromossomoX(x);
    }

    public short getY() {
        return cromossomo.retornaY();
    }

    public void setY(short y) {
        this.y = y;
        cromossomo.setDecimalCromossomoY(y);
    }

    public short getZ() {
        return cromossomo.retornaZ();
    }

    public void setZ(short z) {
        this.z = z;
        cromossomo.setDecimalCromossomoZ(z);
    }

    public double getValorAvaliacao() {
        return valorAvaliacao;
    }

    public void setValorAvaliacao(short valorAvaliacao) {
        this.valorAvaliacao = valorAvaliacao;
    }

    public static double getAvaliacaoTotal() {
        return avaliacaoTotal;
    }

    public static void setAvaliacaoTotal(double avaliacaoTotal) {
        Individuo.avaliacaoTotal = avaliacaoTotal;
    }
}
