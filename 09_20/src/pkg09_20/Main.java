/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09_20;
import java.util.Scanner;
/**
 *
 * @author user3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        
        // 1. Adj meg egy egész típusú változót kezdőértékkel
        int szam;
        szam = 3;
        System.out.println("A számunk: " + szam );
        
        // 2. Egy for ciklussal a megadott számszor írja ki a program, hogy "Hello!"
        
        
        for(int i=0; i<szam; i++)
            System.out.println("Hello!");
        
        // 3. Írd ki, hogy a megadott szám páros-e vagy páratlan
        
       if (szam % 2 == 0)
            System.out.println("Páros");
       else
            System.out.println("Páratlan");
       
       // 4. Írd ki a számokat egymás mellé tabulátorral elválasztva 0-tól a megadott számig.
        
       for (int i=0; i<= 0; i++) {
            System.out.print(i + "  ");
            
       }
        System.out.println("");
       
       // 5. Írasd ki ugyanezt visszafelé
       
       for (int i = szam; i>= 0; i--){
            System.out.print(i + "  ");
       }
        System.out.println("");
       
       // 6. Írasd ki a tartomány számai közül csak a párosakat hasonló módon.
       
       for (int i = 0; i<= 0; i++){
           if (i % 2 == 0)
               System.out.print(i + "   ");
       }
        System.out.println("");
      
       // 7. Kérj be a felhasználótól egy számot addig, amíg a megadott számot nem írja be.
       
        System.out.print("Kéne egy szám bruh: ");
        int KertSzam;
        KertSzam = bill.nextInt();
        while (KertSzam != szam){
            KertSzam= bill.nextInt();
        }
            
    }
    
}
