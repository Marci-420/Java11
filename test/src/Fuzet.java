public class Fuzet {

    private String mintazat, kotesmod;

    private int vastagsag;

    public Fuzet(String mintazat, String kotesmod, int vastagsag) {
        this.setMintazat(mintazat);
        this.setKotesmod(kotesmod);
        this.setVastagsag(vastagsag);
    }


    public String getMintazat() {
        return mintazat;
    }

    private void setMintazat(String mintazat) {
        this.mintazat = mintazat;
    }

    public String getKotesmod() {
        return kotesmod;
    }

    private void setKotesmod(String kotesmod) {
        this.kotesmod = kotesmod;
    }

    public int getVastagsag() {
        return vastagsag;
    }

    public void setVastagsag(int vastagsag) {
        this.vastagsag = vastagsag;
    }

    @Override
    public String toString() {
        return "A füzet mintázata: '" + this.getMintazat() + '\'' +
                ", kötésmódja: " + this.getKotesmod() + '\'' +
                ", vastagsága: " + this.getVastagsag();
    }


}
