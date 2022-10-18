/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkkt;

import java.util.Scanner;
/**
 *
 * @author user3
 */
public class LKKT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Kérjünk be pozitív egész számokat, majd számoljuk ki a legkisebb közös többszöröst.
        
        Scanner readme = new Scanner(System.in);
        System.out.println ("Adj meg két pozitív egész számot(nyomj entert a két szám közé:");
        //két változó bevezetése
        int n1, n2;
        n1 = readme.nextInt();
        n2 = readme.nextInt();
        
        int elso = Math.abs(n1);
        int masodik = Math.abs(n2);
        int legnagyobb = Math.max( elso, masodik);
        int legkisebb = Math.min(elso,masodik);
        int lcm = legnagyobb;
        while (lcm % legkisebb != 0) {
            lcm += legnagyobb;
    }
        System.out.println("A legkisebb közös többszörös: " + lcm);
        
        
        
    }
    
}
