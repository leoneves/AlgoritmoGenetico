package br.uva.algoritmoGenetico.dominio;

/**
 * Created with IntelliJ IDEA.
 * User: leoneves
 * Date: 11/24/13
 * Time: 12:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class Equacao {

    private float coeficienteX;
    private float coeficienteY;
    private float coeficienteZ;
    private String funcaoEmz;

    public Equacao() {}

    public Equacao(float coeficienteX, float coeficienteY, float coeficienteZ, String funcaoEmz) {
        this.coeficienteX = coeficienteX;
        this.coeficienteY = coeficienteY;
        this.coeficienteZ = coeficienteZ;
        this.funcaoEmz = funcaoEmz;
    }

    public Float aplicaFuncao(float operando){
        switch (funcaoEmz){
            case "sin":
                return ((Double)Math.sin(operando)).floatValue();
            case "cos":
                return ((Double)Math.cos(operando)).floatValue();
            case "vazio":
                return operando;
            default:
                return operando;
        }
    }

    public float getCoeficienteX() {
        return coeficienteX;
    }

    public void setCoeficienteX(short coeficienteX) {
        this.coeficienteX = coeficienteX;
    }

    public float getCoeficienteY() {
        return coeficienteY;
    }

    public void setCoeficienteY(short coeficienteY) {
        this.coeficienteY = coeficienteY;
    }

    public float getCoeficienteZ() {
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
