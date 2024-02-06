public class Hivas {
    private int startHour, startMin, startSec, endHour, endMin, endSec;
    private String telSzam;

    public Hivas(String[] split, String phoneNumber){
        this.startHour = Integer.parseInt(split[0]);
        this.startMin = Integer.parseInt(split[1]);
        this.startSec = Integer.parseInt(split[2]);
        this.endHour = Integer.parseInt(split[3]);
        this.endMin= Integer.parseInt(split[4]);
        this.endSec = Integer.parseInt(split[5]);
        this.telSzam = phoneNumber;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getStartMin() {
        return startMin;
    }

    public void setStartMin(int startMin) {
        this.startMin = startMin;
    }

    public int getStartSec() {
        return startSec;
    }

    public void setStartSec(int startSec) {
        this.startSec = startSec;
    }

    public int getEndHour() {
        return endHour;
    }

    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    public int getEndMin() {
        return endMin;
    }

    public void setEndMin(int endMin) {
        this.endMin = endMin;
    }

    public int getEndSec() {
        return endSec;
    }

    public void setEndSec(int endSec) {
        this.endSec = endSec;
    }

    public String getTelSzam() {
        return telSzam;
    }

    public void setTelSzam(String telSzam) {
        this.telSzam = telSzam;
    }

    public String toString() {
        return
                 "A hívás "+ startHour +
                " óra " + startMin +
                " perc " + startSec +
                " másodperckor kezdődött és " + endHour +
                " óra " + endMin +
                " perc " + endSec +
                " másodperckor fejeződött be, a " + telSzam+ " telefonszámon."+ '\'';

    }
}
