import java.util.*;

public class Mososor implements iAutomoso {

    private List<Jarmu> jarmuvek, osszesJarmu;

    private int bevetel;

    public Mososor() {
       this.jarmuvek = new ArrayList<Jarmu>();
        this.osszesJarmu = new ArrayList<Jarmu>();
    }

    public void add(Jarmu j){
        this.jarmuvek.add(j);
        this.osszesJarmu.add(j);

    }

    public void remove(Jarmu j){
        this.jarmuvek.remove(j);
    }

    public int getBevetel(){
        for(int i = 0; i < osszesJarmu.size(); i++) {

        }

    }


    @Override
    public String toString() {
        String er = "A mosósorban lévő autók: \n";
                for (int i = 0; i < jarmuvek.size(); i++){
                    er += jarmuvek.get(i) + "\n";
                }
                return er;
    }
}
