public class Pit {

    private int melyseg;

    public Pit(int melyseg) {
        this.setMelyseg(melyseg);
    }

    public int getMelyseg() {
        return melyseg;
    }

    public void setMelyseg(int melyseg) {
        this.melyseg = melyseg;
    }

    @Override
    public String toString() {
        return "Pit{" +
                "melyseg=" + melyseg +
                '}';
    }
}
