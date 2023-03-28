   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlbeolvasas_03_28;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author user3
 */
public class Arraylist_in_Arraylist {
     public static void main(String[] args) {
    RandomAccessFile raf;
        String sor;
        ArrayList <Integer> list = new ArrayList();
        
     try
        {
              raf = new RandomAccessFile("adatok.txt", "r");
              
              int db = 0;
              sor = raf.readLine();
              
              //addig fut, amíg a sorban van vmi
              while(sor != null){
                  szamok[db] = Integer.parseInt(sor);             
                  db++;                         
                  sor = raf.readLine();            
              }
              
              raf.close();
        }
        catch(IOException e)
        {
            System.err.println("HIBA");
        }
        
        int osszeg = 0;
        for (int i = 0; i < szamok.length; i++){
            osszeg = osszeg + szamok[i];
        }
        System.out.println(osszeg);
        
        
        
    }
    
}
}
