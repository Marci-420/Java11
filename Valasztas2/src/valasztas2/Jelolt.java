package valasztas2;


public class Jelolt{
    private int kerulet;
    private int szavazat;
    private String vezeteknev;
    private String keresztnev;
    private String tamogato;

    public int getKerulet() {
        return kerulet;
    }

    public void setKerulet(int kerulet) {
        this.kerulet = kerulet;
    }

    public int getSzavazat() {
        return szavazat;
    }

    public void setSzavazat(int szavazat) {
        this.szavazat = szavazat;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public void setVezeteknev(String vezeteknev) {
        this.vezeteknev = vezeteknev;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public void setKeresztnev(String keresztnev) {
        this.keresztnev = keresztnev;
    }

    public String getTamogato() {
        return tamogato;
    }

    public void setTamogato(String tamogato) {
        this.tamogato = tamogato;
    }

    public Jelolt(int kerulet, int szavazat, String vezeteknev, String keresztnev, String tamogato) {
        this.kerulet = kerulet;
        this.szavazat = szavazat;
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
        this.tamogato = tamogato;
    }
   
   
}
