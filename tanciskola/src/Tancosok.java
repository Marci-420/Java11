public class Tancosok {



    private String tanc;
    private String man;
    private String woman;

    public Tancosok(String tanc, String man, String woman) {
        this.setTanc(tanc);
        this.setMan(man);
        this.setWoman(woman);
    }

    public String getTanc() {
        return tanc;
    }

    public void setTanc(String tanc) {
        this.tanc = tanc;
    }

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public String getWoman() {
        return woman;
    }

    public void setWoman(String woman) {
        this.woman = woman;
    }

    @Override
    public String toString() {
        return
                "Tánc típus: " + tanc +
                ", férfi tag: " + man +
                ", női tag: " + woman;
    }




}
