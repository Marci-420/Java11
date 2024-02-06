import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> godrok = new ArrayList<Integer>();
        Scanner bill = new Scanner(System.in);

        try {
            RandomAccessFile raf = new RandomAccessFile("melyseg.txt", "r");

            String sor = raf.readLine();
            while (sor != null) {
                godrok.add(Integer.parseInt(sor));
                sor = raf.readLine();
            }

            raf.close();
        } catch (IOException e) {
            System.err.println("Hiba" + e);
        }

        System.out.println("1. feladat");
        System.out.println("Az adatforrás " + godrok.size() + " adatot tartalmaz.");

        System.out.println("\n 2. feladat");
        System.out.print("Adj meg egy távolságértéket: ");
        int input = bill.nextInt();

        if (godrok.get(input-1) == 0){
            System.out.println("„Az adott helyen nincs gödör.”");
        }
        else {
            System.out.println("A gödör mélysége " + godrok.get(input - 1) + " a(z) " + input + ". helyen.");
        }

        System.out.println("\n 3. feladat");
        double zero = 0;
        for (int i=0; i < godrok.size(); i++){
            if(godrok.get(i).equals(0)){
                zero++;
            }
        }
        double vegleges = zero / godrok.size() ;
        System.out.println("A felszín " + String.format("%.2f",vegleges * 100) +  " százaléka maradt érintetlen");


        System.out.println("\n 4. feladat");
        System.out.println("-");

        System.out.println("\n 5. feladat");
        int db = 0;
        for (int i = 0; i < godrok.size(); i++){
            if(godrok.get(i) > 0 && godrok.get(i-1) == 0 ){
                db++;
            }
        }
        System.out.println("Összesen " + db + " darab verem található.");

        System.out.println("\n 6. feladat");
        System.out.print("\n a) ");

        if (godrok.get(input) > 0) {
            int poz = input - 1;
            while (godrok.get(poz) > 0) {
                poz--;
            }

            int kezdet = poz + 2;
            poz = input;
            while (godrok.get(poz) > 0) {
                poz++;
            }

            int vege = poz;
            System.out.println("A gödör kezdete: " + kezdet + " méter, a gödör vége: " + vege + " méter.");

            System.out.print("\n b) ");

            poz = kezdet;
            while (godrok.get(poz) >= godrok.get(poz - 1) && poz <= vege) {
                poz++;
            }
            while (godrok.get(poz) <= godrok.get(poz - 1) && poz <= vege) {
                poz++;
            }
            if (poz > vege) {
                System.out.println("Folyamatosan mélyül.");
            } else {
                System.out.println("Nem mélyül folyamatosan.");
            }

            System.out.print("\n c) ");

            List<Integer> resztombList = godrok.subList(kezdet - 1, vege);
            int[] resztomb = new int[resztombList.size()];
            for (int i = 0; i < resztombList.size(); i++) {
                resztomb[i] = resztombList.get(i);
            }
            int legnagyobbMelyseg = Arrays.stream(resztomb).max().getAsInt();
            System.out.println("A legnagyobb mélysége " + legnagyobbMelyseg + " méter.");

            System.out.print("\n d) ");

            int terfogat = 10 * Arrays.stream(resztomb).sum();
            System.out.println("A térfogata " + terfogat + " m^3.");

            System.out.print("\n e) ");

            int mennyiseg = terfogat - 10 * (vege - kezdet + 1);
            System.out.println("A vizmennyiség " + mennyiseg + " m^3.");
        } else {
            System.out.println("Az adott helyen nincs gödör.");
        }



    }
}
