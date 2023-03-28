/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlbeolvasas_szamok;

import java.io.*;
public class Fajlbeolvasas_szamok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        int[] szamok = new int[7];
        
        try
        {
              raf = new RandomAccessFile("szamok.txt", "r");
              
              int db = 0;
              sor = raf.readLine();
              
              //addig fut, amíg a sorban van vmi
              while(sor != null){
                  szamok[db] = Integer.parseInt(sor);             //a neveket tartalmazó tömbbe teszi a kiolvasott adatot
                  db++;                         //a számláló növelése
                  sor = raf.readLine();             // kövi sor beolvasása
              }
              
              raf.close();
        }
        catch(IOException e)
        {
            System.err.println("HIBA");
        }
        for (int i = 0; i < szamok.length; i++){
            System.out.println(szamok[i]);
        }
        
        
        
        
    }
    
}
