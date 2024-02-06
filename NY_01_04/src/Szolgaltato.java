import java.util.ArrayList;

public class Szolgaltato {
    private ArrayList<SIM> simek;

    public Szolgaltato() {
        this.simek = new ArrayList<SIM>();
    }

    public void add(SIM s) throws Exception {
        if(simek.contains(s)){
            throw new Exception("Ez a telefonszám már létezik: " +s.getNumber());
        }
        else{
            simek.add(s);
        }
    }

    public boolean isPinCode(String Number, String Pin){
        for(int i =0; i < simek.size(); i++){
            if(Number.equals(simek.get(i).getNumber()) && Pin.equals(simek.get(i).getPin())){
                return true;
            }
        }
        return false;
    }
    public boolean isPukCode(String Number, String Puk){
        for(int i =0; i < simek.size(); i++){
            if(Number.equals(simek.get(i).getNumber()) && Puk.equals(simek.get(i).getPuk())){
                return true;
            }
        }
        return false;
    }


    public String toString() {
       String er = "A szolgáltató SIM kártyái: " ;
                for(int i =0; i < simek.size(); i++){
                    er = simek.get(i) + "\n";
                }
                return er;
    }
}
