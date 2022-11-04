/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rendszam_input;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author user3
 */
public class Rendszam_input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner rendszam = new Scanner(System.in);
        System.out.println("Adj meg egy rendszámot:");
        System.out.println("A rendszámod: ");
        String szam = rendszam.nextLine();

        szam = szam.toUpperCase();
        int lengd = szam.length();

        if (lengd > 6){
        System.out.println("A rendszám nem lehet hosszabb 6 karakternél");
        }
        else{
            System.out.println("A rendszámod: "+szam);
        }
        
        
        Matcher m = Pattern.compile("[a-zA-Z0-9. ]*").matcher(szam);
        if (m.find()) {
            System.out.println(szam + " egy létező rendszám");
        } else {
            System.out.println(szam+ " nem egy létező rendszám");
        }
            
    }
}
