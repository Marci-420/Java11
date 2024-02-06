public class Torta {

    private int emeletSzam;
    private boolean isKremes;
    private String alak;

    public Torta(int emeletSzam, boolean isKremes, String alak) {
        this.setEmeletSzam(emeletSzam);
        this.setKremes(isKremes);
        this.setAlak(alak);
    }
    public Torta() {
        this(1, false, "kör");
    }

    public void ujEmelet(){
        this.setEmeletSzam(emeletSzam + 1);
    }

    public void kremmelMegken() throws TortaException{
        if(isKremes()){
            throw new TortaException("A torta már meg van kenve krémmek!");
        }
            else{
                setKremes(true);
            }
    }

    public int mennyiKaloria(){
        if (isKremes) {
            return emeletSzam * 1000 * 2;
        }
        return emeletSzam * 1000;
    }

    public int getEmeletSzam() {
        return emeletSzam;
    }

    public void setEmeletSzam(int emeletSzam) throws IllegalArgumentException{
        if(emeletSzam<=0){
            throw new IllegalArgumentException("Az emeletek száma csak pozitív lehet");
        }
        this.emeletSzam = emeletSzam;
    }

    public boolean isKremes() {
        return isKremes;
    }

    public void setKremes(boolean kremes) {
        isKremes = kremes;
    }

    public String getAlak() {
        return alak;
    }

    public void setAlak(String alak) {
        this.alak = alak;
    }

    @Override
    public String toString() {
        return "{" + this.getAlak() +
                "; " + this.getEmeletSzam() +
                ";" + this.isKremes() +
                '}';
    }
}
