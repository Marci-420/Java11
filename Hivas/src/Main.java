import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        ArrayList<Feladatok> feladat = new ArrayList<>();

        try {
            RandomAccessFile raf = new RandomAccessFile("felszam.txt", "r");

            String kerdes = raf.readLine();
            String valasz = raf.readLine();


            while ( kerdes!= null && valasz != null){
                feladat.add(new Feladatok(kerdes, valasz));

                kerdes = raf.readLine();
                valasz = raf.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println("A feladatok száma: " + feladat.size());

    }
}