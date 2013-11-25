package br.uva.algoritmoGenetico.dominio;

/**
 * Created with IntelliJ IDEA.
 * User: leoneves
 * Date: 11/24/13
 * Time: 12:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class Equacao {

    private short coeficienteX;
    private short coeficienteY;
    private short coeficienteZ;
    private String funcaoEmz;

    public Equacao() {}

    public Equacao(short coeficienteX, short coeficienteY, short coeficienteZ, String funcaoEmz) {
        this.coeficienteX = coeficienteX;
        this.coeficienteY = coeficienteY;
        this.coeficienteZ = coeficienteZ;
        this.funcaoEmz = funcaoEmz;
    }

    public Short aplicaFuncao(Short operando){
        Double radTemp = Math.toRadians(operando);
        Short rad = radTemp.shortValue();
        switch (funcaoEmz){
            case "sin":
                return ((Double)Math.sin(rad)).shortValue();
            case "cos":
                return ((Double)Math.cos(rad)).shortValue();
            case "vazio":
                return operando;
            default:
                return operando;
        }
    }

    public short getCoeficienteX() {
        return coeficienteX;
    }

    public void setCoeficienteX(short coeficienteX) {
        this.coeficienteX = coeficienteX;
    }

    public short getCoeficienteY() {
        return coeficienteY;
    }

    public void setCoeficienteY(short coeficienteY) {
        this.coeficienteY = coeficienteY;
    }

    public short getCoeficienteZ() {
        return coeficienteZ;
    }

    public void setCoeficienteZ(short coeficienteZ) {
        this.coeficienteZ = coeficienteZ;
    }

    public String getFuncaoEmz() {
        return funcaoEmz;
    }

    public void setFuncaoEmz(String funcaoEmz) {
        this.funcaoEmz = funcaoEmz;
    }
}
