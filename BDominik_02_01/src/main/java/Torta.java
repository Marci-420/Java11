public class Torta {
    private int emeletekSzama;
    private boolean kremes;
    private String alak;

    public Torta(int emeletekSzama, boolean kremes, String alak) {
        this.setEmeletekSzama(emeletekSzama);
        this.setKremes(kremes);
        this.setAlak(alak);
    }

    public Torta(){
        this(1, false, "kör");
    }

    public int getEmeletekSzama() {
        return emeletekSzama;
    }

    public void setEmeletekSzama(int emeletekSzama) throws IllegalArgumentException{
        if(emeletekSzama<=0){
            throw new IllegalArgumentException("Az emeletek száma csak pozitív érték lehet!");
        }
        this.emeletekSzama = emeletekSzama;
    }

    public boolean isKremes() {
        return kremes;
    }

    public void setKremes(boolean kremes) {
        this.kremes = kremes;
    }

    public String getAlak() {
        return alak;
    }

    public void setAlak(String alak) {
        this.alak = alak;
    }

    public void ujEmelet(){
        this.setEmeletekSzama(getEmeletekSzama()+1);
    }

    public void kremmelMegken() throws TortaException {
        if(isKremes()){
            throw new TortaException("A torta már meg van kenve!");
        }
        this.setKremes(true);
    }

    public int mennyiKaloria(){
        if(isKremes()){
            return emeletekSzama*1000*2;
        }
        return emeletekSzama*1000;
    }

    @Override
    public String toString() {
        return "{" + getAlak() +
                ";" + getEmeletekSzama() +
                ";" + isKremes() +
                "}";
    }
}
