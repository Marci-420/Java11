package org.example;

public class Autobusz {

    private int ferohely, berles;
    private boolean csoklos_e;

    public Autobusz(int ferohely, int berles, boolean csoklos_e) {
        this.ferohely = ferohely;
        this.berles = berles;
        this.csoklos_e = csoklos_e;
    }

    public int getFerohely() {
        return ferohely;
    }

    public void setFerohely(int ferohely) {
        if(ferohely <= 0){
            throw new IllegalArgumentException("A memória csak 0-nál nagyobb lehet");
        }
        this.ferohely = ferohely;
    }

    public int getBerles() {
        return berles;
    }

    public void setBerles(int berles) {
        this.berles = berles;
    }

    public boolean isCsoklos_e() {
        return csoklos_e;
    }

    public void setCsoklos_e(boolean csoklos_e) {
        this.csoklos_e = csoklos_e;
    }

    public void hozzaAdo(int utas) throws IllegalArgumentException, UtasNumberException{
        if(utas <= 0){
            throw new IllegalArgumentException("Az utasok számának nagyobbnak kell lennie  0-nál!");
        }

        else{
            throw new UtasNumberException(" Nem lehet másolni a programot, mert nincs elég memória!");
        }
    }

    }

