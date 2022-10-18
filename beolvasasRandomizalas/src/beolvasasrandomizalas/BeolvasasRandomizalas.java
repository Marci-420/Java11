/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beolvasasrandomizalas;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class BeolvasasRandomizalas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner bill = new Scanner(System.in);
        
        //adat beolvasás billentyűzetről - egész szám
        System.out.print("Jájj teszo, adjál mán egy számot: ");
        int szam1;
        szam1 = bill.nextInt();
        System.out.println("A beolvasott érték: " + szam1 );
        
        //adat beolvasás billentyűzetről - valós szám
        System.out.print("Kéne egy valós szám is bro: ");
        float szam2;
        szam2 = bill.nextFloat();
        System.out.println("A beolvasott érték: " + szam2 );
        
        //adat beolvasás billentyűzetről - string elem
          System.out.print("Mondjá valamit teso: ");
        String szoveg;
        szoveg = bill.next();
        System.out.println("A beolvasott szöveg: " + szoveg );
        
                                                                                                                                                                  
         
    }
    
}
