/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karakter_metodusok;
import static java.lang.Character.isAlphabetic;
import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import java.util.Scanner;
/**
 *
 * @author user3
 */
public class Karakter_metodusok {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner bill = new Scanner(System.in);
        String rendszam = new String();
        
        char kar = 'a';
        //betű-e
        System.out.println(Character.isAlphabetic(kar));
        //szám-e
        System.out.println(Character.isDigit(kar));
        //betű
        System.out.println(Character.isDefined(kar));
        //betű vagy szám-e
        System.out.println(Character.isLetterOrDigit(kar));
        //kisbetűs-e?
        System.out.println(Character.isLowerCase(kar));
        // nagybetűs-e?
        System.out.println(Character.isUpperCase(kar));
        //szóköz-e
        System.out.println(Character.isSpaceChar(kar));
        //
        System.out.println(Character.isWhitespace(kar));
    }
    
}
