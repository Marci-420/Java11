/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package osztalyoksz;



public class Kutya {
    private String nev;
    private String fajta;
    private String szin;
    private int ttomeg;

    public Kutya(String nev, String fajta, String szin, int ttomeg) {
        this.nev = nev;
        this.fajta = fajta;
        this.szin = szin;
        this.ttomeg = ttomeg;
    }

    public String getFajta() {
        return fajta;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public int getTtomeg() {
        return ttomeg;
    }

    public void setTtomeg(int ttomeg) {
        this.ttomeg = ttomeg;
    }
   
    public String getNev(){
        return nev;
    }
   
    public void setNev(String nev) {
        this.nev = nev;
    }
   
   
   
     public void ugat(){
        System.out.println("Vau-vau!");
    }

   }

}


