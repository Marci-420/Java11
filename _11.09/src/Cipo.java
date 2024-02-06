public class Cipo {

    private String marka, szin;
    private int meret;

    public Cipo(String marka, String szin, int meret) {
        this.setMarka(marka);
        this.setSzin(szin);
        this.setMeret(meret);

    }



    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public int getMeret() {
        return meret;
    }

    public void setMeret(int meret) {
        this.meret = meret;
    }

    @Override
    public String toString() {
        return "A cipő márkája: " + this.getMarka() + '\'' +
                ", színe: " + this.getSzin() + '\'' +
                ", mérete: " + this.getMeret();
    }



}
