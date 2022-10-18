/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adattipusok;

/**
 *
 * @author user3
 */
public class Adattipusok {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // egész számok
        byte homerseklet = 19;
        short magassag = 165;
        int fizetes = 850000;
        long nyeremeny = 2500000000L;
        // valós számok
        float tomeg = 44333.5555555F;
        double ezEgyValosSzam = 75737676.9376564;
        // karakter adattípus
        char egyBetu = 'k';
        char masikBetu = '\u0041'; //a karakter unicode kódja hexadecimálisan
        System.out.println(masikBetu);
        // logikai
        boolean vane = false;
        
        //változók értéeinek kiíratása
        System.out.println(homerseklet);
        System.out.println(magassag);
        System.out.println(fizetes);
        System.out.println(nyeremeny);
        System.out.println(tomeg);
        System.out.println(ezEgyValosSzam);
        System.out.println(egyBetu);
        System.out.println(masikBetu);
        System.out.println(vane);
        
        System.out.println(masikBetu);
        System.out.println((int)masikBetu);
        
        //feladattípusok tartománya
        int byteAlja = Byte.MIN_VALUE;
        int byteTeteje = Byte.MAX_VALUE;
        System.out.println(byteAlja);
        System.out.println(byteTeteje);
        
        System.out.println("A byte adattípus tartománya " + byteAlja + " értéktől " + byteTeteje + " értékig terjed.");
        System.out.println("Az int adattípus tartománya " + Integer.MIN_VALUE + " értéktől " + Integer.MAX_VALUE + " értékig terjed.");
        System.out.println("A short adattípus tartománya " + Short.MIN_VALUE + " értéktől " + Short.MAX_VALUE + " értékig terjed.");
        System.out.println("A long adattípus tartománya " + Long.MIN_VALUE + " értéktől " + Long.MAX_VALUE + " értékig terjed.");
        System.out.println("A float adattípus tartománya " + Float.MIN_VALUE + " értéktől " + Long.MAX_VALUE + " értékig terjed.");
        System.out.println("A double adattípus tartománya " + Double.MIN_VALUE + " értéktől " + Double.MAX_VALUE + " értékig terjed.");
    }
    
}
