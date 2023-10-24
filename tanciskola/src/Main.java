import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tancosok> tancok = new ArrayList<>();

        try {
            RandomAccessFile raf = new RandomAccessFile("tancrend.txt", "r");

            String tanc = raf.readLine();
            String man = raf.readLine();
            String woman = raf.readLine();

            while (tanc != null && man != null && woman != null){
                tancok.add(new Tancosok(tanc, man, woman));

                tanc= raf.readLine();
                man = raf.readLine();
                woman = raf.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < tancok.size(); i++){
            System.out.println(tancok.get(i));
        }

        System.out.println("Táncok száma: " + tancok.size());
    }
}
