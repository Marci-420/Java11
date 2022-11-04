/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogajav;

/**
 *
 * @author user3
 */
public class Dogajav {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String szoveg2 = "Soki lúd disznót győz.";
        //1
        System.out.println(szoveg2.length());
        //2 
        System.out.println(szoveg2.charAt(0));
        //3
        System.out.println(szoveg2.equals(szoveg2, masikszoveg));
        //4
        System.out.println(szoveg2.contains("lúd"));
        //5
        System.out.println(szoveg2.indexOf("lúd"));
        //6
        System.out.println(szoveg2.replace("lúd", "veréb"));
        //7
        int xddd = szoveg2.indexOf(" ");
        System.out.println(szoveg2.substring(xddd));
    }
    
}
