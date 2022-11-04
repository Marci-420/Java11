/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmethodgyak;

/**
 *
 * @author user3
 */
public class Stringmethodgyak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String szoveg = "A Diak osztály objektuma (szexuális panda xdd) példányosítás útján jön létre";
       
        int xd = szoveg.indexOf("");
        int xdd = szoveg.indexOf(")");
        String nev = szoveg.substring(xd +1, xdd);
        System.out.println(nev.length());
        System.out.println(nev.trim());
        System.out.println(nev.toUpperCase());
        System.out.println(nev.replace("Alma", "Körte"));
        
        String email = nev.replace( " ", ".").toLowerCase();
        System.out.println(email + ".2020i@bankitatabanya.hu");
        
        String szoveg2 = "Soki lúd disznót győz.";
        
        
        //1
        System.out.println(szoveg2.length());
        //2 
        System.out.println(szoveg2.charAt(0));
        //3
        System.out.println(szoveg2.equals(szoveg2, masikszoveg));
        
        
         int xddd = szoveg2.indexOf(" ");
         System.out.println(szoveg2.substring(xddd));
         
        
               
    }
    
}
