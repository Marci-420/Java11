/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlbeolvasas;

import java.io.*;
import java.io.RandomAccessFile;
public class Fajlbeolvasas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        String[] nevek = new String[11];
        
        try
        {
              raf = new RandomAccessFile("nevek.txt", "r");
              
              int db = 0;
              sor = raf.readLine();
              
              //addig fut, amíg a sorban van vmi
              while(sor != null){
                  nevek[db] = sor;             //a neveket tartalmazó tömbbe teszi a kiolvasott adatot
                  db++;                        //a számláló növelése
                  sor = raf.readLine();        // kövi sor beolvasása
              }
              
              raf.close();
        }
        catch(IOException e)
        {
            System.err.println("HIBA");
        }
         for (int i = 0; i < nevek.length; i++){
        System.out.println(new String(nevek[i]));
         }
    }
    
}
