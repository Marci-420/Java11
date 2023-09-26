/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package novenyek_objektum;

/**
 *
 * @author User1
 */
public class Noveny {

    private String nev;
    private String szin;
    private int magassag;
    private boolean evelo;

    public Noveny (String[] adatok) {
        this.nev = adatok[0];
        this.szin = adatok[1];
        this.magassag = Integer.parseInt(adatok[2]);
        this.evelo = Boolean.parseBoolean(adatok[3]);
    }


    public int getMagassag() {
        return magassag;
    }

    public void setMagassag(int magassag) {
        this.magassag = magassag;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public boolean getEvelo() {
        return evelo;
    }

    public void setEvelo(boolean evelo) {
        this.evelo = evelo;
    }
   
    public String getNev(){
        return nev;
    }
   
    public void setNev(String nev) {
        this.nev = nev;
    }


}

