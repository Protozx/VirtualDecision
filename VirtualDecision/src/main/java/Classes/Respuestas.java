/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;

/**
 *
 * @author Eidan Plata
 */
public class Respuestas implements Serializable {

    int pos;
    int hu;
    int em;
    int ar;
    int ci;
    int in;

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getHu() {
        return hu;
    }

    public void setHu(int hu) {
        this.hu = hu;
    }

    public int getEm() {
        return em;
    }

    public void setEm(int em) {
        this.em = em;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getIn() {
        return in;
    }

    public void setIn(int in) {
        this.in = in;
    }
}
