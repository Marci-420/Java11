/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolgozat_check;

/**
 *
 * @author user3
 */
public class Dolgozat_check {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] szamok = new int [] {3,2,15,4,42,3};
         
        // Páratlan számok
        
        int paratlan = 0;
        
        for (int i=0; i<szamok.length; i++) {
            if (szamok[i] % 2 !=0){
                paratlan ++;
            }
        }
        
        System.out.println(paratlan);
        
        //A számok összege
        
        int osszeg = 0;
        
        for (int j=0; j<szamok.length; j++) {
            osszeg += szamok[j];
        }
        System.out.println(osszeg);
        
        //számok 10 és 20 között
        
        int kozott = 0;
        
        
        //legkisebb
        
        int min = szamok[0];
        for (int k=0; k<szamok.length; k++) {
            if (szamok[k]<min){
                min = szamok[k];
            }
        }
        System.out.println(min);
    }
    
}
