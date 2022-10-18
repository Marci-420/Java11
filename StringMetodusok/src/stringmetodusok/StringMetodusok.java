/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmetodusok;

import java.util.Scanner;
/**
 *
 * @author user3
 */
public class StringMetodusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String szoveg  = "Ez egy tetszi szöveg" ;
        
        // szöveg hossza
        System.out.println(szoveg.length());
        
        //adott pozíción levő karakter
        System.out.println(szoveg.charAt(5));
        
        //minden kisbetűs
        System.out.println(szoveg.toLowerCase());
        
        // minden nagybetűs
        System.out.println(szoveg.toUpperCase());
        
        // sorvégi és soreleji szóköz levágások
        System.out.println(szoveg.trim().length());
        
        //összehasonlítás
        System.out.println(szoveg.compareTo("ez egy tetszőleges szöveg"));
        System.out.println(szoveg.compareToIgnoreCase("ez egy tetszőleges szöveg"));
        System.out.println(szoveg.equals("ez egy tetszőleges szöveg"));
        System.out.println(szoveg.equalsIgnoreCase("ez egy tetszőleges szöveg"));
        
        System.out.println(szoveg.endsWith(" "));
        
        System.out.println(szoveg.startsWith(""));
         
        System.out.println(szoveg.indexOf("t"));
        
        System.out.println(szoveg.indexOf("egy"));
        
        System.out.println(szoveg.lastIndexOf("t"));
        
        System.out.println(szoveg.isEmpty());
        String szoveg2 = "";
        System.out.println(szoveg2.isEmpty());
        System.out.println(szoveg.replace("tetszi", "akármilyen"));
        System.out.println(szoveg.replace("e", "b"));
        
        
        Integer szam = 512;
        System.out.println(szam.toString());
        
        System.out.println(szoveg.substring(3));
        
        System.out.println(szoveg.substring(3, 6));
                
        //Kérjük be egy diák teljes nevét a fullName változóba
        
        Scanner bill = new Scanner(System.in);  
        System.out.println("Nevedet légy szíves:");
        String fullName = bill.next() + bill.nextLine() ;
        
       // Szétszedjük a nevet firstName és lastName változókra
        
        System.out.println("A neved tehát: " + fullName );
        String firstName = fullName.split(" ") [0];
        String lastName = fullName.split(" ") [1];
        System.out.println("A vezetékneved: " + firstName + ", a keresztneved: " + lastName);
        
        // Kérjünk be osztályazonosítót a classId változóba 
        
        String classId; 
        System.out.println("Osztályodat légy szíves:");
        classId = bill.nextLine();
        
        // az 'e'-ket 'E'-re átváltjuk
        
        classId= classId.replaceFirst("e", "E");
        System.out.println(classId);
        
        //ha az évfolyam száma 2022-nél kisebb, akkor az oszt. azonosító minden betűje nagy
        
       int evfolyam =(Integer.parseInt(classId.substring(0, 4));
       if (evfolyam < 2022) classId = classId.toUpperCase();
        System.out.println(classId);
       
       
        
        
        
        
        
           
        
        
        
    }
    
}
