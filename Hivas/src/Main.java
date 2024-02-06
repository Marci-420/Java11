import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hivas> hivaslist = new ArrayList<>();

        try {
            RandomAccessFile raf = new RandomAccessFile("HIVASOK.txt", "r");
            String ido = raf.readLine();
            String tel = raf.readLine();

            while (ido != null && tel != null){
                hivaslist.add(new Hivas(ido.split(" "), tel));
                ido = raf.readLine();
                tel= raf.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < hivaslist.size(); i++){
            System.out.println(hivaslist.get(i));
        }
        System.out.println("A hívások száma: " + hivaslist.size());
    }
}
