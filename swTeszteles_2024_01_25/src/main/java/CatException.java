public class CatException extends Exception{

    public CatException(String message) {
        super(message);
    }

    public String toString() {
        return "CatException keletkezett: " + this.getMessage();
    }
}
