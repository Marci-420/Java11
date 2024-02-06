
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> adatok = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        try (RandomAccessFile raf = new RandomAccessFile("meccs.txt", "r")) {
            String line;
            while ((line = raf.readLine()) != null) {
                adatok.add(line);
            }

            raf.close();
        } catch (IOException e) {
            throw new RuntimeException();
        }

        ArrayList<Tabella> liftek = new ArrayList<>();
        for (String adat : adatok) {
            Tabella ujLift = new Tabella (Integer.parseInt(adat.split(" ")[0]),
                    Integer.parseInt(adat.split(" ")[1]),
                    Integer.parseInt(adat.split(" ")[2]),
                    Integer.parseInt(adat.split(" ")[3]),
                    Integer.parseInt(adat.split(" ")[4]),
                    adat.split(" ")[5];
                    adat.split(" ")[6];
            liftek.add(ujLift);
        }


        System.out.println("2. feladat");
        System.out.println("Adja meg egy forduló számát: ");
        Integer ford = s.nextInt();

        System.out.println("A(z) " + ford + ". forduló mérkőzéseinek adatai:");

        for (int i = 1; i < adatok.size(); i++) {
            String[] splitLine = adatok.get(i).split(" ");
            int fordulo = Integer.parseInt(splitLine[0]);
            if (fordulo == ford) {
                int eredmeny1 = Integer.parseInt(splitLine[1]);
                int eredmeny2 = Integer.parseInt(splitLine[2]);
                int fel1 = Integer.parseInt(splitLine[3]);
                int fel2 = Integer.parseInt(splitLine[4]);
                String csapat1 = splitLine[5];
                String csapat2 = splitLine[6];


                System.out.println(csapat1 + "-" + csapat2 + ":" + " " + eredmeny1 + "-" + eredmeny2 + " (" + fel1 + "-" + fel2 +")");
            }
        }

        System.out.println("3. feladat");
        for (int i = 1; i < adatok.size(); i++) {
            String[] splitLine = adatok.get(i).split(" ");
            int fordulo = Integer.parseInt(splitLine[0]);
            int eredmeny1 = Integer.parseInt(splitLine[1]);
            int eredmeny2 = Integer.parseInt(splitLine[2]);
            int fel1 = Integer.parseInt(splitLine[3]);
            int fel2 = Integer.parseInt(splitLine[4]);
            String csapat1 = splitLine[5];
            String csapat2 = splitLine[6];

            if (eredmeny1 > eredmeny2 && fel1 < fel2) {
                System.out.println("Forduló: " + fordulo + ", győztes csapat: " + csapat1);
            }
            if (eredmeny2 > eredmeny1 && fel2 < fel1){
                System.out.println("Forduló: " + fordulo + " , győztes csapat: " + csapat2);
            }
        }

        System.out.println("4. feladat");
        System.out.println("Adja meg egy csapat nevét: ");
        String bekert = s.next();

        System.out.println("5. feladat");

        int golok = 0;
        int kapott= 0;

        for (int i = 1; i < adatok.size(); i++) {
            String[] splitLine = adatok.get(i).split(" ");
            int fordulo = Integer.parseInt(splitLine[0]);
            int eredmeny1 = Integer.parseInt(splitLine[1]);
            int eredmeny2 = Integer.parseInt(splitLine[2]);
            int fel1 = Integer.parseInt(splitLine[3]);
            int fel2 = Integer.parseInt(splitLine[4]);
            String csapat1 = splitLine[5];
            String csapat2 = splitLine[6];

            if (bekert == csapat1) {
                golok += eredmeny1;
                kapott+= eredmeny2;

            }
            if (bekert == csapat2){
                golok += eredmeny2;
                kapott+= eredmeny1;
            }
        }
        System.out.println("lőtt: "+ golok + " kapott: "+ kapott);

    }
}
