import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int szint, csapat, keres;
        ArrayList<Igeny> igenyek = new ArrayList<>();

        try {
            RandomAccessFile file = new RandomAccessFile("igeny.txt", "r");
            szint = Integer.parseInt(file.readLine());
            csapat= Integer.parseInt(file.readLine());
            keres = Integer.parseInt(file.readLine());

            String sor = file.readLine();

            while (sor != null){
                igenyek.add(new Igeny(sor));
                sor = file.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //1. feladat
        System.out.println("„A lift a(z) " + igenyek.get(igenyek.size()-1).getVegSzint() + ". szinten áll az utolsó igény teljesítése után.");

        //2. feladat
        int min= igenyek.get(0).getKiinduloSzint();
        int max = igenyek.get(0).getKiinduloSzint();

        for (int i = 0; i < igenyek.size(); i++){
            if (igenyek.get(i).getVegSzint() > max){
                max= igenyek.get(i).getVegSzint();
            }
            if (igenyek.get(i).getVegSzint() < min){
                min= igenyek.get(i).getVegSzint();
            }
        }

        System.out.println("A legmagasabb szint: " + max);
        System.out.println("A legkisebb szint: " + min);

        //3. feladat
        int upWithPassengers = 0;
        int upWithoutPassengers = 0;

        for (int i = 1; i < igenyek.size(); i++){
            Igeny ig = igenyek.get(i);
            Igeny igMinus = igenyek.get(i-1);

            if (ig.getKiinduloSzint() > igMinus.getVegSzint()){
                upWithoutPassengers++;
            }
            if (ig.getVegSzint() > ig.getKiinduloSzint()){
                upWithPassengers++;
            }
        }

        System.out.println("A lift utasokkal " + upWithPassengers + " alkalommal ment felfelé.");
        System.out.println("A lift utasok nélkül " + upWithoutPassengers + " alkalommal ment felfelé.");

    }
}