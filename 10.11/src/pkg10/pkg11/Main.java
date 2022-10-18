/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.pkg11;


/**
 *
 * @author user3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Hozz létre egy 10 elemű integer tömböt! Generáld le random az elemeit, 1-10 közötti szám
        //-összegezd az elemeit
        //-számláld meg a páros számokat
        // - mekkora a legkisebb
        // - hányadik eleme a listának az első ötnél kisebb szám
        // van-e a számok között néggyel osztható szám?
        
        //tömb és lista
        int[] lista1 = new int[10];
        int Randomsz = (int) (Math.random() * 10) +1;
               System.out.println(Randomsz);
        
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("Az i az: " + i);
            Randomsz = (int) (Math.random() * 10) +1;
            lista1[i] = (Randomsz);
            System.out.println("A jelenlegi random: " + Randomsz);
        }
       
        //Összegzés
        int osszeg = 0;
        for( i = 0; i < lista1.length; i++ ) {
            if( lista1[i] % 2 == 0 ){
                osszeg = osszeg + lista1[i];
            }
        }
 
        System.out.println("A tombben levo paros szamok osszege: "+osszeg);
        
        //páűros számok
        int paross = 0;
        for( i = 0; i < lista1.length; i++ ) {
            if( lista1[i] % 2 == 0 ){
                paross ++;
            }
        }
        System.out.println("Páros számok: "+ paross);
    
        //legkisebb szám
        int min = 0;
        for( i = 1; i < lista1.length; i++ ) {          
            if( lista1[i] < lista1[min] ) min = i;
        }
        
        System.out.println("A tombben levo legkisebb szam: "+lista1[min]);
        
        
        //legnagyobb szám
        int max = 0;
        for( i = 1; i < lista1.length; i++ ) {          
            if( lista1[i] > lista1[max] ) max = i;
        }
        
        System.out.println("A tombben levo legnagyobb szam: "+lista1[max]);
        
       //hányadik elem az első 5-nél kisebb boi
       //feltételezés
        i = 0;
        while (lista1[i] >=5) {
            i++;
        }
       
        //eldöntés
        ii = 0;
        while (i < lista1.length & (lista1[i] % 4 != 0)) {
            ii++;
        }
        
        if (i < lista1.length) {
        System.out.println("Van a számok között 4-gyel osztható");
        
    }
        
}
