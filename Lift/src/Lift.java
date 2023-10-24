public class Lift {



    private int hour;
    private int min;
    private int sec;

    private int csapat;

    private int szintTol;
    private int szintIg;

    public Lift(int hour, int min, int sec, int csapat, int szintTol, int szintIg) {
        this.setHour(hour);
        this.setMin(min);
        this.setSec(sec);
        this.setCsapat(csapat);
        this.setSzintTol(szintTol);
        this.setSzintIg(szintIg);
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getCsapat() {
        return csapat;
    }


    public void setCsapat(int csapat) {
        this.csapat = csapat;
    }

    public int getSzintTol() {
        return szintTol;
    }

    public void setSzintTol(int szintTol) {
        this.szintTol = szintTol;
    }

    public int getSzintIg() {
        return szintIg;
    }

    public void setSzintIg(int szintIg) {
        this.szintIg = szintIg;
    }
    public String toString() {
        return  hour +
                " óra " + min +
                " perc " + sec +
                " másodperckor a " + csapat +
                ". csapat igényelt liftet, hogy a " + szintTol +
                ". szinttől a " + szintIg +
                ". szintig eljusson.";
    }


}
