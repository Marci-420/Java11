public class Tabella {

    private int fordulo, eredmeny1, eredmeny2, fel1, fel2;
    private String csapat1, csapat2;

    public Tabella(int fordulo, int eredmeny1, int eredmeny2, int fel1, int fel2, String csapat1, String csapat2) {
        this.setFordulo(fordulo);
        this.setEredmeny1(eredmeny1);
        this.setEredmeny2(eredmeny2);
        this.setFel1(fel1);
        this.setFel2(fel2);
        this.setCsapat1(csapat1);
        this.setCsapat2(csapat2);
    }

    public int getFordulo() {
        return fordulo;
    }

    public void setFordulo(int fordulo) {
        this.fordulo = fordulo;
    }

    public int getEredmeny1() {
        return eredmeny1;
    }

    public void setEredmeny1(int eredmeny1) {
        this.eredmeny1 = eredmeny1;
    }

    public int getEredmeny2() {
        return eredmeny2;
    }

    public void setEredmeny2(int eredmeny2) {
        this.eredmeny2 = eredmeny2;
    }

    public int getFel1() {
        return fel1;
    }

    public void setFel1(int fel1) {
        this.fel1 = fel1;
    }

    public int getFel2() {
        return fel2;
    }

    public void setFel2(int fel2) {
        this.fel2 = fel2;
    }

    public String getCsapat1() {
        return csapat1;
    }

    public void setCsapat1(String csapat1) {
        this.csapat1 = csapat1;
    }

    public String getCsapat2() {
        return csapat2;
    }

    public void setCsapat2(String csapat2) {
        this.csapat2 = csapat2;
    }

    @Override
    public String toString() {
        return "Tabella{" +
                "fordulo=" + fordulo +
                ", eredmeny1=" + eredmeny1 +
                ", eredmeny2=" + eredmeny2 +
                ", fel1=" + fel1 +
                ", fel2=" + fel2 +
                ", csapat1='" + csapat1 + '\'' +
                ", csapat2='" + csapat2 + '\'' +
                '}';
    }
}
