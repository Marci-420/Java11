/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlbeolv_05_23;

import java.io.RandomAccessFile;
import java.io.IOException;

public class Fajlbeolv_05_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        String[] mondasok = new String[5];

        try {
            raf = new RandomAccessFile("mondas.txt", "r");
            int db = 0;           //számlálót indítok
            sor = raf.readLine(); //elsõ sort beolvasom

            while (sor != null) //addig fusson, amíg a sor nem null
            {
                mondasok[db] = sor;    //a mondaset tartalmazó tömbbe teszi a kiolvasott adatot
                db++;               //számláló növelése (a while NEM növeli)
                sor = raf.readLine(); //beolvasom a következõ sort       
            }

            raf.close();
        } catch (IOException e) {
            System.err.println("HIBA");
        }

        for (int i = 0; i < mondasok.length; i++) {
            System.out.print(mondasok[i] + " ");
        }
    }

}
