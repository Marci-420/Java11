/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szemelyi;
import static java.lang.Character.isAlphabetic;
import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import java.util.Scanner;
/**
 *
 * @author user3
 */
public class Szemelyi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        String szemelyi = new String();
        
    do {
        System.out.print("Add meg a személyi igazolványod számát: ");
        szemelyi = bill.nextLine();
    } while (!isValidSzemelyiV2(szemelyi));

    }
        
    public static boolean isValidSzemelyi(String szm) {
        if ((int) szm.charAt(0) >= 65 && (int) szm.charAt(0) <= 90 
         && (int) szm.charAt(1) >= 65 && (int) szm.charAt(1) <= 90 
         && (int) szm.charAt(2) >= 65 && (int) szm.charAt(2) <= 90
         && (int) szm.charAt(3) >= 65 && (int) szm.charAt(3) <= 90
         && (int) szm.charAt(4) >= 65 && (int) szm.charAt(4) <= 90
         && (int) szm.charAt(5) >= 65 && (int) szm.charAt(5) <= 90
         && (int) szm.charAt(6) >= 65 && (int) szm.charAt(5) <= 90
         && (int) szm.charAt(7) >= 65 && (int) szm.charAt(5) <= 90
         && (int) szm.charAt(8) >= 65 && (int) szm.charAt(5) <= 90
         || (int) szm.charAt(0) >= 48 && (int) szm.charAt(0) <= 57
         || (int) szm.charAt(1) >= 48 && (int) szm.charAt(1) <= 57
            (int) szm.charAt(7) >= 65 && (int) szm.charAt(5) <= 90
         && szm.length() == 8) {
        return true;
        } 
        else {
            return false;
        }
      }   
        
    public static boolean isValidSzemelyiV2(String szm) {
        int i;
    if (szm.length() == 7 && isDigit(szm.charAt(0)) &&  isDigit(szm.charAt(4)) && isDigit(szm.charAt(5))
           && isLetter(szm.charAt(0)) && isLetter(szm.charAt(1)) && isLetter(szm.charAt(2))){
       return true;
        } else {
            return false;
    }
    }
}
