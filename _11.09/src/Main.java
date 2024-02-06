import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cipo c = new Cipo("Márka 1", "fekete", 43);
        System.out.println(c);

        final int MAX = 5;
        Cipo[] cipok = new Cipo[MAX];

        Scanner s = new Scanner(System.in);
        System.out.println("Adj meg" + MAX + " cipő adatait!");
        for (int i=0; i<MAX; i++){
            System.out.print("Márka: ");
            String marka = s.next();
            System.out.print("Szín: ");
            String szin = s.next();
            System.out.print("Mérete: ");
            int meret = s.nextInt();

            cipok[i] = new Cipo(marka, szin, meret);

        }

        Cipo max = cipok[0];

        for (int i =1; i<MAX; i++){
            if(max.getMeret() < cipok[i].getMeret()){
                max = cipok[i];
            }
        }
        System.out.println("A legnagyobb cipő adatai: " + max);
    }
}