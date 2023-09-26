/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlbeolv_05_23;

import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.ArrayList;

public class Fajlbeolv_05_23 {
    
    public static int[] leghosszabb(ArrayList<String> userInput) {
        
    //leghosszabb elem, karakterekkel
    int longest = 0;
    int i = 0;
        int legh = 0;
       
        for (String mondas : userInput) {
            if (mondas.length() > legh) {
                legh = mondas.length();
                longest = i;
            }
            i++;
        }
        int[] ret = {longest, legh};
       
        return ret;
    }
   
    public static boolean a_less(ArrayList<String> userInput) {
        //'a' nélküli elemek kiíratása
        int i = 0;
        while (!userInput.get(i).contains("a") && i < (userInput.size() - 1)) {
            i++;
        }
       
        if ((userInput.size() - 1) == i) {
            return false;
        } else {
            return true;
        }
    }
   
    public static int e_finder(String mondas) {
        //e betűk megszámolása
        int e = 0;
       
        for (String betu : mondas.split("")) {
            if ("e".equals(betu)) {
                e++;
            }
        }
       
        return e;
    }
   
    public static int mennyi_e(ArrayList<String> userInput) {
        //az összes sor összes 'e' betűje összesen
        int e = 0;
       
        for (String mondas : userInput) {
            e += e_finder(mondas);
        }
       
        return e;
    }
   
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        ArrayList<String> mondasok = new ArrayList<>();
       
        try {
            raf = new RandomAccessFile("mondasok.txt", "r");
            int db = 0;
            sor = raf.readLine();
           
            while (sor != null) {
                mondasok.add(sor.trim());
                db++;
                sor = raf.readLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
       
        System.out.println("A " + (leghosszabb(mondasok)[0] + 1) + " a leghosszabb mondás a txt-ben, " + leghosszabb(mondasok)[1] + " karakter hosszú.");
        System.out.println(a_less(mondasok));
        System.out.println(e_finder(mondasok.get(0)));
        System.out.println(mennyi_e(mondasok));
    }
   
}
