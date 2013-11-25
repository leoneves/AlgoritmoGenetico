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
    private short x;
    private short y;
    private short z;
    private double valorAvaliacao;
    private double probabilidadeselecaoCrossover;
    private static float avaliacaoTotal;

    public Individuo() {
        this.cromossomo = new Cromossomo();
    }

    public void avaliaIndividuo(Equacao equacao){
        int primeira = this.getX() * equacao.getCoeficienteX();
        int segunda =  this.getY() * equacao.getCoeficienteY();
        int terceira = this.getZ() * equacao.getCoeficienteZ();
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

    public static float getAvaliacaoTotal() {
        return avaliacaoTotal;
    }

    public static void setAvaliacaoTotal(int avaliacaoTotal) {
        Individuo.avaliacaoTotal = avaliacaoTotal;
    }
}
