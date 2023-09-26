/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package novenyek_objektum;

import java.io.RandomAccessFile;
import java.io.IOException;

public class Novenyek_objektum {

    
    public static void main(String[] args) {

        
    RandomAccessFile raf;
        String sor; 
        try
        {
            raf = new RandomAccessFile("noveny.txt", "r");
            sor = raf.readLine();
            String adatok[] = sor.split(", ");
            Noveny muskatli = new Noveny(adatok);
            System.out.println(muskatli.getMagassag());

            raf.close();
   
        }
        catch(IOException e)
        {
            System.out.println("HIBA" + e);
        }
       

    }

}
