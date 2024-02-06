public class Kremesexception extends Exception{

    public Kremesexception(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Kremesexception keletkezett: " + this.getMessage();
    }
}
