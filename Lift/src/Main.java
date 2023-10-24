
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        RandomAccessFile raf;
        String sor;
        ArrayList<String> adatok = new ArrayList<>();

            try {
                raf = new RandomAccessFile("igeny.txt", "r");
                raf.readLine();
                raf.readLine();
                raf.readLine();
                sor = raf.readLine();

                while (sor != null) {
                    adatok.add(sor);
                    sor = raf.readLine();
                }

                raf.close();
            } catch (IOException e) {
                System.out.println("hiba");
            }

            ArrayList<Lift> liftek = new ArrayList<>();
            for (String adat : adatok) {
                Lift ujLift = new Lift (Integer.parseInt(adat.split(" ")[0]),
                        Integer.parseInt(adat.split(" ")[1]),
                        Integer.parseInt(adat.split(" ")[2]),
                        Integer.parseInt(adat.split(" ")[3]),
                        Integer.parseInt(adat.split(" ")[4]),
                        Integer.parseInt(adat.split(" ")[5]));
                liftek.add(ujLift);
            }


            for (int i = 0; i < liftek.size(); i++){
                System.out.println(liftek.get(i));
            }

            }

    }
