/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szovegmani;

import java.util.Scanner;

public class SzovegMani {

    /**
     * @param args the command line arguments
     * @return 
     */
    
    public static int karakterSzamolas(String szoveg){
        
        int i = 0;
         for( i=0; i < szoveg.length(); i++) {
             i++;
             
         }
         return i;
    }
       
    public static String szovegForditasa(String szoveg) {
        StringBuilder b = new StringBuilder(szoveg);
        StringBuilder fordított = b.reverse();
        
        return fordított.toString();
           
    }
       
    public static boolean isPalindroma(String szoveg) {
    StringBuilder b = new StringBuilder(szoveg);
    StringBuilder fordított = b.reverse();
        if (b.equals(fordított)) {
            return true;
        }
        else {
            return false;
        }

}
    
    public static boolean szovegOsszehasonlitas(String szoveg, String masikSzoveg){
        
    StringBuilder a = new StringBuilder (szoveg);
    StringBuilder b = new StringBuilder (masikSzoveg);
    
        if (szoveg.equals(masikSzoveg)) {
            return true;
        }
        else {
            return false;
        }
    }
      
    
    
    public static String szovegCsere(String szoveg, char csereKarakter, char ujKarakter){
        
    String csereszoveg = szoveg.replace(csereKarakter, ujKarakter);
    return csereszoveg;
        
    }
    
     public static int szoSzamolas(String szoveg){
        int szo = 1;
        
       
            for (int i = 0; i < szoveg.length(); i++) 
            {
                if (szoveg.charAt(i) == ' ') 
                {
                    szo++;
                } 
            }
            return szo;
            
    }
    
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem, adjon meg egy szöveget: ");
        String szoveg = scanner.nextLine();

        // 1. metódus: Számolja meg, hány karakterből áll a szöveg.
        
        int karakterSzam = karakterSzamolas(szoveg);
        System.out.println("A szöveg " + karakterSzam + " karakterből áll.");

        // 2. metódus: Fordítsa meg a szöveget.
        
        String fordítottSzoveg = szovegForditasa(szoveg);
        System.out.println("A szöveg fordítva: " + fordítottSzoveg);

        // 3. metódus: Ellenőrizze, hogy a szöveg palindróma-e.
        
        boolean palindroma = isPalindroma(szoveg);
        if (palindroma) {
            System.out.println("A szöveg palindróma.");
        } else {
            System.out.println("A szöveg nem palindróma.");
        }

        // 4. metódus: Szöveg összehasonlítás
        
        String masikSzoveg = "Ez egy masik szoveg";
        boolean azonos = szovegOsszehasonlitas(szoveg, masikSzoveg);
        if (azonos) {
            System.out.println("A két szöveg azonos.");
        } else {
            System.out.println("A két szöveg nem azonos.");
        }

        
        // 5. metódus: Szöveg cseréje
        
        char csereKarakter = 'e';
        char ujKarakter = 'X';
        String csereltSzoveg = szovegCsere(szoveg, csereKarakter, ujKarakter);
        System.out.println("A szöveg cserélve: " + csereltSzoveg);

        
        // 6. metódus: Szószámoló
        
        int szoSzam = szoSzamolas(szoveg);
        System.out.println("A szövegben " + szoSzam + " szó található."); 
    }

  
}
