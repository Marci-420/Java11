/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package objektumlista;


public class Eredmeny {

    public String nev;
    public String part;
    public String korzet;
    public int szavazat;

    public Eredmeny(String nev, String part, String korzet, int szavazat){
            this.nev = nev;
            this.part = part;
            this.korzet = korzet;
            this.szavazat = szavazat;

        }

    public String getNev(){
        return this.nev;
}
    public String getPart(){
           return this.part;
    }
    public String getKorzet(){
           return this.korzet;
    }
    public int getSzavazat(){
           return this.szavazat;
    }

    public void setNev(String nev){
        this.nev = nev;
}
    public void setPart(String part){
           this.part = part;
   }
    public void setKorzet(String korzet){
           this.korzet = korzet;
   }
    public void setSzavazat(int szavazat){
           this.szavazat = szavazat;
   }    

}
