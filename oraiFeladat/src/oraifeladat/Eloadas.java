

package oraifeladat;


public class Eloadas {

    private String cim;
    private int nettoAr, eladhato, eladott, sum;
    
   

    public Eloadas(String cim, int nettoAr, int eladhato){
        this.setCim(cim);
        this.setNettoAr(nettoAr);
        this.setEladhato(eladhato);

    }

    public Eloadas(String cim, int eladhato){
        this(cim, 15000, eladhato);

    }

    public void setCim(String cim){
        this.cim=cim;
}

    public void setNettoAr(int nettoAr){
        this.nettoAr=nettoAr;
}

    public void setEladhato(int eladhato){
        if(eladhato > 0){
            this.eladhato=eladhato;
        }
}

    public void setEladott(int eladott){
        if(eladott > 0 && eladott <= eladhato){
            this.eladott=eladott;
        }
}


    public String getCim(){
        return cim;
    }
    public int getNettoAr(){
            return nettoAr;
    }
    public int getEladhato(){
            return eladhato;
    }
    public int getEladott(){
            return eladott;
    }
        


    public boolean isFull(){
        return this.eladhato ==this.eladott;
}

    public int getFullMoney(){
        return (int)(eladott * nettoAr * 1.27);
}

    public void setEladottDefault(){
        setEladott(0);
}
    
   public String toString(){
        return "Előadás neve: " + getCim() + 
        ", ára: " + getNettoAr() +
        ", eladott jegyek száma: " + getEladott() +
        ", bevétel: " + getFullMoney() +
        ", telt ház: " + (isFull()? "igen":"nem");
}
    



}
