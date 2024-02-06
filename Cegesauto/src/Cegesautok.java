public class Cegesautok {
    private int nap, km;
    private String ido, rendszam, soforID;
    private boolean be;

    public Cegesautok(int nap, int km, String ido, String rendszam, String soforID, boolean be) {
        this.nap = nap;
        this.km = km;
        this.ido = ido;
        this.rendszam = rendszam;
        this.soforID = soforID;
        this.be = be;
    }

    public int getNap() {
        return nap;
    }

    public void setNap(int nap) {
        this.nap = nap;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getIdo() {
        return ido;
    }

    public void setIdo(String ido) {
        this.ido = ido;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public String getSoforID() {
        return soforID;
    }

    public void setSoforID(String soforID) {
        this.soforID = soforID;
    }

    public boolean isBe() {
        return be;
    }

    public void setBe(boolean be) {
        this.be = be;
    }
}
