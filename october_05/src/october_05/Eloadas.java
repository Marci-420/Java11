
package october_05;


public class Eloadas {

    private String cim;
    private double nettoAr;
    private double eladhato;
    private double eladott;

    Public Eloadas(String cim, double nettoAr, double eladhato, double eladott){
        this.cim(cim);
        this.nettoAr(nettoAr);
        this.eladhato(eladhato);
        this.eladott(eladott);

    }

    Public Eloadas(){
        this(0, 15000, 0,0);
}

    public String getCim(){
       return this.cim;
}
    public double getNettoAr(){
           return this.nettoAr;
    }
    public double getEladhato(){
           return this.eladhato;
    }
    public double getEladott(){
           return this.eladott;
    }

    public void setCim(String cim){
        this.cim = cim;
}
    public void setNettoAr(double nettoAr){
           this.nettoAr = nettoAr;
   }
    public void (double eladhato){
           this.eladhato = eladhato;
   }
    public void (double eladott){
           this.eladott = eladott;
   }

    public String toString(){
        System.out.println(getCim(), getNettoAr(), getEladhato(), getEladott());
}
   
    



}
