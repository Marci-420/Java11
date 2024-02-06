public class Szamitogep {

    private double MB;
    private boolean isOn;

    public Szamitogep(double MB, boolean isOn) {
        this.MB = MB;
        this.isOn = isOn;
    }

    private double getMB() {
        return MB;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    @Override
    public String toString() {
        return "Szamitogep{" +
                "MB=" + this.getMB() +
                ", on=" + this.isOn()+
                '}';
    }
}
