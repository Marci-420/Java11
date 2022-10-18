/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bruh10.pkg07;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author user3
 */
public class Bruh1007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner szam = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Adjon meg egy számot:");
        int szamok = szam.nextInt();
        System.out.println("A számod: " + szamok );
        
       while (!(szamok % 2 == 0 & szamok > 0)) {
           System.out.println(": ");
           szamok = szam.nextInt();
       }
           
           //hátultesztelő :)
        do {
           System.out.println("Adjon meg egy számot:");
          szamok = szam.nextInt();
       }while (!(szamok % 2 == 0 & szamok > 0));
       
        
        //SZÁMKITALÁLÓS játék
        
         
         
        
    
      
        
      
            }
        
          
    } 
    
}
