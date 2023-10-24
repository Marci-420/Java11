package valasztas;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Valasztas2 {

    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        ArrayList<String> adatok = new ArrayList<>();

        try {
            raf = new RandomAccessFile("szavazatok.txt", "r");
            int db = 0;
            sor = raf.readLine();

            while (sor != null) {
                adatok.add(sor);
                db++;
                sor = raf.readLine();
            }

            raf.close();
        } catch (IOException e) {
            System.out.println("HIBA");
        }
       
        ArrayList<Jelolt> kepviselok = new ArrayList<>();
        for (String adat : adatok) {
            Jelolt ujJelolt = new Jelolt(Integer.parseInt(adat.split(" ")[0]), Integer.parseInt(adat.split(" ")[1]),
                    adat.split(" ")[2], adat.split(" ")[3], adat.split(" ")[4]);
            kepviselok.add(ujJelolt);
        }
       
        //1
        System.out.println("A helyhatósági választáson " + kepviselok.size() + " képviselőjelölt indult.");
       
        //2
        Scanner fVezeteknev = new Scanner(System.in);
        Scanner fKeresztnev = new Scanner(System.in);
        System.out.print("Vezetéknév: ");
        fVezeteknev.nextLine();
        System.out.print("Keresztnév: ");
        fKeresztnev.nextLine();
       
        int rossz = 0;
        for (Jelolt kepviselo : kepviselok) {
            String test = "Ez";
            System.out.println(test.equals(kepviselo.getVezeteknev()));
            if (fVezeteknev.equals(kepviselo.getVezeteknev()) && fKeresztnev.equals(kepviselo.getKeresztnev())) {
                System.out.println(kepviselo.getSzavazat());
            } else if (rossz != (kepviselok.size() - 1)){
                rossz++;
            } else {
                System.out.println("„Ilyen nevű képviselőjelölt nem szerepel a nyilvántartásban!”");
            }
        }
       
    }
   
}