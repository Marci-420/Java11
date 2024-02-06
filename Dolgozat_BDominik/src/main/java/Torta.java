public class Torta {
    /*
Az osztálynak legyen egy public void kremmelMegken metódusa is, ami nem vár paramétert.
Ha a torta még nincs megkenve krémmel, úgy a metódus tegye meg.
Ha a torta már meg van kenve, akkor saját kivétellel jelezzük, hogy a művelet sikertelen!
Készítsünk egy public int mennyiKaloria metódust az osztályhoz, amely megadja a torta kalóriaértékét!
 A torta minden emelete 1000 kalória értékű, ha még krémmel is meg van kenve, akkor ennek a kétszerese.
    */
    private String alak;
    private int emeletek;
    private boolean krem;


    public Torta(String alak, int emeletek, boolean krem) {
        this.setEmeletek(emeletek);
        this.setKrem(krem);
        this.setAlak(alak);
    }

    public Torta(){
        this("kör",1, false);
    }

    public int getEmeletek() {
        return emeletek;
    }

    public void setEmeletek(int emeletek) {
        this.emeletek = emeletek;
    }

    public boolean isKrem() {
        return krem;
    }

    public void setKrem(boolean krem) {
        this.krem = krem;
    }

    public String getAlak() {
        return alak;
    }

    public void setAlak(String alak) {
        this.alak = alak;
    }

    //public void ujEmelet metódusa, ami nem vár paramétert
    //és egy új emeletet rak a tortára.
    public void ujEmelet(){
        this.setEmeletek(this.getEmeletek()+1);
    }

    //public void kremmelMegken metódusa is, ami nem vár paramétert.
    //Ha a torta még nincs megkenve krémmel, úgy a metódus tegye meg.
    //Ha a torta már meg van kenve, akkor saját kivétellel jelezzük, hogy a művelet sikertelen!
    public void kremmelMegken() throws TortaException{
        this.setKrem(true);
    }

    //public int mennyiKaloria metódust az osztályhoz, amely megadja a torta kalóriaértékét!
    // A torta minden emelete 1000 kalória értékű, ha még krémmel is meg van kenve, akkor ennek a kétszerese.
    public int mennyiKaloria(){
        return  (this.isKrem()?this.getEmeletek()*2*1000:this.getEmeletek()*1000);
    }

    @Override
    public String toString() {
        return "{"+this.getAlak() +
                ";" +this.getEmeletek() +
                ";" + this.isKrem() +
                "}";
    }
}
