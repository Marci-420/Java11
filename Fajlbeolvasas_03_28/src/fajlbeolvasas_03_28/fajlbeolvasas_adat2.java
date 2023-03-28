
package Fajlbeolvasas_03_28;

import java.io.IOException;
import java.io.RandomAccessFile;
/**
 *
 * @author user3
 */
public class fajlbeolvasas_adat2 {
        public static void main(String[] args) {

        RandomAccessFile raf;
        String sor;
        int[] szamok2 = new int[5];
        
        try
        {
              raf = new RandomAccessFile("adatok_zwei.txt", "r");
              
              int db = Integer.parseInt(raf.readLine());
              
              for (int i =0; i <db; i++){
                  sor= raf.readLine();
                  szamok2[i] = Integer.parseInt(sor);
              }
              
              raf.close();
        }
        catch(IOException e)
        {
            System.err.println("HIBA");
        }
        for (int i = 0; i < szamok2.length; i++){
            System.out.println(szamok2[i]);
        }
 
    }
}
    
