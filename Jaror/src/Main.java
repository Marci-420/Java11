import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RandomAccessFile raf;
        String sor;


        ArrayList<String> adatok = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        try {
            raf = new RandomAccessFile("jarmu.txt", "r");
            sor = raf.readLine();

            while (sor != null) {
                adatok.add(sor);
                sor = raf.readLine();
            }

            raf.close();
        } catch (IOException e) {
            System.out.println("hiba");
        }


        ArrayList<Jaror> adatok2 = new ArrayList<>();
        for (String adat : adatok) {
            Jaror uj = new Jaror (Integer.parseInt(adat.split(" ")[0]),
                    Integer.parseInt(adat.split(" ")[1]),
                    Integer.parseInt(adat.split(" ")[2]),
                    adat.split(" ")[3]);
            adatok2.add(uj);
        }



        System.out.println("\n 2.feladat");
        int e = adatok2.get(1).getH();
        int utso = adatok2.get(adatok2.size() -1).getH() +1 ;
        int x = utso -e;
        System.out.println("Legalább " + x + " órát dolgoztak.");

        System.out.println("\n 3.feladat");
        int first = adatok2.get(0).getH();
        String firstJ = adatok2.get(0).getJarmu();
        System.out.println(first +" óra:" + firstJ);
        for( Jaror y : adatok2 ){
            if(y.getH() > first){
                System.out.println(y.getH() +" óra:" + y.getJarmu());
                first ++;
            }
        }

        System.out.println("\n 4.feladat");


        int motor = 0;
        int kamion= 0;
        int autobusz = 0;

        for (Jaror f : adatok2){
            if(f.getJarmu().split("")[0].contains("B")){
                autobusz++;
            }
            else if(f.getJarmu().split("")[0].contains("K")){
                kamion++;
            }
            else if(f.getJarmu().split("")[0].contains("M")){
                motor++;
            }
        }

        System.out.println(motor + " db motor, " + kamion + " db kamion és " + autobusz + " db autóbusz haladt el az ellenőrzőpont előtt.");


        int leghStart = 0;
        for (int i = 0; i < adatok2.size()-1; i++){
            Jaror e1 = adatok2.get(i);
            Jaror e2 = adatok2.get(i+1);
            if (e2.getMp()-e1.getMp() > adatok2.get(leghStart+1).getMp()-adatok2.get(leghStart).getMp()){
                leghStart = i;
            }
        }
        Jaror e1 = adatok2.get(leghStart);
        Jaror e2 = adatok2.get(leghStart+1);
        System.out.println("5. feladat\n"+e1.getH()+":"+e1.getMin()+":"+e1.getMp()+" - "+e2.getH()+":"+e2.getMin()+":"+e2.getMp());



        System.out.println("6.feladat\nAdja meg a keresett rendszámot (A hiányos karaktereket *-al helyettesítse):");
            String bekert = s.next();
            for(Jaror rs : adatok2) {
            if (rs.getJarmu().length() == bekert.length()) {
                char[] jelenlegi = rs.getJarmu().toCharArray();
                for (int d = 0; d < jelenlegi.length; d++) {
                    if (bekert.charAt(d) == '*') {
                        jelenlegi[d] = '*';
                    }
                }
                if (Arrays.equals(jelenlegi, bekert.toCharArray())) {
                    System.out.println(rs.getJarmu());
                }
            }
        }

    }

}
