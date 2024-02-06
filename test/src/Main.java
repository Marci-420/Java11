import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fuzet f = new Fuzet ("sima", "spirál", 4);
        System.out.println(f);




        final int MAX = 3;
        final int STAT = 3;
        Fuzet[] fuzetek = new Fuzet[MAX];
        ArrayList<String> mintazatok = new ArrayList<String>();

        mintazatok.add("vonalas");
        mintazatok.add("sima");
        mintazatok.add("négyzetrácsos");

        ArrayList<String> kotesek = new ArrayList<String>();

        kotesek.add("spirál");
        kotesek.add("fűzött");
        kotesek.add("tűzött");

        int stat[] = new int[STAT];

        Scanner s = new Scanner(System.in);
        System.out.println("Adja meg " + MAX + " füzet adatait: ");
        Fuzet max = null;
        boolean vonalas = false;

        for(int i = 0; i < MAX; i++){
            String mintazat;
            boolean ok;
            do {
                ok= true;
                System.out.println("Mintázat: ");
                 mintazat = s.next();
                if(mintazatok.contains(mintazat)){
                    System.out.println("Helytelen mintázatot adott meg! Helyesek: sima, vonalas, négyzetrácsos");
                }
            }
            while(!ok);



            System.out.println("Kötésmód: ");
            String kotesmod = s.next();

            for(int j=0; j < kotesek.size(); j++){
                if(kotesek.equals(kotesek.get(j))){
                    stat[j]++;
                }
            }

            System.out.println("Vastagság: ");
            int vastagsag = s.nextInt();

            fuzetek[i] = new Fuzet(mintazat, kotesmod, vastagsag);
            if(mintazat.equals("vonalas")){
                vonalas = true;
                max = fuzetek[i];
            }
        }

        if(!vonalas){
            System.out.println("nincs ilyen!");
        }
        else{
            for(int i = 0; i < MAX; i++){
                if( fuzetek[i].getMintazat().equals("vonalas") && fuzetek[i].getVastagsag() > max.getVastagsag()){
                    max = fuzetek[i];
                }
            }
            System.out.println("A legvastagabb füzet adatai: " + max);
        }


        int ossz = 0;
        for(int i = 0; i < MAX; i++){
            ossz += fuzetek[i].getVastagsag();

        }

        double atlag = ossz / MAX;


        System.out.println("A füzetek vastagságának átlaga: " + atlag);
        System.out.println("Statisztika: ");
        for(int j = 0; j < kotesek.size(); j++){
            System.out.println(kotesek.get(j) + ": " + stat[j] + " db");
        }
    }
}