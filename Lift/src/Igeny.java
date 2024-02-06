public class Igeny {
    private int h, m, s, kiinduloSzint, vegSzint;
    private String csapatSzam;

    public Igeny(String line){
        String[] split = line.split(" ");

        this.setH(Integer.parseInt(split[0]));
        this.setM(Integer.parseInt(split[1]));
        this.setS(Integer.parseInt(split[2]));
        this.setCsapatSzam(split[3]);
        this.setKiinduloSzint(Integer.parseInt(split[4]));
        this.setVegSzint(Integer.parseInt(split[5]));
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public String getCsapatSzam() {
        return csapatSzam;
    }

    public void setCsapatSzam(String csapatSzam) {
        this.csapatSzam= csapatSzam;
    }

    public int getKiinduloSzint() {
        return kiinduloSzint;
    }

    public void setKiinduloSzint(int kiinduloSzint) {
        this.kiinduloSzint = kiinduloSzint;
    }

    public int getVegSzint() {
        return vegSzint;
    }

    public void setVegSzint(int vegSzint) {
        this.vegSzint = vegSzint;
    }

    @Override
    public String toString() {
        return "h = " + h +
                ", m = " + m +
                ", s = " + s +
                ", startFloor = " + kiinduloSzint +
                ", destinationFloor = " + vegSzint +
                ", teamNumber = " + csapatSzam;
    }
}
