package br.uva.algoritmoGenetico.dominio;

import java.util.BitSet;

/**
 * Created with IntelliJ IDEA.
 * User: leoneves
 * Date: 11/24/13
 * Time: 8:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Cromossomo {

    private BitSet cromossomo;

    public Cromossomo() {
        this.cromossomo = new BitSet(48);
    }

    public BitSet getCromossomo() {
        return cromossomo;
    }

    public void setCromossomo(BitSet cromossomo) {
        this.cromossomo = cromossomo;
    }

    public void setDecimalCromossomoX(int value) {
        int index = 0;
        while ((value != 0) || (index > 15)) {
            if (value % 2 != 0) {
                cromossomo.set(index);
            }
            ++index;
            value = value >>> 1;
        }
        if (index > 15)
            System.out.print("ERRO !!!");
    }

    public void setDecimalCromossomoY(int value) {
        int index = 16;
        while ((value != 0) || (index > 31)) {
            if (value % 2 != 0) {
                cromossomo.set(index);
            }
            ++index;
            value = value >>> 1;
        }
        if (index > 31)
            System.out.print("ERRO !!!");
    }

    public void setDecimalCromossomoZ(int value) {
        int index = 32;
        while ((value != 0) || (index > 47)) {
            if (value % 2 != 0) {
                cromossomo.set(index);
            }
            ++index;
            value = value >>> 1;
        }
        if (index > 47)
            System.out.print("ERRO !!!");
    }

    public BitSet convert(int value) {
        BitSet bits = new BitSet();
        int index = 0;
        while (value != 0) {
            if (value % 2 != 0) {
                bits.set(index);
            }
            ++index;
            value = value >>> 1;
        }
        return bits;
    }

    public short retornaX() {
        short value = 0;
        for (int i = 0; i <= 15; ++i) {
            value += cromossomo.get(i) ? (1 << i) : 0;
        }
        return value;
    }

    public short retornaY() {
        short value = 0;
        int desloc = 0;
        for (int i = 16; i <= 31; ++i) {
            value += cromossomo.get(i) ? (1 << desloc) : 0;
            desloc++;
        }
        return value;
    }

    public short retornaZ() {
        short value = 0;
        int desloc = 0;
        for (int i = 32; i <= 47; ++i) {
            value += cromossomo.get(i) ? (1 << desloc) : 0;
            desloc++;
        }
        return value;
    }
}