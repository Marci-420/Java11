public class Feladatok {

    private String kerdes;
    private String valasz;

    public Feladatok(String kerdes, String valasz) {
        this.kerdes = kerdes;
        this.valasz = valasz;
    }

    public String getKerdes() {
        return kerdes;
    }

    public void setKerdes(String kerdes) {
        this.kerdes = kerdes;
    }

    public String getValasz() {
        return valasz;
    }

    public void setValasz(String valasz) {
        this.valasz = valasz;
    }

    @Override
    public String toString() {
        return "A kérdés: " + kerdes + '\'' +
                ", a valasz: " + valasz + '\'';
    }
}

