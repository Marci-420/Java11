/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package osztalyoksz;

import java.io.RandomAccessFile;
import java.io.IOException;

public class Osztalyoksz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Kutya buksiKutya = new Kutya("Buksi", "tacskó", "barna", 5);
        Kutya bodriKutya = new Kutya("Bodri", "puli", "fekete", 8);

        System.out.println(buksiKutya.getFajta());
        buksiKutya.ugat();



        //fájlbeolvasás
        RandomAccessFile raf;
        String sor; 
        try
        {
            raf = new RandomAccessFile("kutyak.txt", "r");
            sor = raf.readLine();
            String adat[] = sor.split(", ");

            Kutya cezarKutya = new Kutya(adat[0], adat[1], adat[2], Integer.parseInt(adat[3]));
            
            cezarKutya.ugat();
   
        }
        catch(IOException e)
        {
            System.out.println("HIBA" + e);
        }




        
        
   }
}
