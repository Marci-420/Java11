/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package allatoksz;

/**
 *
 * @author User1
 */
public class farkasok extends kutyak{

        private String alfaj;
        private String elofordulas;

    public farkasok(String osztaly, String fajtacsoport, String alfaj, String elofordulas){
    super(osztaly, fajtacsoport);
            this.alfaj = alfaj;
            this.elofordulas = elofordulas;

    }

    public String getAlfaj(){
            return alfaj;
            }
   
    public void setAlfaj(String alfaj) {
        this.alfaj = alfaj;
    }
    
    public String getElofordulas(){
                return elofordulas;
            }
   
    public void setElofordulas(String elofordulas) {
        this.elofordulas = elofordulas;
    }


    public String toString(){
        return "Osztálya: " + this.getOsztaly() + ", Fajtacsoportja: " + this.getFajtacsoport() + ", fajtája: " + this.getAlfaj() + ", előfordulása: " + this.getElofordulas();
}
}
