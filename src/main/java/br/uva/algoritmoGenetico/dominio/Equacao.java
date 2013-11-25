package br.uva.algoritmoGenetico.dominio;

/**
 * Created with IntelliJ IDEA.
 * User: leoneves
 * Date: 11/24/13
 * Time: 12:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class Equacao {

    private long coeficienteX;
    private long coeficienteY;
    private long coeficienteZ;
    private String funcaoEmz;

    public Equacao() {}

    public Equacao(long coeficienteX, long coeficienteY, long coeficienteZ, String funcaoEmz) {
        this.coeficienteX = coeficienteX;
        this.coeficienteY = coeficienteY;
        this.coeficienteZ = coeficienteZ;
        this.funcaoEmz = funcaoEmz;
    }

    public Double aplicaFuncao(Double operando){
        Double rad = Math.toRadians(operando);
        switch (funcaoEmz){
            case "sin":
                return Math.sin(rad);
            case "cos":
                return Math.cos(rad);
            case "vazio":
                return operando;
            default:
                return operando;
        }
    }

    public long getCoeficienteX() {
        return coeficienteX;
    }

    public void setCoeficienteX(long coeficienteX) {
        this.coeficienteX = coeficienteX;
    }

    public long getCoeficienteY() {
        return coeficienteY;
    }

    public void setCoeficienteY(long coeficienteY) {
        this.coeficienteY = coeficienteY;
    }

    public long getCoeficienteZ() {
        return coeficienteZ;
    }

    public void setCoeficienteZ(long coeficienteZ) {
        this.coeficienteZ = coeficienteZ;
    }

    public String getFuncaoEmz() {
        return funcaoEmz;
    }

    public void setFuncaoEmz(String funcaoEmz) {
        this.funcaoEmz = funcaoEmz;
    }
}
